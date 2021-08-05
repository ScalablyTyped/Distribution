package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.FillAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsFillAttrs extends StObject {
  
  var attrs: FillAttrs
  
  var backend: MathBackendCPU
}
object AttrsFillAttrs {
  
  inline def apply(attrs: FillAttrs, backend: MathBackendCPU): AttrsFillAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFillAttrs]
  }
  
  extension [Self <: AttrsFillAttrs](x: Self) {
    
    inline def setAttrs(value: FillAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
