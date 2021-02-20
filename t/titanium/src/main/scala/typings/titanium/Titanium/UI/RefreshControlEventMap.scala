package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshControlEventMap extends ProxyEventMap {
  
  var refreshend: RefreshControlRefreshendEvent = js.native
  
  var refreshstart: RefreshControlRefreshstartEvent = js.native
}
object RefreshControlEventMap {
  
  @scala.inline
  def apply(refreshend: RefreshControlRefreshendEvent, refreshstart: RefreshControlRefreshstartEvent): RefreshControlEventMap = {
    val __obj = js.Dynamic.literal(refreshend = refreshend.asInstanceOf[js.Any], refreshstart = refreshstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlEventMap]
  }
  
  @scala.inline
  implicit class RefreshControlEventMapMutableBuilder[Self <: RefreshControlEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshend(value: RefreshControlRefreshendEvent): Self = StObject.set(x, "refreshend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshstart(value: RefreshControlRefreshstartEvent): Self = StObject.set(x, "refreshstart", value.asInstanceOf[js.Any])
  }
}
