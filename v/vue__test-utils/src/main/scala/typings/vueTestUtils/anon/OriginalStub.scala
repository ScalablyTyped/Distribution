package typings.vueTestUtils.anon

import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.ConcreteComponent
import typings.vueRuntimeCore.mod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalStub extends StObject {
  
  var originalStub: js.UndefOr[ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]] = js.undefined
  
  var source: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]
  
  var stub: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]
}
object OriginalStub {
  
  inline def apply(
    source: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions],
    stub: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]
  ): OriginalStub = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], stub = stub.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalStub]
  }
  
  extension [Self <: OriginalStub](x: Self) {
    
    inline def setOriginalStub(value: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "originalStub", value.asInstanceOf[js.Any])
    
    inline def setOriginalStubUndefined: Self = StObject.set(x, "originalStub", js.undefined)
    
    inline def setSource(value: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStub(value: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "stub", value.asInstanceOf[js.Any])
  }
}
