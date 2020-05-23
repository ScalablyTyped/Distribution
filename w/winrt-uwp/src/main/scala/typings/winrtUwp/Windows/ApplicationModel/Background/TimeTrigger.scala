package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a time event that triggers a background task to run. */
trait TimeTrigger extends js.Object {
  /** Gets the interval of a time event trigger. */
  var freshnessTime: Double
  /** Gets whether the time event trigger will be used only once or each time the FreshnessTime interval elapses. */
  var oneShot: Boolean
}

object TimeTrigger {
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): TimeTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeTrigger]
  }
}

