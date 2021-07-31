package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait TanInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object TanInputs {
  
  @scala.inline
  def apply(): TanInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TanInputs]
  }
  
  @scala.inline
  implicit class TanInputsMutableBuilder[Self <: TanInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
