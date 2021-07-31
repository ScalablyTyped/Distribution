package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait Expm1Inputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.undefined
}
object Expm1Inputs {
  
  @scala.inline
  def apply(): Expm1Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expm1Inputs]
  }
  
  @scala.inline
  implicit class Expm1InputsMutableBuilder[Self <: Expm1Inputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
