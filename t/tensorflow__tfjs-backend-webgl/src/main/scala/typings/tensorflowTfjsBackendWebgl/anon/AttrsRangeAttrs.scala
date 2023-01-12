package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.RangeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsRangeAttrs extends StObject {
  
  var attrs: RangeAttrs
  
  var backend: MathBackendWebGL
}
object AttrsRangeAttrs {
  
  inline def apply(attrs: RangeAttrs, backend: MathBackendWebGL): AttrsRangeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsRangeAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsRangeAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: RangeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
