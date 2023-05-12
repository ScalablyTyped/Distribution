package typings.vueTestUtils.anon

import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Functional extends StObject {
  
  var component: js.UndefOr[
    typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]
  ] = js.undefined
  
  var functional: js.UndefOr[
    typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]
  ] = js.undefined
}
object Functional {
  
  inline def apply(): Functional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Functional]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Functional] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setFunctional(value: typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "functional", value.asInstanceOf[js.Any])
    
    inline def setFunctionalUndefined: Self = StObject.set(x, "functional", js.undefined)
  }
}
