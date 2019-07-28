package typings.terminalDashKit

import typings.terminalDashKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrTransparencyChar extends js.Object {
  var attr: Double | Attributes
  var transparencyChar: String
  var transparencyType: Double
}

object Anon_AttrTransparencyChar {
  @scala.inline
  def apply(attr: Double | Attributes, transparencyChar: String, transparencyType: Double): Anon_AttrTransparencyChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], transparencyChar = transparencyChar, transparencyType = transparencyType)
  
    __obj.asInstanceOf[Anon_AttrTransparencyChar]
  }
}

