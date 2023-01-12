package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.StringToHashBucketFastAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.StringToHashBucketFastInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsStringToHashBucketFastAttrs extends StObject {
  
  var attrs: StringToHashBucketFastAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: StringToHashBucketFastInputs
}
object AttrsStringToHashBucketFastAttrs {
  
  inline def apply(
    attrs: StringToHashBucketFastAttrs,
    backend: MathBackendWebGL,
    inputs: StringToHashBucketFastInputs
  ): AttrsStringToHashBucketFastAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsStringToHashBucketFastAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsStringToHashBucketFastAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: StringToHashBucketFastAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringToHashBucketFastInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
