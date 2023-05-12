package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.StaticRegexReplaceAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.StaticRegexReplaceInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsStaticRegexReplaceAttrs extends StObject {
  
  var attrs: StaticRegexReplaceAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: StaticRegexReplaceInputs
}
object AttrsStaticRegexReplaceAttrs {
  
  inline def apply(attrs: StaticRegexReplaceAttrs, backend: MathBackendWebGL, inputs: StaticRegexReplaceInputs): AttrsStaticRegexReplaceAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsStaticRegexReplaceAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsStaticRegexReplaceAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: StaticRegexReplaceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StaticRegexReplaceInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
