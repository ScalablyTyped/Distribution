package typings.tempy.anon

import typings.tempy.mod.FileOptions
import typings.tempy.mod.TaskCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
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
