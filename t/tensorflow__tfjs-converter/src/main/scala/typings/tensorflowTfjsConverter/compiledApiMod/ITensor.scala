package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITensor extends StObject {
  
  /** Tensor boolVal */
  var boolVal: js.UndefOr[js.Array[Boolean] | Null] = js.undefined
  
  /** Tensor doubleVal */
  var doubleVal: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** Tensor dtype */
  var dtype: js.UndefOr[DataType | Null] = js.undefined
  
  /** Tensor floatVal */
  var floatVal: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** Tensor int64Val */
  var int64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
  
  /** Tensor intVal */
  var intVal: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** Tensor scomplexVal */
  var scomplexVal: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** Tensor stringVal */
  var stringVal: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
  
  /** Tensor tensorContent */
  var tensorContent: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** Tensor tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.undefined
  
  /** Tensor uint32Val */
  var uint32Val: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** Tensor uint64Val */
  var uint64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
  
  /** Tensor versionNumber */
  var versionNumber: js.UndefOr[Double | Null] = js.undefined
}
object ITensor {
  
  inline def apply(): ITensor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensor]
  }
  
  extension [Self <: ITensor](x: Self) {
    
    inline def setBoolVal(value: js.Array[Boolean]): Self = StObject.set(x, "boolVal", value.asInstanceOf[js.Any])
    
    inline def setBoolValNull: Self = StObject.set(x, "boolVal", null)
    
    inline def setBoolValUndefined: Self = StObject.set(x, "boolVal", js.undefined)
    
    inline def setBoolValVarargs(value: Boolean*): Self = StObject.set(x, "boolVal", js.Array(value*))
    
    inline def setDoubleVal(value: js.Array[Double]): Self = StObject.set(x, "doubleVal", value.asInstanceOf[js.Any])
    
    inline def setDoubleValNull: Self = StObject.set(x, "doubleVal", null)
    
    inline def setDoubleValUndefined: Self = StObject.set(x, "doubleVal", js.undefined)
    
    inline def setDoubleValVarargs(value: Double*): Self = StObject.set(x, "doubleVal", js.Array(value*))
    
    inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setDtypeNull: Self = StObject.set(x, "dtype", null)
    
    inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
    
    inline def setFloatVal(value: js.Array[Double]): Self = StObject.set(x, "floatVal", value.asInstanceOf[js.Any])
    
    inline def setFloatValNull: Self = StObject.set(x, "floatVal", null)
    
    inline def setFloatValUndefined: Self = StObject.set(x, "floatVal", js.undefined)
    
    inline def setFloatValVarargs(value: Double*): Self = StObject.set(x, "floatVal", js.Array(value*))
    
    inline def setInt64Val(value: js.Array[Double | String]): Self = StObject.set(x, "int64Val", value.asInstanceOf[js.Any])
    
    inline def setInt64ValNull: Self = StObject.set(x, "int64Val", null)
    
    inline def setInt64ValUndefined: Self = StObject.set(x, "int64Val", js.undefined)
    
    inline def setInt64ValVarargs(value: (Double | String)*): Self = StObject.set(x, "int64Val", js.Array(value*))
    
    inline def setIntVal(value: js.Array[Double]): Self = StObject.set(x, "intVal", value.asInstanceOf[js.Any])
    
    inline def setIntValNull: Self = StObject.set(x, "intVal", null)
    
    inline def setIntValUndefined: Self = StObject.set(x, "intVal", js.undefined)
    
    inline def setIntValVarargs(value: Double*): Self = StObject.set(x, "intVal", js.Array(value*))
    
    inline def setScomplexVal(value: js.Array[Double]): Self = StObject.set(x, "scomplexVal", value.asInstanceOf[js.Any])
    
    inline def setScomplexValNull: Self = StObject.set(x, "scomplexVal", null)
    
    inline def setScomplexValUndefined: Self = StObject.set(x, "scomplexVal", js.undefined)
    
    inline def setScomplexValVarargs(value: Double*): Self = StObject.set(x, "scomplexVal", js.Array(value*))
    
    inline def setStringVal(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "stringVal", value.asInstanceOf[js.Any])
    
    inline def setStringValNull: Self = StObject.set(x, "stringVal", null)
    
    inline def setStringValUndefined: Self = StObject.set(x, "stringVal", js.undefined)
    
    inline def setStringValVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "stringVal", js.Array(value*))
    
    inline def setTensorContent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "tensorContent", value.asInstanceOf[js.Any])
    
    inline def setTensorContentNull: Self = StObject.set(x, "tensorContent", null)
    
    inline def setTensorContentUndefined: Self = StObject.set(x, "tensorContent", js.undefined)
    
    inline def setTensorShape(value: ITensorShape): Self = StObject.set(x, "tensorShape", value.asInstanceOf[js.Any])
    
    inline def setTensorShapeNull: Self = StObject.set(x, "tensorShape", null)
    
    inline def setTensorShapeUndefined: Self = StObject.set(x, "tensorShape", js.undefined)
    
    inline def setUint32Val(value: js.Array[Double]): Self = StObject.set(x, "uint32Val", value.asInstanceOf[js.Any])
    
    inline def setUint32ValNull: Self = StObject.set(x, "uint32Val", null)
    
    inline def setUint32ValUndefined: Self = StObject.set(x, "uint32Val", js.undefined)
    
    inline def setUint32ValVarargs(value: Double*): Self = StObject.set(x, "uint32Val", js.Array(value*))
    
    inline def setUint64Val(value: js.Array[Double | String]): Self = StObject.set(x, "uint64Val", value.asInstanceOf[js.Any])
    
    inline def setUint64ValNull: Self = StObject.set(x, "uint64Val", null)
    
    inline def setUint64ValUndefined: Self = StObject.set(x, "uint64Val", js.undefined)
    
    inline def setUint64ValVarargs(value: (Double | String)*): Self = StObject.set(x, "uint64Val", js.Array(value*))
    
    inline def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberNull: Self = StObject.set(x, "versionNumber", null)
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
