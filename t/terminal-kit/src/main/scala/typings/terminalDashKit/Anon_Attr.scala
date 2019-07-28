package typings.terminalDashKit

import typings.terminalDashKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attr extends js.Object {
  var attr: Attributes | Double
  var char: js.UndefOr[String] = js.undefined
}

object Anon_Attr {
  @scala.inline
  def apply(attr: Attributes | Double, char: String = null): Anon_Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char)
    __obj.asInstanceOf[Anon_Attr]
  }
}

