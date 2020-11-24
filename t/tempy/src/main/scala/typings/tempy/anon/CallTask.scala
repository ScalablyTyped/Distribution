package typings.tempy.anon

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.DataView
import typings.tempy.mod.FileOptions
import typings.tempy.mod.TaskCallback
import typings.typeFest.basicMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallTask extends js.Object {
  
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
