package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeTrigger extends IBackgroundTrigger {
  var freshnessTime: Double
  var oneShot: Boolean
}

object ITimeTrigger {
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): ITimeTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeTrigger]
  }
}

