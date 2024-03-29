package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.FillAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsFillAttrs extends StObject {
  
  var attrs: FillAttrs
  
  var backend: MathBackendWebGL
}
object AttrsFillAttrs {
  
  inline def apply(attrs: FillAttrs, backend: MathBackendWebGL): AttrsFillAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFillAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsFillAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: FillAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
