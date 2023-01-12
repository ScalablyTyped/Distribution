package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.libEsmApiHooksMod.EditStatePayload
import typings.vueDevtoolsApi.vueDevtoolsApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewKey
  extends StObject
     with EditStatePayload {
  
  var newKey: js.UndefOr[String | Null] = js.undefined
  
  var remove: js.UndefOr[`false`] = js.undefined
  
  var value: Any
}
object NewKey {
  
  inline def apply(value: Any): NewKey = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewKey] (val x: Self) extends AnyVal {
    
    inline def setNewKey(value: String): Self = StObject.set(x, "newKey", value.asInstanceOf[js.Any])
    
    inline def setNewKeyNull: Self = StObject.set(x, "newKey", null)
    
    inline def setNewKeyUndefined: Self = StObject.set(x, "newKey", js.undefined)
    
    inline def setRemove(value: `false`): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
