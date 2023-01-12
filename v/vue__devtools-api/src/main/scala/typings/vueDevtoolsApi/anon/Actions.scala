package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentBuiltinCustomStateTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  /** internal */
  var _reviveId: js.UndefOr[Double] = js.undefined
  
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  
  var display: js.UndefOr[String] = js.undefined
  
  /** Configure immediate child fields */
  var fields: js.UndefOr[Abstract] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Any] = js.undefined
  
  var objectType: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
  
  var `type`: ComponentBuiltinCustomStateTypes | String
  
  var uid: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object Actions {
  
  inline def apply(`type`: ComponentBuiltinCustomStateTypes | String): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
    
    inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFields(value: Abstract): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: ComponentBuiltinCustomStateTypes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_reviveId(value: Double): Self = StObject.set(x, "_reviveId", value.asInstanceOf[js.Any])
    
    inline def set_reviveIdUndefined: Self = StObject.set(x, "_reviveId", js.undefined)
  }
}
