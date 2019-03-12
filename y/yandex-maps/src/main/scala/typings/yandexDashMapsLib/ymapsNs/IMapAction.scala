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
    begin: yandexDashMapsLib.ymapsNs.mapNs.actionNs.Manager => scala.Unit,
    end: () => scala.Unit,
    events: IEventManager
  ): IMapAction = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), events = events)
  
    __obj.asInstanceOf[IMapAction]
  }
}

