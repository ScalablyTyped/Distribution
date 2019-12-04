package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webdriverio.webdriverioStrings.width
  - typings.webdriverio.webdriverioStrings.height
*/
trait SizeParam extends js.Object

object SizeParam {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def height: typings.webdriverio.webdriverioStrings.height = this.cast("height")
  @scala.inline
  def width: typings.webdriverio.webdriverioStrings.width = this.cast("width")
}

