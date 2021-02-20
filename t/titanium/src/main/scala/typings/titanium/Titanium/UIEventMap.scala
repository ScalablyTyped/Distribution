package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIEventMap extends ProxyEventMap {
  
  var userinterfacestyle: UIUserinterfacestyleEvent = js.native
}
object UIEventMap {
  
  @scala.inline
  def apply(userinterfacestyle: UIUserinterfacestyleEvent): UIEventMap = {
    val __obj = js.Dynamic.literal(userinterfacestyle = userinterfacestyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIEventMap]
  }
  
  @scala.inline
  implicit class UIEventMapMutableBuilder[Self <: UIEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserinterfacestyle(value: UIUserinterfacestyleEvent): Self = StObject.set(x, "userinterfacestyle", value.asInstanceOf[js.Any])
  }
}
