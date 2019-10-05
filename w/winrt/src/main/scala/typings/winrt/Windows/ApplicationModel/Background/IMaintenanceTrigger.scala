package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaintenanceTrigger extends IBackgroundTrigger {
  var freshnessTime: Double
  var oneShot: Boolean
}

object IMaintenanceTrigger {
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): IMaintenanceTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime, oneShot = oneShot)
  
    __obj.asInstanceOf[IMaintenanceTrigger]
  }
}

