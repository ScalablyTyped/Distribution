package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrTransparencyChar extends js.Object {
  var attr: scala.Double | terminalDashKitLib.screenBufferMod.Attributes
  var transparencyChar: java.lang.String
  var transparencyType: scala.Double
}

object Anon_AttrTransparencyChar {
  @scala.inline
  def apply(
    attr: scala.Double | terminalDashKitLib.screenBufferMod.Attributes,
    transparencyChar: java.lang.String,
    transparencyType: scala.Double
  ): Anon_AttrTransparencyChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], transparencyChar = transparencyChar, transparencyType = transparencyType)
  
    __obj.asInstanceOf[Anon_AttrTransparencyChar]
  }
}

