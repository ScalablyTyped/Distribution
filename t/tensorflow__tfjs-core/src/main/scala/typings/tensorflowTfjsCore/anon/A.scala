package typings.tensorflowTfjsCore.anon

import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A[T /* <: Tensor[Rank] */] extends StObject {
  
  var a: T | TensorLike = js.native
  
  var activation: js.UndefOr[typings.tensorflowTfjsCore.fusedTypesMod.Activation] = js.native
  
  var b: T | TensorLike = js.native
  
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.native
  
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
  
  var transposeA: js.UndefOr[Boolean] = js.native
  
  var transposeB: js.UndefOr[Boolean] = js.native
}
object A {
  
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): A[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[A[T]]
  }
  
  @scala.inline
  implicit class AMutableBuilder[Self <: A[_], T /* <: Tensor[Rank] */] (val x: Self with A[T]) extends AnyVal {
    
    @scala.inline
    def setA(value: T | TensorLike): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAVarargs(value: Uint8Array*): Self = StObject.set(x, "a", js.Array(value :_*))
    
    @scala.inline
    def setActivation(value: typings.tensorflowTfjsCore.fusedTypesMod.Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    @scala.inline
    def setB(value: T | TensorLike): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBVarargs(value: Uint8Array*): Self = StObject.set(x, "b", js.Array(value :_*))
    
    @scala.inline
    def setBias(value: Tensor[Rank] | TensorLike): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    @scala.inline
    def setBiasVarargs(value: Uint8Array*): Self = StObject.set(x, "bias", js.Array(value :_*))
    
    @scala.inline
    def setPreluActivationWeights(value: Tensor[Rank]): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
    
    @scala.inline
    def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeAUndefined: Self = StObject.set(x, "transposeA", js.undefined)
    
    @scala.inline
    def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeBUndefined: Self = StObject.set(x, "transposeB", js.undefined)
  }
}
