package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Shrink extends js.Object {
  var shrink: js.UndefOr[Anon_HeightWidth] = js.undefined
}

object Anon_Shrink {
  @scala.inline
  def apply(shrink: Anon_HeightWidth = null): Anon_Shrink = {
    val __obj = js.Dynamic.literal()
    if (shrink != null) __obj.updateDynamic("shrink")(shrink)
    __obj.asInstanceOf[Anon_Shrink]
  }
}

