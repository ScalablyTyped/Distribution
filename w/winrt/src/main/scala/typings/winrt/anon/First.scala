package typings.winrt.anon

import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait First[K, V] extends StObject {
  
  var first: IMapView[K, V]
  
  var second: IMapView[K, V]
}
object First {
  
  @scala.inline
  def apply[K, V](first: IMapView[K, V], second: IMapView[K, V]): First[K, V] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[First[K, V]]
  }
  
  @scala.inline
  implicit class FirstMutableBuilder[Self <: First[?, ?], K, V] (val x: Self & (First[K, V])) extends AnyVal {
    
    @scala.inline
    def setFirst(value: IMapView[K, V]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: IMapView[K, V]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
