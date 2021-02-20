package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
@js.native
trait AcoshInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.native
}
object AcoshInputs {
  
  @scala.inline
  def apply(): AcoshInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcoshInputs]
  }
  
  @scala.inline
  implicit class AcoshInputsMutableBuilder[Self <: AcoshInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
