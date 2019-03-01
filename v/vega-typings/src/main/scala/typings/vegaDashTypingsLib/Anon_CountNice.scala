package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountNice extends js.Object {
  var count: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var nice: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
}

object Anon_CountNice {
  @scala.inline
  def apply(
    count: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    nice: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): Anon_CountNice = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CountNice]
  }
}

