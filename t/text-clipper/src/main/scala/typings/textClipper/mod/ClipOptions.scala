package typings.textClipper.mod

import typings.textClipper.textClipperBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.textClipper.mod.ClipPlainTextOptions
  - typings.textClipper.mod.ClipHtmlOptions
*/
trait ClipOptions extends js.Object

object ClipOptions {
  @scala.inline
  def ClipPlainTextOptions(): ClipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipOptions]
  }
  @scala.inline
  def ClipHtmlOptions(html: `true`): ClipOptions = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipOptions]
  }
}

