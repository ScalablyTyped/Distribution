package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.LinSpaceAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLinSpaceAttrs extends StObject {
  
  var attrs: LinSpaceAttrs
  
  var backend: BackendWasm
}
object AttrsLinSpaceAttrs {
  
  inline def apply(attrs: LinSpaceAttrs, backend: BackendWasm): AttrsLinSpaceAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLinSpaceAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsLinSpaceAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: LinSpaceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
