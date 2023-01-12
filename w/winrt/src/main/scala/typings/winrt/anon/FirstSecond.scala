package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstSecond extends StObject {
  
  var first: IMapView[String, NamedResource]
  
  var second: IMapView[String, NamedResource]
}
object FirstSecond {
  
  inline def apply(first: IMapView[String, NamedResource], second: IMapView[String, NamedResource]): FirstSecond = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstSecond]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstSecond] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: IMapView[String, NamedResource]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: IMapView[String, NamedResource]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
