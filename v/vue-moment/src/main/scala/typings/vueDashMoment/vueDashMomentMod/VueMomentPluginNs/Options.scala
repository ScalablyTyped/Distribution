package typings.vueDashMoment.vueDashMomentMod.VueMomentPluginNs

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // The optional (self-maintained) moment instance
  var moment: js.UndefOr[Moment] = js.undefined
}

object Options {
  @scala.inline
  def apply(moment: Moment = null): Options = {
    val __obj = js.Dynamic.literal()
    if (moment != null) __obj.updateDynamic("moment")(moment)
    __obj.asInstanceOf[Options]
  }
}

