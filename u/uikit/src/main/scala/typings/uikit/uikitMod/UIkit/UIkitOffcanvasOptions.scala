package typings.uikit.uikitMod.UIkit

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
  
  inline def apply(): UIkitOffcanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitOffcanvasOptions]
  }
  
  extension [Self <: UIkitOffcanvasOptions](x: Self) {
    
    inline def `setBg-close`(value: Boolean): Self = StObject.set(x, "bg-close", value.asInstanceOf[js.Any])
    
    inline def `setBg-closeUndefined`: Self = StObject.set(x, "bg-close", js.undefined)
    
    inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def `setEsc-close`(value: Boolean): Self = StObject.set(x, "esc-close", value.asInstanceOf[js.Any])
    
    inline def `setEsc-closeUndefined`: Self = StObject.set(x, "esc-close", js.undefined)
    
    inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
  }
}
