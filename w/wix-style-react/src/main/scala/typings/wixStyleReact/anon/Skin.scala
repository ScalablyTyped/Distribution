package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesBadgeSelectItemMod.BadgeSelectItemSizes
import typings.wixStyleReact.distTypesBadgeSelectItemMod.BadgeSelectItemSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Skin extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  
  var id: String | Double
  
  var size: js.UndefOr[BadgeSelectItemSizes] = js.undefined
  
  var skin: BadgeSelectItemSkin
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var suffix: js.UndefOr[ReactNode] = js.undefined
  
  var text: ReactNode
}
object Skin {
  
  inline def apply(id: String | Double, skin: BadgeSelectItemSkin): Skin = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skin]
  }
  
  extension [Self <: Skin](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSize(value: BadgeSelectItemSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkin(value: BadgeSelectItemSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
