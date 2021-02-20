package typings.yandexMaps.mod

import typings.yandexMaps.mod.map.action.Manager
import org.scalablytyped.runtime.StObject
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
  def apply(begin: Manager => Unit, end: () => Unit, events: IEventManager[js.Object]): IMapAction = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapAction]
  }
  
  @scala.inline
  implicit class IMapActionMutableBuilder[Self <: IMapAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: Manager => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
  }
}
