package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrChar extends js.Object {
  var attr: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Attributes | scala.Double
  var char: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AttrChar {
  @scala.inline
  def apply(
    attr: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Attributes | scala.Double,
    char: java.lang.String = null
  ): Anon_AttrChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char)
    __obj.asInstanceOf[Anon_AttrChar]
  }
}

