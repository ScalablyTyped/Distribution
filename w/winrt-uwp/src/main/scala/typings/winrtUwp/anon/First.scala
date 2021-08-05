package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait First[K, V] extends StObject {
  
  /** One half of the original map. */ var first: IMapView[K, V]
  
  /** The second half of the original map. */ var second: IMapView[K, V]
}
object First {
  
  inline def apply[K, V](first: IMapView[K, V], second: IMapView[K, V]): First[K, V] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[First[K, V]]
  }
  
  extension [Self <: First[?, ?], K, V](x: Self & (First[K, V])) {
    
    inline def setFirst(value: IMapView[K, V]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: IMapView[K, V]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
