package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseGeometry extends IEventEmitter {
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getType(): String = js.native
}
object IBaseGeometry {
  
  @scala.inline
  def apply(
    events: IEventManager[js.Object],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getType: () => String
  ): IBaseGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[IBaseGeometry]
  }
  
  @scala.inline
  implicit class IBaseGeometryMutableBuilder[Self <: IBaseGeometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBounds(value: () => js.Array[js.Array[Double]] | Null): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
  }
}
