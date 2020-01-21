package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_setClipboard")
@js.native
object GMSetClipboard extends js.Object {
  /**
    * Copies data into the clipboard.
    * The parameter 'info' can be an object like
    * `{ type: 'text', mimetype: 'text/plain'}` or just a string expressing the
    * type ("text" or "html").
    */
  def apply(data: String): Unit = js.native
  def apply(data: String, info: String): Unit = js.native
  def apply(data: String, info: AnonMimetype): Unit = js.native
}

