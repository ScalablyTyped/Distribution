package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEventMap extends ProxyEventMap {
  
  var change: NetworkChangeEvent = js.native
}
object NetworkEventMap {
  
  @scala.inline
  def apply(change: NetworkChangeEvent): NetworkEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkEventMap]
  }
  
  @scala.inline
  implicit class NetworkEventMapMutableBuilder[Self <: NetworkEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: NetworkChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
