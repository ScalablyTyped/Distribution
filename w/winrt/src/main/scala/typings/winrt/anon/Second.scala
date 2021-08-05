package typings.winrt.anon

import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Second extends StObject {
  
  var first: IMapView[String, js.Any]
  
  var second: IMapView[String, js.Any]
}
object Second {
  
  inline def apply(first: IMapView[String, js.Any], second: IMapView[String, js.Any]): Second = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Second]
  }
  
  extension [Self <: Second](x: Self) {
    
    inline def setFirst(value: IMapView[String, js.Any]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: IMapView[String, js.Any]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
