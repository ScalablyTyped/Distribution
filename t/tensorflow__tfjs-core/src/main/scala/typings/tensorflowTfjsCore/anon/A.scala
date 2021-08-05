package typings.tensorflowTfjsCore.anon

import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A[T /* <: Tensor[Rank] */] extends StObject {
  
  var a: T | TensorLike
  
  var activation: js.UndefOr[typings.tensorflowTfjsCore.fusedTypesMod.Activation] = js.undefined
  
  var b: T | TensorLike
  
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.undefined
  
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
  
  var transposeA: js.UndefOr[Boolean] = js.undefined
  
  var transposeB: js.UndefOr[Boolean] = js.undefined
}
object A {
  
  inline def apply[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): A[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[A[T]]
  }
  
  extension [Self <: A[?], T /* <: Tensor[Rank] */](x: Self & A[T]) {
    
    inline def setA(value: T | TensorLike): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAVarargs(value: Uint8Array*): Self = StObject.set(x, "a", js.Array(value :_*))
    
    inline def setActivation(value: typings.tensorflowTfjsCore.fusedTypesMod.Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    inline def setB(value: T | TensorLike): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBVarargs(value: Uint8Array*): Self = StObject.set(x, "b", js.Array(value :_*))
    
    inline def setBias(value: Tensor[Rank] | TensorLike): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    inline def setBiasVarargs(value: Uint8Array*): Self = StObject.set(x, "bias", js.Array(value :_*))
    
    inline def setPreluActivationWeights(value: Tensor[Rank]): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
    
    inline def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
    
    inline def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
    
    inline def setTransposeAUndefined: Self = StObject.set(x, "transposeA", js.undefined)
    
    inline def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
    
    inline def setTransposeBUndefined: Self = StObject.set(x, "transposeB", js.undefined)
  }
}
