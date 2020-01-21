package typings.termImg.mod

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("term-img", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var UnsupportedTerminalError: Instantiable0[UnsupportedTerminalErrorClass] = js.native
  /**
  	Log the image to the terminal directly.
  	@param image - Filepath to an image or an image as a buffer.
  	@example
  	```
  	import termImg = require('term-img');
  	function fallback() {
  		// Do something else when not supported
  	}
  	termImg('unicorn.jpg', {fallback});
  	```
  	*/
  def apply(image: String): Unit = js.native
  def apply(image: String, options: Options[_]): Unit = js.native
  def apply(image: Buffer): Unit = js.native
  def apply(image: Buffer, options: Options[_]): Unit = js.native
  /**
  	Get the image as a `string` that you can log manually.
  	@param image - Filepath to an image or an image as a buffer.
  	*/
  def string[FallbackType](image: String): String | FallbackType = js.native
  def string[FallbackType](image: String, options: Options[FallbackType]): String | FallbackType = js.native
  def string[FallbackType](image: Buffer): String | FallbackType = js.native
  def string[FallbackType](image: Buffer, options: Options[FallbackType]): String | FallbackType = js.native
}

