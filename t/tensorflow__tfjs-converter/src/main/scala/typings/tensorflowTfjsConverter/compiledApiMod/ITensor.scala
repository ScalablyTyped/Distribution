package typings.tensorflowTfjsConverter.compiledApiMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITensor extends StObject {
  
  /** Tensor boolVal */
  var boolVal: js.UndefOr[js.Array[Boolean] | Null] = js.native
  
  /** Tensor doubleVal */
  var doubleVal: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** Tensor dtype */
  var dtype: js.UndefOr[DataType | Null] = js.native
  
  /** Tensor floatVal */
  var floatVal: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** Tensor int64Val */
  var int64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  
  /** Tensor intVal */
  var intVal: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** Tensor scomplexVal */
  var scomplexVal: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** Tensor stringVal */
  var stringVal: js.UndefOr[js.Array[Uint8Array] | Null] = js.native
  
  /** Tensor tensorContent */
  var tensorContent: js.UndefOr[Uint8Array | Null] = js.native
  
  /** Tensor tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.native
  
  /** Tensor uint32Val */
  var uint32Val: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** Tensor uint64Val */
  var uint64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  
  /** Tensor versionNumber */
  var versionNumber: js.UndefOr[Double | Null] = js.native
}
object ITensor {
  
  @scala.inline
  def apply(): ITensor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensor]
  }
  
  @scala.inline
  implicit class ITensorMutableBuilder[Self <: ITensor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolVal(value: js.Array[Boolean]): Self = StObject.set(x, "boolVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValNull: Self = StObject.set(x, "boolVal", null)
    
    @scala.inline
    def setBoolValUndefined: Self = StObject.set(x, "boolVal", js.undefined)
    
    @scala.inline
    def setBoolValVarargs(value: Boolean*): Self = StObject.set(x, "boolVal", js.Array(value :_*))
    
    @scala.inline
    def setDoubleVal(value: js.Array[Double]): Self = StObject.set(x, "doubleVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValNull: Self = StObject.set(x, "doubleVal", null)
    
    @scala.inline
    def setDoubleValUndefined: Self = StObject.set(x, "doubleVal", js.undefined)
    
    @scala.inline
    def setDoubleValVarargs(value: Double*): Self = StObject.set(x, "doubleVal", js.Array(value :_*))
    
    @scala.inline
    def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtypeNull: Self = StObject.set(x, "dtype", null)
    
    @scala.inline
    def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
    
    @scala.inline
    def setFloatVal(value: js.Array[Double]): Self = StObject.set(x, "floatVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatValNull: Self = StObject.set(x, "floatVal", null)
    
    @scala.inline
    def setFloatValUndefined: Self = StObject.set(x, "floatVal", js.undefined)
    
    @scala.inline
    def setFloatValVarargs(value: Double*): Self = StObject.set(x, "floatVal", js.Array(value :_*))
    
    @scala.inline
    def setInt64Val(value: js.Array[Double | String]): Self = StObject.set(x, "int64Val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt64ValNull: Self = StObject.set(x, "int64Val", null)
    
    @scala.inline
    def setInt64ValUndefined: Self = StObject.set(x, "int64Val", js.undefined)
    
    @scala.inline
    def setInt64ValVarargs(value: (Double | String)*): Self = StObject.set(x, "int64Val", js.Array(value :_*))
    
    @scala.inline
    def setIntVal(value: js.Array[Double]): Self = StObject.set(x, "intVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValNull: Self = StObject.set(x, "intVal", null)
    
    @scala.inline
    def setIntValUndefined: Self = StObject.set(x, "intVal", js.undefined)
    
    @scala.inline
    def setIntValVarargs(value: Double*): Self = StObject.set(x, "intVal", js.Array(value :_*))
    
    @scala.inline
    def setScomplexVal(value: js.Array[Double]): Self = StObject.set(x, "scomplexVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScomplexValNull: Self = StObject.set(x, "scomplexVal", null)
    
    @scala.inline
    def setScomplexValUndefined: Self = StObject.set(x, "scomplexVal", js.undefined)
    
    @scala.inline
    def setScomplexValVarargs(value: Double*): Self = StObject.set(x, "scomplexVal", js.Array(value :_*))
    
    @scala.inline
    def setStringVal(value: js.Array[Uint8Array]): Self = StObject.set(x, "stringVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValNull: Self = StObject.set(x, "stringVal", null)
    
    @scala.inline
    def setStringValUndefined: Self = StObject.set(x, "stringVal", js.undefined)
    
    @scala.inline
    def setStringValVarargs(value: Uint8Array*): Self = StObject.set(x, "stringVal", js.Array(value :_*))
    
    @scala.inline
    def setTensorContent(value: Uint8Array): Self = StObject.set(x, "tensorContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorContentNull: Self = StObject.set(x, "tensorContent", null)
    
    @scala.inline
    def setTensorContentUndefined: Self = StObject.set(x, "tensorContent", js.undefined)
    
    @scala.inline
    def setTensorShape(value: ITensorShape): Self = StObject.set(x, "tensorShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorShapeNull: Self = StObject.set(x, "tensorShape", null)
    
    @scala.inline
    def setTensorShapeUndefined: Self = StObject.set(x, "tensorShape", js.undefined)
    
    @scala.inline
    def setUint32Val(value: js.Array[Double]): Self = StObject.set(x, "uint32Val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUint32ValNull: Self = StObject.set(x, "uint32Val", null)
    
    @scala.inline
    def setUint32ValUndefined: Self = StObject.set(x, "uint32Val", js.undefined)
    
    @scala.inline
    def setUint32ValVarargs(value: Double*): Self = StObject.set(x, "uint32Val", js.Array(value :_*))
    
    @scala.inline
    def setUint64Val(value: js.Array[Double | String]): Self = StObject.set(x, "uint64Val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUint64ValNull: Self = StObject.set(x, "uint64Val", null)
    
    @scala.inline
    def setUint64ValUndefined: Self = StObject.set(x, "uint64Val", js.undefined)
    
    @scala.inline
    def setUint64ValVarargs(value: (Double | String)*): Self = StObject.set(x, "uint64Val", js.Array(value :_*))
    
    @scala.inline
    def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberNull: Self = StObject.set(x, "versionNumber", null)
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
