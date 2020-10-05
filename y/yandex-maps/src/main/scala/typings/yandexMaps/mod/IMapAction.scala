package typings.yandexMaps.mod

import typings.yandexMaps.mod.map.action.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapAction extends IEventEmitter {
  def begin(mapActionManager: Manager): Unit = js.native
  def end(): Unit = js.native
}

object IMapAction {
  @scala.inline
  def apply(begin: Manager => Unit, end: () => Unit, events: IEventManager): IMapAction = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapAction]
  }
  @scala.inline
  implicit class IMapActionOps[Self <: IMapAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBegin(value: Manager => Unit): Self = this.set("begin", js.Any.fromFunction1(value))
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
  }
  
}

