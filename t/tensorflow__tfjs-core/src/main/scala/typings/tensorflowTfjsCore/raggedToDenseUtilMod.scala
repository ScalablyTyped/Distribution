package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raggedToDenseUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ragged_to_dense_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait RowPartitionType extends StObject
  @JSImport("@tensorflow/tfjs-core/dist/ops/ragged_to_dense_util", "RowPartitionType")
  @js.native
  object RowPartitionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RowPartitionType & Double] = js.native
    
    @js.native
    sealed trait FIRST_DIM_SIZE
      extends StObject
         with RowPartitionType
    /* 0 */ val FIRST_DIM_SIZE: typings.tensorflowTfjsCore.raggedToDenseUtilMod.RowPartitionType.FIRST_DIM_SIZE & Double = js.native
    
    @js.native
    sealed trait ROW_LENGTHS
      extends StObject
         with RowPartitionType
    /* 2 */ val ROW_LENGTHS: typings.tensorflowTfjsCore.raggedToDenseUtilMod.RowPartitionType.ROW_LENGTHS & Double = js.native
    
    @js.native
    sealed trait ROW_LIMITS
      extends StObject
         with RowPartitionType
    /* 4 */ val ROW_LIMITS: typings.tensorflowTfjsCore.raggedToDenseUtilMod.RowPartitionType.ROW_LIMITS & Double = js.native
    
    @js.native
    sealed trait ROW_SPLITS
      extends StObject
         with RowPartitionType
    /* 3 */ val ROW_SPLITS: typings.tensorflowTfjsCore.raggedToDenseUtilMod.RowPartitionType.ROW_SPLITS & Double = js.native
    
    @js.native
    sealed trait ROW_STARTS
      extends StObject
         with RowPartitionType
    /* 5 */ val ROW_STARTS: typings.tensorflowTfjsCore.raggedToDenseUtilMod.RowPartitionType.ROW_STARTS & Double = js.native
    
    @js.native
    sealed trait VALUE_ROWIDS
      extends StObject
         with RowPartitionType
    /* 1 */ val VALUE_ROWIDS: typings.tensorflowTfjsCore.raggedToDenseUtilMod.RowPartitionType.VALUE_ROWIDS & Double = js.native
  }
  
  inline def combineRaggedTensorToTensorShapes(raggedRank: Double, shape: js.Array[Double], valueShape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineRaggedTensorToTensorShapes")(raggedRank.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], valueShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getRaggedRank(rowPartitionTypes: js.Array[RowPartitionType]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRaggedRank")(rowPartitionTypes.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getRowPartitionTypesHelper(rowPartitionTypeStrings: js.Array[String]): js.Array[RowPartitionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRowPartitionTypesHelper")(rowPartitionTypeStrings.asInstanceOf[js.Any]).asInstanceOf[js.Array[RowPartitionType]]
  
  inline def validateDefaultValueShape(defaultValueShape: js.Array[Double], valueShape: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateDefaultValueShape")(defaultValueShape.asInstanceOf[js.Any], valueShape.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
