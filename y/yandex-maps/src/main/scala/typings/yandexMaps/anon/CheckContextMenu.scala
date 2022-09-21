package typings.yandexMaps.anon

import typings.std.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckContextMenu extends StObject {
  
  var checkContextMenu: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var css: js.UndefOr[CSSStyleDeclaration] = js.undefined
  
  var patch: js.UndefOr[Selectable] = js.undefined
  
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object CheckContextMenu {
  
  inline def apply(): CheckContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckContextMenu]
  }
  
  extension [Self <: CheckContextMenu](x: Self) {
    
    inline def setCheckContextMenu(value: Boolean): Self = StObject.set(x, "checkContextMenu", value.asInstanceOf[js.Any])
    
    inline def setCheckContextMenuUndefined: Self = StObject.set(x, "checkContextMenu", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCss(value: CSSStyleDeclaration): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setPatch(value: Selectable): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
