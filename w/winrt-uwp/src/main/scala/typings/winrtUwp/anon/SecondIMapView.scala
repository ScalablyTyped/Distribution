package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecondIMapView extends StObject {
  
  /** One half of the original map. */ var first: IMapView[String, String]
  
  /** The second half of the original map. */ var second: IMapView[String, String]
}
object SecondIMapView {
  
  inline def apply(first: IMapView[String, String], second: IMapView[String, String]): SecondIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecondIMapView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecondIMapView] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: IMapView[String, String]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: IMapView[String, String]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
