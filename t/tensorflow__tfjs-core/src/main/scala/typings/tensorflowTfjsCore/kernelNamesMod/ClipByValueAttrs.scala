package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipByValueAttrs extends StObject {
  
  var clipValueMax: Double = js.native
  
  var clipValueMin: Double = js.native
}
object ClipByValueAttrs {
  
  @scala.inline
  def apply(clipValueMax: Double, clipValueMin: Double): ClipByValueAttrs = {
    val __obj = js.Dynamic.literal(clipValueMax = clipValueMax.asInstanceOf[js.Any], clipValueMin = clipValueMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipByValueAttrs]
  }
  
  @scala.inline
  implicit class ClipByValueAttrsMutableBuilder[Self <: ClipByValueAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipValueMax(value: Double): Self = StObject.set(x, "clipValueMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipValueMin(value: Double): Self = StObject.set(x, "clipValueMin", value.asInstanceOf[js.Any])
  }
}
