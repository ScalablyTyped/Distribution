package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<wix-style-react.wix-style-react/dist/es/src/Card.CardProps> */
trait WeakValidationMapCardProp extends StObject {
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var controls: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  
  var dataHook: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var hideOverflow: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var showShadow: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var stretchVertically: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapCardProp {
  
  inline def apply(): WeakValidationMapCardProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapCardProp]
  }
  
  extension [Self <: WeakValidationMapCardProp](x: Self) {
    
    inline def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setControls(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setDataHook(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setHideOverflow(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "hideOverflow", value.asInstanceOf[js.Any])
    
    inline def setHideOverflowUndefined: Self = StObject.set(x, "hideOverflow", js.undefined)
    
    inline def setShowShadow(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    inline def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    inline def setStretchVertically(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "stretchVertically", value.asInstanceOf[js.Any])
    
    inline def setStretchVerticallyUndefined: Self = StObject.set(x, "stretchVertically", js.undefined)
  }
}
