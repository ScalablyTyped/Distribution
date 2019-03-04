package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeTriggerFactory extends js.Object {
  def create(freshnessTime: scala.Double, oneShot: scala.Boolean): TimeTrigger
}

object ITimeTriggerFactory {
  @scala.inline
  def apply(create: js.Function2[scala.Double, scala.Boolean, TimeTrigger]): ITimeTriggerFactory = {
    val __obj = js.Dynamic.literal(create = create)
  
    __obj.asInstanceOf[ITimeTriggerFactory]
  }
}

