package typings.wixStyleReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<wix-style-react.wix-style-react/dist/es/src/PageFooter.PageFooterProps> */
trait WeakValidationMapPageFoot extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var dataHook: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var divider: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapPageFoot {
  
  @scala.inline
  def apply(): WeakValidationMapPageFoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPageFoot]
  }
  
  @scala.inline
  implicit class WeakValidationMapPageFootMutableBuilder[Self <: WeakValidationMapPageFoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDataHook(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    @scala.inline
    def setDivider(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
  }
}
