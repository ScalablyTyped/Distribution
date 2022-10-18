package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.LinSpaceAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLinSpaceAttrs extends StObject {
  
  var attrs: LinSpaceAttrs
  
  var backend: MathBackendWebGL
}
object AttrsLinSpaceAttrs {
  
  inline def apply(attrs: LinSpaceAttrs, backend: MathBackendWebGL): AttrsLinSpaceAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLinSpaceAttrs]
  }
  
  extension [Self <: AttrsLinSpaceAttrs](x: Self) {
    
    inline def setAttrs(value: LinSpaceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
