package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.StringToHashBucketFastAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.StringToHashBucketFastInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsStringToHashBucketFastAttrs extends StObject {
  
  var attrs: StringToHashBucketFastAttrs
  
  var backend: MathBackendCPU
  
  var inputs: StringToHashBucketFastInputs
}
object AttrsStringToHashBucketFastAttrs {
  
  inline def apply(attrs: StringToHashBucketFastAttrs, backend: MathBackendCPU, inputs: StringToHashBucketFastInputs): AttrsStringToHashBucketFastAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsStringToHashBucketFastAttrs]
  }
  
  extension [Self <: AttrsStringToHashBucketFastAttrs](x: Self) {
    
    inline def setAttrs(value: StringToHashBucketFastAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringToHashBucketFastInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
