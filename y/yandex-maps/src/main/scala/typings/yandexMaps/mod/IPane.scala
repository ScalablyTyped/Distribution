package typings.yandexMaps.mod

import typings.std.HTMLElement
import typings.yandexMaps.yandexMapsStrings.hidden
import typings.yandexMaps.yandexMapsStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPane
  extends StObject
     with IEventEmitter {
  
  def destroy(): Unit
  
  def getElement(): HTMLElement
  
  def getMap(): Map_
  
  def getOverflow(): visible | hidden
  
  def getZIndex(): Double
}
object IPane {
  
  inline def apply(
    destroy: () => Unit,
    events: IEventManager[js.Object],
    getElement: () => HTMLElement,
    getMap: () => Map_,
    getOverflow: () => visible | hidden,
    getZIndex: () => Double
  ): IPane = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getMap = js.Any.fromFunction0(getMap), getOverflow = js.Any.fromFunction0(getOverflow), getZIndex = js.Any.fromFunction0(getZIndex))
    __obj.asInstanceOf[IPane]
  }
  
  extension [Self <: IPane](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    inline def setGetMap(value: () => Map_): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    inline def setGetOverflow(value: () => visible | hidden): Self = StObject.set(x, "getOverflow", js.Any.fromFunction0(value))
    
    inline def setGetZIndex(value: () => Double): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
  }
}
