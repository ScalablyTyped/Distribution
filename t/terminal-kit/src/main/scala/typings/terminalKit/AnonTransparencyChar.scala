package typings.terminalKit

import typings.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransparencyChar extends js.Object {
  var attr: Double | Attributes
  var transparencyChar: String
  var transparencyType: Double
}

object AnonTransparencyChar {
  @scala.inline
  def apply(attr: Double | Attributes, transparencyChar: String, transparencyType: Double): AnonTransparencyChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], transparencyChar = transparencyChar.asInstanceOf[js.Any], transparencyType = transparencyType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTransparencyChar]
  }
}

