package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentViewerEventMap extends ProxyEventMap {
  
  var load: DocumentViewerLoadEvent = js.native
  
  var menu: DocumentViewerMenuEvent = js.native
  
  var unload: DocumentViewerUnloadEvent = js.native
}
object DocumentViewerEventMap {
  
  @scala.inline
  def apply(load: DocumentViewerLoadEvent, menu: DocumentViewerMenuEvent, unload: DocumentViewerUnloadEvent): DocumentViewerEventMap = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewerEventMap]
  }
  
  @scala.inline
  implicit class DocumentViewerEventMapMutableBuilder[Self <: DocumentViewerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoad(value: DocumentViewerLoadEvent): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: DocumentViewerMenuEvent): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnload(value: DocumentViewerUnloadEvent): Self = StObject.set(x, "unload", value.asInstanceOf[js.Any])
  }
}
