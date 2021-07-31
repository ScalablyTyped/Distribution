package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait AsinInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object AsinInputs {
  
  @scala.inline
  def apply(): AsinInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsinInputs]
  }
  
  @scala.inline
  implicit class AsinInputsMutableBuilder[Self <: AsinInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
