package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipByValueAttrs extends StObject {
  
  var clipValueMax: Double
  
  var clipValueMin: Double
}
object ClipByValueAttrs {
  
  inline def apply(clipValueMax: Double, clipValueMin: Double): ClipByValueAttrs = {
    val __obj = js.Dynamic.literal(clipValueMax = clipValueMax.asInstanceOf[js.Any], clipValueMin = clipValueMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipByValueAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClipByValueAttrs] (val x: Self) extends AnyVal {
    
    inline def setClipValueMax(value: Double): Self = StObject.set(x, "clipValueMax", value.asInstanceOf[js.Any])
    
    inline def setClipValueMin(value: Double): Self = StObject.set(x, "clipValueMin", value.asInstanceOf[js.Any])
  }
}
