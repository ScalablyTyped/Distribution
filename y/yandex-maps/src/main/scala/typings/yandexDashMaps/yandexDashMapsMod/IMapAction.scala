package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsMod.mapNs.actionNs.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapAction extends IEventEmitter {
  def begin(mapActionManager: Manager): Unit
  def end(): Unit
}

object IMapAction {
  @scala.inline
  def apply(begin: Manager => Unit, end: () => Unit, events: IEventManager): IMapAction = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), events = events)
  
    __obj.asInstanceOf[IMapAction]
  }
}

