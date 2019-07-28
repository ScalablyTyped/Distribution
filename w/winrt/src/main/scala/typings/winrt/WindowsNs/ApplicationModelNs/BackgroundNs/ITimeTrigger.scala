package typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs

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
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime, oneShot = oneShot)
  
    __obj.asInstanceOf[ITimeTrigger]
  }
}

