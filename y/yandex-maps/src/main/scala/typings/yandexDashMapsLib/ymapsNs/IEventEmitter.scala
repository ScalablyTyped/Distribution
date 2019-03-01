package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventEmitter extends js.Object {
  var events: IEventManager
}

object IEventEmitter {
  @scala.inline
  def apply(events: IEventManager): IEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[IEventEmitter]
  }
}

