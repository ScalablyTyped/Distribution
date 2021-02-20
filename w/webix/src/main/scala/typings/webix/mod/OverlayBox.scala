package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayBox extends StObject {
  
  def hideOverlay(): Unit = js.native
  
  def showOverlay(): Unit = js.native
}
object OverlayBox {
  
  @JSImport("webix", "OverlayBox")
  @js.native
  val ^ : OverlayBox = js.native
  
  @scala.inline
  implicit class OverlayBoxMutableBuilder[Self <: OverlayBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideOverlay(value: () => Unit): Self = StObject.set(x, "hideOverlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowOverlay(value: () => Unit): Self = StObject.set(x, "showOverlay", js.Any.fromFunction0(value))
  }
}
