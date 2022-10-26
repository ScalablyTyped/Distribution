package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesEmptyStateMod.EmptyStateAlign
import typings.wixStyleReact.distTypesEmptyStateMod.EmptyStateTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignChildren extends StObject {
  
  var align: js.UndefOr[EmptyStateAlign] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var classNames: js.UndefOr[`6`] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String | typings.react.mod.global.JSX.Element] = js.undefined
  
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  
  var theme: js.UndefOr[EmptyStateTheme] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object AlignChildren {
  
  inline def apply(): AlignChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignChildren]
  }
  
  extension [Self <: AlignChildren](x: Self) {
    
    inline def setAlign(value: EmptyStateAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassNames(value: `6`): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setImage(value: String | typings.react.mod.global.JSX.Element): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTheme(value: EmptyStateTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
