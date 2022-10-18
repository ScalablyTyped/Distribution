package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A extends StObject {
  
  var a: Tensor[Rank] | TensorLike
  
  var activation: js.UndefOr[typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation] = js.undefined
  
  var b: Tensor[Rank] | TensorLike
  
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.undefined
  
  var leakyreluAlpha: js.UndefOr[Double] = js.undefined
  
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
  
  var transposeA: js.UndefOr[Boolean] = js.undefined
  
  var transposeB: js.UndefOr[Boolean] = js.undefined
}
object A {
  
  inline def apply(a: Tensor[Rank] | TensorLike, b: Tensor[Rank] | TensorLike): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  
  extension [Self <: A](x: Self) {
    
    inline def setA(value: Tensor[Rank] | TensorLike): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "a", js.Array(value*))
    
    inline def setActivation(value: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    inline def setB(value: Tensor[Rank] | TensorLike): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "b", js.Array(value*))
    
    inline def setBias(value: Tensor[Rank] | TensorLike): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    inline def setBiasVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "bias", js.Array(value*))
    
    inline def setLeakyreluAlpha(value: Double): Self = StObject.set(x, "leakyreluAlpha", value.asInstanceOf[js.Any])
    
    inline def setLeakyreluAlphaUndefined: Self = StObject.set(x, "leakyreluAlpha", js.undefined)
    
    inline def setPreluActivationWeights(value: Tensor[Rank]): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
    
    inline def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
    
    inline def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
    
    inline def setTransposeAUndefined: Self = StObject.set(x, "transposeA", js.undefined)
    
    inline def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
    
    inline def setTransposeBUndefined: Self = StObject.set(x, "transposeB", js.undefined)
  }
}
