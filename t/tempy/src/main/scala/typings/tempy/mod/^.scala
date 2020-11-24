package typings.tempy.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.DataView
import typings.tempy.anon.Call
import typings.tempy.anon.CallTask
import typings.tempy.anon.Task
import typings.typeFest.basicMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tempy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def directory(): String = js.native
  def directory(options: DirectoryOptions): String = js.native
  @JSName("directory")
  var directory_Original: Task = js.native
  
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
  def file(): String = js.native
  def file(options: FileOptions): String = js.native
  @JSName("file")
  var file_Original: Call = js.native
  
  /**
  	Get the root temporary directory path.
  	For example: `/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T`.
  	*/
  val root: String = js.native
  
  /**
  		Write data to a random temp file.
  		@example
  		```
  		import tempy = require('tempy');
  		await tempy.write('🦄');
  		//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/2f3d094aec2cb1b93bb0f4cffce5ebd6'
  		```
  		*/
  def write(fileContent: String): js.Promise[String] = js.native
  def write(fileContent: String, options: FileOptions): js.Promise[String] = js.native
  def write(fileContent: Buffer): js.Promise[String] = js.native
  def write(fileContent: Buffer, options: FileOptions): js.Promise[String] = js.native
  def write(fileContent: ReadableStream): js.Promise[String] = js.native
  def write(fileContent: ReadableStream, options: FileOptions): js.Promise[String] = js.native
  def write(fileContent: DataView): js.Promise[String] = js.native
  def write(fileContent: DataView, options: FileOptions): js.Promise[String] = js.native
  def write(fileContent: TypedArray): js.Promise[String] = js.native
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
  def writeSync(fileContent: String): String = js.native
  def writeSync(fileContent: String, options: FileOptions): String = js.native
  def writeSync(fileContent: Buffer): String = js.native
  def writeSync(fileContent: Buffer, options: FileOptions): String = js.native
  def writeSync(fileContent: DataView): String = js.native
  def writeSync(fileContent: DataView, options: FileOptions): String = js.native
  def writeSync(fileContent: TypedArray): String = js.native
  def writeSync(fileContent: TypedArray, options: FileOptions): String = js.native
  
  @JSName("write")
  var write_Original: CallTask = js.native
}
