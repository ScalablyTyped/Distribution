package typings.winrt.anon

import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Second extends StObject {
  
  var first: IMapView[String, _] = js.native
  
  var second: IMapView[String, _] = js.native
}
object Second {
  
  @scala.inline
  def apply(first: IMapView[String, _], second: IMapView[String, _]): Second = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Second]
  }
  
  @scala.inline
  implicit class SecondMutableBuilder[Self <: Second] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: IMapView[String, _]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: IMapView[String, _]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
