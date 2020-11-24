package typings.termImg.mod

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("term-img", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Get the image as a `string` that you can log manually.
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
  def apply[FallbackType](image: String): String | FallbackType = js.native
  def apply[FallbackType](image: String, options: Options[FallbackType]): String | FallbackType = js.native
  def apply[FallbackType](image: Buffer): String | FallbackType = js.native
  def apply[FallbackType](image: Buffer, options: Options[FallbackType]): String | FallbackType = js.native
  
  var UnsupportedTerminalError: Instantiable0[UnsupportedTerminalErrorClass] = js.native
}
