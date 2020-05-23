package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a maintenance trigger. */
trait MaintenanceTrigger extends js.Object {
  /** Gets the interval of a maintenance trigger. */
  var freshnessTime: Double
  /** Gets whether the maintenance trigger is used only once or each time the FreshnessTime interval elapses. */
  var oneShot: Boolean
}

object MaintenanceTrigger {
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): MaintenanceTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceTrigger]
  }
}

