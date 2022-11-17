package typings.yandexMaps.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventPane
  extends StObject
     with IPane
object IEventPane {
  
  inline def apply(
    destroy: () => Unit,
    events: IEventManager[js.Object],
    getElement: () => HTMLElement,
    getMap: () => Map_,
    getOverflow: () => "visible" | "hidden",
    getZIndex: () => Double
  ): IEventPane = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getMap = js.Any.fromFunction0(getMap), getOverflow = js.Any.fromFunction0(getOverflow), getZIndex = js.Any.fromFunction0(getZIndex))
    __obj.asInstanceOf[IEventPane]
  }
}
