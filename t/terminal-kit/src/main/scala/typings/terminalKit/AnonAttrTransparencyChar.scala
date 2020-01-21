package typings.terminalKit

import typings.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttrTransparencyChar extends js.Object {
  var attr: Double | Attributes
  var transparencyChar: String
  var transparencyType: Double
}

object AnonAttrTransparencyChar {
  @scala.inline
  def apply(attr: Double | Attributes, transparencyChar: String, transparencyType: Double): AnonAttrTransparencyChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], transparencyChar = transparencyChar.asInstanceOf[js.Any], transparencyType = transparencyType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttrTransparencyChar]
  }
}

