package typings.tengitsui.mod

import typings.tengitsui.tengitsuiStrings.left
import typings.tengitsui.tengitsuiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedField extends StObject {
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var field: String
  
  var filterType: js.UndefOr[String] = js.undefined
  
  // defaultValue 和visible互斥TODO 一起存在
  var fixed: js.UndefOr[left | right] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var listRender: js.UndefOr[js.Function1[/* params */ Any, js.Object]] = js.undefined
  
  var name: String
  
  var optionApi: js.UndefOr[String] = js.undefined
  
  var optionTrigger: js.UndefOr[js.Array[String]] = js.undefined
  
  var order: js.UndefOr[Double | String] = js.undefined
  
  var rules: js.Array[String]
  
  var `type`: String
  
  var useFirstOption: js.UndefOr[Boolean] = js.undefined
  
  var view: js.Array[ViewType]
  
  var visible: js.UndefOr[Boolean | visibleFnc] = js.undefined
}
object AdvancedField {
  
  inline def apply(field: String, name: String, rules: js.Array[String], `type`: String, view: js.Array[ViewType]): AdvancedField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedField] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    inline def setFixed(value: left | right): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setListRender(value: /* params */ Any => js.Object): Self = StObject.set(x, "listRender", js.Any.fromFunction1(value))
    
    inline def setListRenderUndefined: Self = StObject.set(x, "listRender", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptionApi(value: String): Self = StObject.set(x, "optionApi", value.asInstanceOf[js.Any])
    
    inline def setOptionApiUndefined: Self = StObject.set(x, "optionApi", js.undefined)
    
    inline def setOptionTrigger(value: js.Array[String]): Self = StObject.set(x, "optionTrigger", value.asInstanceOf[js.Any])
    
    inline def setOptionTriggerUndefined: Self = StObject.set(x, "optionTrigger", js.undefined)
    
    inline def setOptionTriggerVarargs(value: String*): Self = StObject.set(x, "optionTrigger", js.Array(value*))
    
    inline def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRules(value: js.Array[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseFirstOption(value: Boolean): Self = StObject.set(x, "useFirstOption", value.asInstanceOf[js.Any])
    
    inline def setUseFirstOptionUndefined: Self = StObject.set(x, "useFirstOption", js.undefined)
    
    inline def setView(value: js.Array[ViewType]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewVarargs(value: ViewType*): Self = StObject.set(x, "view", js.Array(value*))
    
    inline def setVisible(value: Boolean | visibleFnc): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleFunction1(value: /* params */ typings.tengitsui.anon.Fields => Boolean): Self = StObject.set(x, "visible", js.Any.fromFunction1(value))
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
