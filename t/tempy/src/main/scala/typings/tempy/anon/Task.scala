package typings.tempy.anon

import typings.tempy.mod.DirectoryOptions
import typings.tempy.mod.TaskCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends js.Object {
  
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
