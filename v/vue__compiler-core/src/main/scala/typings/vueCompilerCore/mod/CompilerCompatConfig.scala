package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`2`
import typings.vueCompilerCore.vueCompilerCoreInts.`3`
import typings.vueCompilerCore.vueCompilerCoreStrings.`suppress-warning`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@vue/compiler-core.@vue/compiler-core.CompilerDeprecationTypes, boolean | 'suppress-warning'>> & {  MODE :2 | 3 | undefined} */
trait CompilerCompatConfig extends StObject {
  
  var COMPILER_FILTER: js.UndefOr[Boolean | `suppress-warning`] = js.undefined
  
  var COMPILER_INLINE_TEMPLATE: js.UndefOr[Boolean | `suppress-warning`] = js.undefined
  
  var COMPILER_IS_ON_ELEMENT: js.UndefOr[Boolean | `suppress-warning`] = js.undefined
  
  var COMPILER_NATIVE_TEMPLATE: js.UndefOr[Boolean | `suppress-warning`] = js.undefined
  
  var COMPILER_V_BIND_OBJECT_ORDER: js.UndefOr[Boolean | `suppress-warning`] = js.undefined
  
  var COMPILER_V_BIND_PROP: js.UndefOr[Boolean | `suppress-warning`] = js.undefined
  
  var COMPILER_V_BIND_SYNC: js.UndefOr[Boolean | `suppress-warning`] = js.undefined
  
  var COMPILER_V_IF_V_FOR_PRECEDENCE: js.UndefOr[Boolean | `suppress-warning`] = js.undefined
  
  var COMPILER_V_ON_NATIVE: js.UndefOr[Boolean | `suppress-warning`] = js.undefined
  
  var MODE: js.UndefOr[`2` | `3`] = js.undefined
}
object CompilerCompatConfig {
  
  inline def apply(): CompilerCompatConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerCompatConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompilerCompatConfig] (val x: Self) extends AnyVal {
    
    inline def setCOMPILER_FILTER(value: Boolean | `suppress-warning`): Self = StObject.set(x, "COMPILER_FILTER", value.asInstanceOf[js.Any])
    
    inline def setCOMPILER_FILTERUndefined: Self = StObject.set(x, "COMPILER_FILTER", js.undefined)
    
    inline def setCOMPILER_INLINE_TEMPLATE(value: Boolean | `suppress-warning`): Self = StObject.set(x, "COMPILER_INLINE_TEMPLATE", value.asInstanceOf[js.Any])
    
    inline def setCOMPILER_INLINE_TEMPLATEUndefined: Self = StObject.set(x, "COMPILER_INLINE_TEMPLATE", js.undefined)
    
    inline def setCOMPILER_IS_ON_ELEMENT(value: Boolean | `suppress-warning`): Self = StObject.set(x, "COMPILER_IS_ON_ELEMENT", value.asInstanceOf[js.Any])
    
    inline def setCOMPILER_IS_ON_ELEMENTUndefined: Self = StObject.set(x, "COMPILER_IS_ON_ELEMENT", js.undefined)
    
    inline def setCOMPILER_NATIVE_TEMPLATE(value: Boolean | `suppress-warning`): Self = StObject.set(x, "COMPILER_NATIVE_TEMPLATE", value.asInstanceOf[js.Any])
    
    inline def setCOMPILER_NATIVE_TEMPLATEUndefined: Self = StObject.set(x, "COMPILER_NATIVE_TEMPLATE", js.undefined)
    
    inline def setCOMPILER_V_BIND_OBJECT_ORDER(value: Boolean | `suppress-warning`): Self = StObject.set(x, "COMPILER_V_BIND_OBJECT_ORDER", value.asInstanceOf[js.Any])
    
    inline def setCOMPILER_V_BIND_OBJECT_ORDERUndefined: Self = StObject.set(x, "COMPILER_V_BIND_OBJECT_ORDER", js.undefined)
    
    inline def setCOMPILER_V_BIND_PROP(value: Boolean | `suppress-warning`): Self = StObject.set(x, "COMPILER_V_BIND_PROP", value.asInstanceOf[js.Any])
    
    inline def setCOMPILER_V_BIND_PROPUndefined: Self = StObject.set(x, "COMPILER_V_BIND_PROP", js.undefined)
    
    inline def setCOMPILER_V_BIND_SYNC(value: Boolean | `suppress-warning`): Self = StObject.set(x, "COMPILER_V_BIND_SYNC", value.asInstanceOf[js.Any])
    
    inline def setCOMPILER_V_BIND_SYNCUndefined: Self = StObject.set(x, "COMPILER_V_BIND_SYNC", js.undefined)
    
    inline def setCOMPILER_V_IF_V_FOR_PRECEDENCE(value: Boolean | `suppress-warning`): Self = StObject.set(x, "COMPILER_V_IF_V_FOR_PRECEDENCE", value.asInstanceOf[js.Any])
    
    inline def setCOMPILER_V_IF_V_FOR_PRECEDENCEUndefined: Self = StObject.set(x, "COMPILER_V_IF_V_FOR_PRECEDENCE", js.undefined)
    
    inline def setCOMPILER_V_ON_NATIVE(value: Boolean | `suppress-warning`): Self = StObject.set(x, "COMPILER_V_ON_NATIVE", value.asInstanceOf[js.Any])
    
    inline def setCOMPILER_V_ON_NATIVEUndefined: Self = StObject.set(x, "COMPILER_V_ON_NATIVE", js.undefined)
    
    inline def setMODE(value: `2` | `3`): Self = StObject.set(x, "MODE", value.asInstanceOf[js.Any])
    
    inline def setMODEUndefined: Self = StObject.set(x, "MODE", js.undefined)
  }
}
