package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.wixStyleReact.distTypesEmptyStateMod.EmptyStateAlign
import typings.wixStyleReact.distTypesEmptyStateMod.EmptyStateTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var align: js.UndefOr[Validator[js.UndefOr[EmptyStateAlign | Null]]] = js.undefined
  
  var children: js.UndefOr[Validator[ReactNode]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var classNames: js.UndefOr[Validator[js.UndefOr[`5` | Null]]] = js.undefined
  
  var dataHook: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var image: js.UndefOr[Validator[js.UndefOr[String | typings.react.mod.global.JSX.Element | Null]]] = js.undefined
  
  var subtitle: js.UndefOr[Validator[ReactNode]] = js.undefined
  
  var theme: js.UndefOr[Validator[js.UndefOr[EmptyStateTheme | Null]]] = js.undefined
  
  var title: js.UndefOr[Validator[ReactNode]] = js.undefined
}
object Theme {
  
  inline def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setAlign(value: Validator[js.UndefOr[EmptyStateAlign | Null]]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: Validator[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassNames(value: Validator[js.UndefOr[`5` | Null]]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setDataHook(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setImage(value: Validator[js.UndefOr[String | typings.react.mod.global.JSX.Element | Null]]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSubtitle(value: Validator[ReactNode]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTheme(value: Validator[js.UndefOr[EmptyStateTheme | Null]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: Validator[ReactNode]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
