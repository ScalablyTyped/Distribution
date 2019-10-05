package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeTriggerFactory extends js.Object {
  def create(freshnessTime: Double, oneShot: Boolean): TimeTrigger
}

object ITimeTriggerFactory {
  @scala.inline
  def apply(create: (Double, Boolean) => TimeTrigger): ITimeTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[ITimeTriggerFactory]
  }
}

