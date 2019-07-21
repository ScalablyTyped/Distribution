package typings
package termDashImgLib.termDashImgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("term-img", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var UnsupportedTerminalError: org.scalablytyped.runtime.Instantiable0[UnsupportedTerminalErrorClass] = js.native
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
  def apply(image: java.lang.String): scala.Unit = js.native
  def apply(image: java.lang.String, options: Options[_]): scala.Unit = js.native
  def apply(image: nodeLib.Buffer): scala.Unit = js.native
  def apply(image: nodeLib.Buffer, options: Options[_]): scala.Unit = js.native
  /**
  	Get the image as a `string` that you can log manually.
  	@param image - Filepath to an image or an image as a buffer.
  	*/
  def string[FallbackType](image: java.lang.String): java.lang.String | FallbackType = js.native
  def string[FallbackType](image: java.lang.String, options: Options[FallbackType]): java.lang.String | FallbackType = js.native
  def string[FallbackType](image: nodeLib.Buffer): java.lang.String | FallbackType = js.native
  def string[FallbackType](image: nodeLib.Buffer, options: Options[FallbackType]): java.lang.String | FallbackType = js.native
}

