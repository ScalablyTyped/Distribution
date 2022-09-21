package typings.yandexMaps.mod

import typings.std.HTMLElement
import typings.yandexMaps.yandexMapsStrings.hidden
import typings.yandexMaps.yandexMapsStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContainerPane
  extends StObject
     with IPane
     with IPositioningContext
object IContainerPane {
  
  inline def apply(
    destroy: () => Unit,
    events: IEventManager[js.Object],
    fromClientPixels: js.Array[Double] => js.Array[Double],
    getElement: () => HTMLElement,
    getMap: () => Map_,
    getOverflow: () => visible | hidden,
    getZIndex: () => Double,
    getZoom: () => Double,
    toClientPixels: js.Array[Double] => js.Array[Double]
  ): IContainerPane = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], fromClientPixels = js.Any.fromFunction1(fromClientPixels), getElement = js.Any.fromFunction0(getElement), getMap = js.Any.fromFunction0(getMap), getOverflow = js.Any.fromFunction0(getOverflow), getZIndex = js.Any.fromFunction0(getZIndex), getZoom = js.Any.fromFunction0(getZoom), toClientPixels = js.Any.fromFunction1(toClientPixels))
    __obj.asInstanceOf[IContainerPane]
  }
}
