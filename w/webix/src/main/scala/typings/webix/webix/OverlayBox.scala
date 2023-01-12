package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayBox extends StObject {
  
  def hideOverlay(): Unit
  
  def showOverlay(): Unit
}
object OverlayBox {
  
  inline def apply(hideOverlay: () => Unit, showOverlay: () => Unit): OverlayBox = {
    val __obj = js.Dynamic.literal(hideOverlay = js.Any.fromFunction0(hideOverlay), showOverlay = js.Any.fromFunction0(showOverlay))
    __obj.asInstanceOf[OverlayBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayBox] (val x: Self) extends AnyVal {
    
    inline def setHideOverlay(value: () => Unit): Self = StObject.set(x, "hideOverlay", js.Any.fromFunction0(value))
    
    inline def setShowOverlay(value: () => Unit): Self = StObject.set(x, "showOverlay", js.Any.fromFunction0(value))
  }
}
