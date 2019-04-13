package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attr extends js.Object {
  var attr: terminalDashKitLib.screenBufferMod.Attributes | scala.Double
  var char: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Attr {
  @scala.inline
  def apply(attr: terminalDashKitLib.screenBufferMod.Attributes | scala.Double, char: java.lang.String = null): Anon_Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char)
    __obj.asInstanceOf[Anon_Attr]
  }
}

