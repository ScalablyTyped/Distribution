package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayBox extends StObject {
  
  def hideOverlay(): Unit
  
  def showOverlay(): Unit
}
object OverlayBox {
  
  @JSImport("webix", "OverlayBox")
  @js.native
  val ^ : OverlayBox = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayBox] (val x: Self) extends AnyVal {
    
    inline def setHideOverlay(value: () => Unit): Self = StObject.set(x, "hideOverlay", js.Any.fromFunction0(value))
    
    inline def setShowOverlay(value: () => Unit): Self = StObject.set(x, "showOverlay", js.Any.fromFunction0(value))
  }
}
