package typings.terminalKit

import typings.terminalKit.screenBufferHDMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttrCharAttributes extends js.Object {
  var attr: Attributes | Double
  var char: js.UndefOr[String] = js.undefined
}

object AnonAttrCharAttributes {
  @scala.inline
  def apply(attr: Attributes | Double, char: String = null): AnonAttrCharAttributes = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrCharAttributes]
  }
}

