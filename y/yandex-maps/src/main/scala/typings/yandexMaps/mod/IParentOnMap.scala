package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParentOnMap extends StObject {
  
  def getMap(): Map_
}
object IParentOnMap {
  
  inline def apply(getMap: () => Map_): IParentOnMap = {
    val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap))
    __obj.asInstanceOf[IParentOnMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IParentOnMap] (val x: Self) extends AnyVal {
    
    inline def setGetMap(value: () => Map_): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
  }
}
