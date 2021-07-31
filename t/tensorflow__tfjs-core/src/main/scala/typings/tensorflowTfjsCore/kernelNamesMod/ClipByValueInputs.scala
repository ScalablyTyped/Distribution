package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait ClipByValueInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object ClipByValueInputs {
  
  @scala.inline
  def apply(): ClipByValueInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipByValueInputs]
  }
  
  @scala.inline
  implicit class ClipByValueInputsMutableBuilder[Self <: ClipByValueInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
