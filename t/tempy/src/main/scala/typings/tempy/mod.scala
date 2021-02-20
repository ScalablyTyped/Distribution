package typings.tempy

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.DataView
import typings.tempy.anon.Call
import typings.tempy.anon.CallTask
import typings.tempy.anon.Extension
import typings.tempy.anon.Name
import typings.tempy.anon.Task
import typings.typeFest.basicMod.TypedArray
import typings.typeFest.mergeExclusiveMod.MergeExclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tempy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		Get a temporary directory path. The directory is created for you.
  		@example
  		```
  		import tempy = require('tempy');
  		tempy.directory();
  		//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/2f3d094aec2cb1b93bb0f4cffce5ebd6'
  		tempy.directory({prefix: 'a'});
  		//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/name_3c085674ad31223b9653c88f725d6b41'
  		```
  		*/
  @JSImport("tempy", "directory")
  @js.native
  def directory(): String = js.native
  @JSImport("tempy", "directory")
  @js.native
  def directory(options: DirectoryOptions): String = js.native
  @JSImport("tempy", "directory")
  @js.native
  def directory_Fmod: Task = js.native
  
  @scala.inline
  def directory_Fmod_=(x: Task): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directory")(x.asInstanceOf[js.Any])
  
  /**
  		Get a temporary file path you can write to.
  		@example
  		```
  		import tempy = require('tempy');
  		tempy.file();
  		//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/4f504b9edb5ba0e89451617bf9f971dd'
  		tempy.file({extension: 'png'});
  		//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/a9fb0decd08179eb6cf4691568aa2018.png'
  		tempy.file({name: 'unicorn.png'});
  		//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/f7f62bfd4e2a05f1589947647ed3f9ec/unicorn.png'
  		tempy.directory();
  		//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/2f3d094aec2cb1b93bb0f4cffce5ebd6'
  		```
  		*/
  @JSImport("tempy", "file")
  @js.native
  def file(): String = js.native
  @JSImport("tempy", "file")
  @js.native
  def file(options: FileOptions): String = js.native
  @JSImport("tempy", "file")
  @js.native
  def file_Fmod: Call = js.native
  
  @scala.inline
  def file_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file")(x.asInstanceOf[js.Any])
  
  /**
  	Get the root temporary directory path.
  	For example: `/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T`.
  	*/
  @JSImport("tempy", "root")
  @js.native
  val root: String = js.native
  
  @JSImport("tempy", "write")
  @js.native
  def write: CallTask = js.native
  /**
  		Write data to a random temp file.
  		@example
  		```
  		import tempy = require('tempy');
  		await tempy.write('🦄');
  		//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/2f3d094aec2cb1b93bb0f4cffce5ebd6'
  		```
  		*/
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: String): js.Promise[String] = js.native
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: String, options: FileOptions): js.Promise[String] = js.native
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: Buffer): js.Promise[String] = js.native
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: Buffer, options: FileOptions): js.Promise[String] = js.native
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: ReadableStream): js.Promise[String] = js.native
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: ReadableStream, options: FileOptions): js.Promise[String] = js.native
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: DataView): js.Promise[String] = js.native
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: DataView, options: FileOptions): js.Promise[String] = js.native
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: TypedArray): js.Promise[String] = js.native
  @JSImport("tempy", "write")
  @js.native
  def write(fileContent: TypedArray, options: FileOptions): js.Promise[String] = js.native
  
  /**
  	Synchronously write data to a random temp file.
  	@example
  	```
  	import tempy = require('tempy');
  	tempy.writeSync('🦄');
  	//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/2f3d094aec2cb1b93bb0f4cffce5ebd6'
  	```
  	*/
  @JSImport("tempy", "writeSync")
  @js.native
  def writeSync(fileContent: String): String = js.native
  @JSImport("tempy", "writeSync")
  @js.native
  def writeSync(fileContent: String, options: FileOptions): String = js.native
  @JSImport("tempy", "writeSync")
  @js.native
  def writeSync(fileContent: Buffer): String = js.native
  @JSImport("tempy", "writeSync")
  @js.native
  def writeSync(fileContent: Buffer, options: FileOptions): String = js.native
  @JSImport("tempy", "writeSync")
  @js.native
  def writeSync(fileContent: DataView): String = js.native
  @JSImport("tempy", "writeSync")
  @js.native
  def writeSync(fileContent: DataView, options: FileOptions): String = js.native
  @JSImport("tempy", "writeSync")
  @js.native
  def writeSync(fileContent: TypedArray): String = js.native
  @JSImport("tempy", "writeSync")
  @js.native
  def writeSync(fileContent: TypedArray, options: FileOptions): String = js.native
  
  @scala.inline
  def write_=(x: CallTask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("write")(x.asInstanceOf[js.Any])
  
  @js.native
  trait DirectoryOptions extends StObject {
    
    /**
    		_You usually won't need this option. Specify it only when actually needed._
    		Directory prefix.
    		Useful for testing by making it easier to identify cache directories that are created.
    		*/
    val prefix: js.UndefOr[String] = js.native
  }
  object DirectoryOptions {
    
    @scala.inline
    def apply(): DirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryOptions]
    }
    
    @scala.inline
    implicit class DirectoryOptionsMutableBuilder[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type FileOptions = MergeExclusive[Extension, Name]
  
  /**
  	The temporary path created by the function. Can be asynchronous.
  	*/
  type TaskCallback[ReturnValueType] = js.Function1[/* tempPath */ String, js.Promise[ReturnValueType] | ReturnValueType]
}
