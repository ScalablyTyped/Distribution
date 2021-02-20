package typings.winrt.anon

import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecondIMapView extends StObject {
  
  var first: IMapView[String, String] = js.native
  
  var second: IMapView[String, String] = js.native
}
object SecondIMapView {
  
  @scala.inline
  def apply(first: IMapView[String, String], second: IMapView[String, String]): SecondIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecondIMapView]
  }
  
  @scala.inline
  implicit class SecondIMapViewMutableBuilder[Self <: SecondIMapView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: IMapView[String, String]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: IMapView[String, String]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
