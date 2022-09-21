package typings.uikit.uikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitModalOptions extends StObject {
  
  var `bg-close`: js.UndefOr[Boolean] = js.undefined
  
  var `cls-page`: js.UndefOr[String] = js.undefined
  
  var `cls-panel`: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[String | Boolean] = js.undefined
  
  var `esc-close`: js.UndefOr[Boolean] = js.undefined
  
  var `sel-close`: js.UndefOr[String] = js.undefined
  
  var stack: js.UndefOr[Boolean] = js.undefined
}
object UIkitModalOptions {
  
  inline def apply(): UIkitModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitModalOptions]
  }
  
  extension [Self <: UIkitModalOptions](x: Self) {
    
    inline def `setBg-close`(value: Boolean): Self = StObject.set(x, "bg-close", value.asInstanceOf[js.Any])
    
    inline def `setBg-closeUndefined`: Self = StObject.set(x, "bg-close", js.undefined)
    
    inline def `setCls-page`(value: String): Self = StObject.set(x, "cls-page", value.asInstanceOf[js.Any])
    
    inline def `setCls-pageUndefined`: Self = StObject.set(x, "cls-page", js.undefined)
    
    inline def `setCls-panel`(value: String): Self = StObject.set(x, "cls-panel", value.asInstanceOf[js.Any])
    
    inline def `setCls-panelUndefined`: Self = StObject.set(x, "cls-panel", js.undefined)
    
    inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def `setEsc-close`(value: Boolean): Self = StObject.set(x, "esc-close", value.asInstanceOf[js.Any])
    
    inline def `setEsc-closeUndefined`: Self = StObject.set(x, "esc-close", js.undefined)
    
    inline def `setSel-close`(value: String): Self = StObject.set(x, "sel-close", value.asInstanceOf[js.Any])
    
    inline def `setSel-closeUndefined`: Self = StObject.set(x, "sel-close", js.undefined)
    
    inline def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
