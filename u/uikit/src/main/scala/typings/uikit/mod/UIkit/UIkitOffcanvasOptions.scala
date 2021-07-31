package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitOffcanvasOptions extends StObject {
  
  var `bg-close`: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[String | Boolean] = js.undefined
  
  var `esc-close`: js.UndefOr[Boolean] = js.undefined
  
  var flip: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[Boolean] = js.undefined
}
object UIkitOffcanvasOptions {
  
  @scala.inline
  def apply(): UIkitOffcanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitOffcanvasOptions]
  }
  
  @scala.inline
  implicit class UIkitOffcanvasOptionsMutableBuilder[Self <: UIkitOffcanvasOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setBg-close`(value: Boolean): Self = StObject.set(x, "bg-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBg-closeUndefined`: Self = StObject.set(x, "bg-close", js.undefined)
    
    @scala.inline
    def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def `setEsc-close`(value: Boolean): Self = StObject.set(x, "esc-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEsc-closeUndefined`: Self = StObject.set(x, "esc-close", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
  }
}
