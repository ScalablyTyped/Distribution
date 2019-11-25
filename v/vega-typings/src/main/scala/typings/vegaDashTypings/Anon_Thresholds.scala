package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Thresholds extends js.Object {
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
}

object Anon_Thresholds {
  @scala.inline
  def apply(thresholds: (js.Array[Double | SignalRef]) | SignalRef = null): Anon_Thresholds = {
    val __obj = js.Dynamic.literal()
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Thresholds]
  }
}

