package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsRaggedGatherMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ragged_gather", "raggedGather")
  @js.native
  val raggedGather: js.Function4[
    /* paramsNestedSplits */ js.Array[Tensor[Rank]], 
    /* paramsDenseValues */ Tensor[Rank] | TensorLike, 
    /* indices */ Tensor[Rank] | TensorLike, 
    /* outputRaggedRank */ Double, 
    RaggedGatherMap
  ] = js.native
  
  /**
    * Gather ragged slices from params axis 0 according to indices.
    *
    * @param paramsNestedSplits: A list of at least 1 Tensor with type 'int32' The
    *     nestedRowSplits tensors that define the row-partitioning for the params
    *     RaggedTensor input.
    * @param paramsDenseValues: A Tensor. The flatValues for the params
    *     RaggedTensor.
    * @param indices: A Tensor. Must be one of type: int32. Indices in the
    *     outermost dimension of params of the values that should be gathered.
    * @param outputRaggedRank: An int that is >= 0. The ragged rank of the output
    *     RaggedTensor. outputNestedSplits will contain this number of rowSplits
    *     tensors. This value should equal indices.shape.ndims + params.raggedRank
    *     - 1.
    * @return A map with the following properties:
    *     - outputNestedSplits: A list of outputRaggedRank Tensor objects with the
    * same type as paramsNestedSplits.
    *     - outputDenseValues: A Tensor. Has the same type as paramsDenseValues.
    * @doc {heading: 'Operations', subheading: 'Ragged'}
    */
  trait RaggedGatherMap extends StObject {
    
    var outputDenseValues: Tensor[Rank]
    
    var outputNestedSplits: js.Array[Tensor[Rank]]
  }
  object RaggedGatherMap {
    
    inline def apply(outputDenseValues: Tensor[Rank], outputNestedSplits: js.Array[Tensor[Rank]]): RaggedGatherMap = {
      val __obj = js.Dynamic.literal(outputDenseValues = outputDenseValues.asInstanceOf[js.Any], outputNestedSplits = outputNestedSplits.asInstanceOf[js.Any])
      __obj.asInstanceOf[RaggedGatherMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RaggedGatherMap] (val x: Self) extends AnyVal {
      
      inline def setOutputDenseValues(value: Tensor[Rank]): Self = StObject.set(x, "outputDenseValues", value.asInstanceOf[js.Any])
      
      inline def setOutputNestedSplits(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "outputNestedSplits", value.asInstanceOf[js.Any])
      
      inline def setOutputNestedSplitsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "outputNestedSplits", js.Array(value*))
    }
  }
}
