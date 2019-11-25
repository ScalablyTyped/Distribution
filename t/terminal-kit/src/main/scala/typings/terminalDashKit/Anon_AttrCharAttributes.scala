package typings.terminalDashKit

import typings.terminalDashKit.screenBufferHDMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrCharAttributes extends js.Object {
  var attr: Attributes | Double
  var char: js.UndefOr[String] = js.undefined
}

object Anon_AttrCharAttributes {
  @scala.inline
  def apply(attr: Attributes | Double, char: String = null): Anon_AttrCharAttributes = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttrCharAttributes]
  }
}

