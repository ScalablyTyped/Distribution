package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
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
  implicit class DocumentViewerEventMapOps[Self <: DocumentViewerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoad(value: DocumentViewerLoadEvent): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: DocumentViewerMenuEvent): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnload(value: DocumentViewerUnloadEvent): Self = this.set("unload", value.asInstanceOf[js.Any])
  }
}
