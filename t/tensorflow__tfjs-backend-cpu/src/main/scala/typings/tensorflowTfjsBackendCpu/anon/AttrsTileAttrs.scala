package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.TileAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.TileInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsTileAttrs extends StObject {
  
  var attrs: TileAttrs
  
  var backend: MathBackendCPU
  
  var inputs: TileInputs
}
object AttrsTileAttrs {
  
  inline def apply(attrs: TileAttrs, backend: MathBackendCPU, inputs: TileInputs): AttrsTileAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsTileAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsTileAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: TileAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: TileInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
