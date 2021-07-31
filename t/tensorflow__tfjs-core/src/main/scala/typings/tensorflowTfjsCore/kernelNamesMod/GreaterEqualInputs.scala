package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.BinaryInputs */
trait GreaterEqualInputs extends StObject {
  
  var a: js.UndefOr[js.Any] = js.undefined
  
  var b: js.UndefOr[js.Any] = js.undefined
}
object GreaterEqualInputs {
  
  @scala.inline
  def apply(): GreaterEqualInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GreaterEqualInputs]
  }
  
  @scala.inline
  implicit class GreaterEqualInputsMutableBuilder[Self <: GreaterEqualInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: js.Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    @scala.inline
    def setB(value: js.Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUndefined: Self = StObject.set(x, "b", js.undefined)
  }
}
