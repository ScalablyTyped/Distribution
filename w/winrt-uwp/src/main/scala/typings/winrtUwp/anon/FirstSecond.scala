package typings.winrtUwp.anon

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.NamedResource
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstSecond extends StObject {
  
  /** One half of the original map. */ var first: IMapView[String, NamedResource]
  
  /** The second half of the original map. */ var second: IMapView[String, NamedResource]
}
object FirstSecond {
  
  inline def apply(first: IMapView[String, NamedResource], second: IMapView[String, NamedResource]): FirstSecond = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstSecond]
  }
  
  extension [Self <: FirstSecond](x: Self) {
    
    inline def setFirst(value: IMapView[String, NamedResource]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: IMapView[String, NamedResource]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
