package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.LinSpaceAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLinSpaceAttrs extends StObject {
  
  var attrs: LinSpaceAttrs
  
  var backend: MathBackendCPU
}
object AttrsLinSpaceAttrs {
  
  inline def apply(attrs: LinSpaceAttrs, backend: MathBackendCPU): AttrsLinSpaceAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLinSpaceAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsLinSpaceAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: LinSpaceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
