package typings.winrt.anon

import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Second extends StObject {
  
  var first: IMapView[String, Any]
  
  var second: IMapView[String, Any]
}
object Second {
  
  inline def apply(first: IMapView[String, Any], second: IMapView[String, Any]): Second = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Second]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Second] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: IMapView[String, Any]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: IMapView[String, Any]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
