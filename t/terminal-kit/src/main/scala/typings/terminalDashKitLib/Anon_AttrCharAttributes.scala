package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrCharAttributes extends js.Object {
  var attr: terminalDashKitLib.screenBufferHDMod.Attributes | scala.Double
  var char: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AttrCharAttributes {
  @scala.inline
  def apply(
    attr: terminalDashKitLib.screenBufferHDMod.Attributes | scala.Double,
    char: java.lang.String = null
  ): Anon_AttrCharAttributes = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char)
    __obj.asInstanceOf[Anon_AttrCharAttributes]
  }
}

