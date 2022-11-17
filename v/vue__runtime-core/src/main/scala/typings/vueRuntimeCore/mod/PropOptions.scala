package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropOptions[T, D] extends StObject {
  
  var default: js.UndefOr[D | DefaultFactory[D] | Null | js.Object] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[PropType[T] | true | Null] = js.undefined
  
  var validator: js.UndefOr[js.Function1[/* value */ Any, Boolean]] = js.undefined
}
object PropOptions {
  
  inline def apply[T, D](): PropOptions[T, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropOptions[T, D]]
  }
  
  extension [Self <: PropOptions[?, ?], T, D](x: Self & (PropOptions[T, D])) {
    
    inline def setDefault(value: D | DefaultFactory[D] | js.Object): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction1(value: /* props */ Data => js.UndefOr[D | Null]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: PropType[T] | true): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => T): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: PropConstructor[T]*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setValidator(value: /* value */ Any => Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
