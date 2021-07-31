package typings.tempy

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.DataView
import typings.tempy.mod.DirectoryOptions
import typings.tempy.mod.FileOptions
import typings.tempy.mod.TaskCallback
import typings.typeFest.basicMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
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
    def apply(): String = js.native
    def apply(options: FileOptions): String = js.native
    
    /**
    		The `callback` resolves with a temporary file path you can write to. The file is automatically cleaned up after the callback is executed.
    		@returns A promise that resolves after the callback is executed and the file is cleaned up.
    		@example
    		```
    		import tempy = require('tempy');
    		await tempy.file.task(tempFile => {
    			console.log(tempFile);
    			//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/4f504b9edb5ba0e89451617bf9f971dd'
    		});
    		```
    		*/
    def task[ReturnValueType](callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = js.native
  }
  
  @js.native
  trait CallTask extends StObject {
    
    /**
    		Write data to a random temp file.
    		@example
    		```
    		import tempy = require('tempy');
    		await tempy.write('🦄');
    		//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/2f3d094aec2cb1b93bb0f4cffce5ebd6'
    		```
    		*/
    def apply(fileContent: String): js.Promise[String] = js.native
    def apply(fileContent: String, options: FileOptions): js.Promise[String] = js.native
    def apply(fileContent: Buffer): js.Promise[String] = js.native
    def apply(fileContent: Buffer, options: FileOptions): js.Promise[String] = js.native
    def apply(fileContent: ReadableStream): js.Promise[String] = js.native
    def apply(fileContent: ReadableStream, options: FileOptions): js.Promise[String] = js.native
    def apply(fileContent: DataView): js.Promise[String] = js.native
    def apply(fileContent: DataView, options: FileOptions): js.Promise[String] = js.native
    def apply(fileContent: TypedArray): js.Promise[String] = js.native
    def apply(fileContent: TypedArray, options: FileOptions): js.Promise[String] = js.native
    
    /**
    		Write data to a random temp file. The file is automatically cleaned up after the callback is executed.
    		@returns A promise that resolves after the callback is executed and the file is cleaned up.
    		@example
    		```
    		import tempy = require('tempy');
    		await tempy.write.task('🦄', tempFile => {
    			//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/4f504b9edb5ba0e89451617bf9f971dd'
    		});
    		```
    		*/
    def task[ReturnValueType](fileContent: String, callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](fileContent: String, callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](fileContent: Buffer, callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](fileContent: Buffer, callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](fileContent: ReadableStream, callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](fileContent: ReadableStream, callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](fileContent: DataView, callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](fileContent: DataView, callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](fileContent: TypedArray, callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](fileContent: TypedArray, callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = js.native
  }
  
  trait Extension extends StObject {
    
    /**
    			File extension.
    			Mutually exclusive with the `name` option.
    			_You usually won't need this option. Specify it only when actually needed._
    			*/
    val `extension`: js.UndefOr[String] = js.undefined
  }
  object Extension {
    
    @scala.inline
    def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    /**
    			Filename.
    			Mutually exclusive with the `extension` option.
    			_You usually won't need this option. Specify it only when actually needed._
    			*/
    val name: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait Task extends StObject {
    
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
    def apply(): String = js.native
    def apply(options: DirectoryOptions): String = js.native
    
    /**
    		The `callback` resolves with a temporary directory path you can write to. The directory is automatically cleaned up after the callback is executed.
    		@returns A promise that resolves after the callback is executed and the directory is cleaned up.
    		@example
    		```
    		import tempy = require('tempy');
    		await tempy.directory.task(tempDirectory => {
    			//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/2f3d094aec2cb1b93bb0f4cffce5ebd6'
    		})
    		```
    		*/
    def task[ReturnValueType](callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = js.native
    def task[ReturnValueType](callback: TaskCallback[ReturnValueType], options: DirectoryOptions): js.Promise[ReturnValueType] = js.native
  }
}
