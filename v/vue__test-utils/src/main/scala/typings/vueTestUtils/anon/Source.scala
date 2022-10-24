package typings.vueTestUtils.anon

import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var source: typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]
  
  var stub: typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]
}
object Source {
  
  inline def apply(
    source: typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions],
    stub: typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]
  ): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], stub = stub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setSource(value: typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStub(value: typings.vueRuntimeCore.mod.Component[Any, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "stub", value.asInstanceOf[js.Any])
  }
}
