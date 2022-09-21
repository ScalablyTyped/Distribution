package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Second extends StObject {
  
  /** The first part of the original map. */ var first: IMapView[String, Any]
  
  /** The second part of the original map. */ var second: IMapView[String, Any]
}
object Second {
  
  inline def apply(first: IMapView[String, Any], second: IMapView[String, Any]): Second = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Second]
  }
  
  extension [Self <: Second](x: Self) {
    
    inline def setFirst(value: IMapView[String, Any]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: IMapView[String, Any]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
