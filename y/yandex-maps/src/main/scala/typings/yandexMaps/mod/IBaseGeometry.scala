package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBaseGeometry
  extends StObject
     with IEventEmitter {
  
  def getBounds(): js.Array[js.Array[Double]] | Null
  
  def getType(): String
}
object IBaseGeometry {
  
  inline def apply(
    events: IEventManager[js.Object],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getType: () => String
  ): IBaseGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[IBaseGeometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBaseGeometry] (val x: Self) extends AnyVal {
    
    inline def setGetBounds(value: () => js.Array[js.Array[Double]] | Null): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
  }
}
