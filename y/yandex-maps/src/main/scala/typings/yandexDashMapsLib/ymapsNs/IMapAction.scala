package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapAction extends IEventEmitter {
  def begin(mapActionManager: yandexDashMapsLib.ymapsNs.mapNs.actionNs.Manager): scala.Unit
  def end(): scala.Unit
}

object IMapAction {
  @scala.inline
  def apply(
    begin: js.Function1[yandexDashMapsLib.ymapsNs.mapNs.actionNs.Manager, scala.Unit],
    end: js.Function0[scala.Unit],
    events: IEventManager
  ): IMapAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("begin")(begin)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[IMapAction]
  }
}

