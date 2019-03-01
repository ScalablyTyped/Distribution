package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: winrtLib.WindowsNs.UINs.TextNs.TabAlignment
  var leader: winrtLib.WindowsNs.UINs.TextNs.TabLeader
  var position: scala.Double
}

object Anon_Align {
  @scala.inline
  def apply(
    align: winrtLib.WindowsNs.UINs.TextNs.TabAlignment,
    leader: winrtLib.WindowsNs.UINs.TextNs.TabLeader,
    position: scala.Double
  ): Anon_Align = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("align")(align)
    __obj.updateDynamic("leader")(leader)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Align]
  }
}

