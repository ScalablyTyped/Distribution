package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AttrValue {
  
  /** Properties of a ListValue. */
  trait IListValue extends StObject {
    
    /** ListValue b */
    var b: js.UndefOr[js.Array[Boolean] | Null] = js.undefined
    
    /** ListValue f */
    var f: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /** ListValue func */
    var func: js.UndefOr[js.Array[INameAttrList] | Null] = js.undefined
    
    /** ListValue i */
    var i: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
    
    /** ListValue s */
    var s: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** ListValue shape */
    var shape: js.UndefOr[js.Array[ITensorShape] | Null] = js.undefined
    
    /** ListValue tensor */
    var tensor: js.UndefOr[js.Array[ITensor] | Null] = js.undefined
    
    /** ListValue type */
    var `type`: js.UndefOr[js.Array[DataType] | Null] = js.undefined
  }
  object IListValue {
    
    inline def apply(): IListValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IListValue]
    }
    
    extension [Self <: IListValue](x: Self) {
      
      inline def setB(value: js.Array[Boolean]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBNull: Self = StObject.set(x, "b", null)
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setBVarargs(value: Boolean*): Self = StObject.set(x, "b", js.Array(value :_*))
      
      inline def setF(value: js.Array[Double]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFNull: Self = StObject.set(x, "f", null)
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setFVarargs(value: Double*): Self = StObject.set(x, "f", js.Array(value :_*))
      
      inline def setFunc(value: js.Array[INameAttrList]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setFuncNull: Self = StObject.set(x, "func", null)
      
      inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      inline def setFuncVarargs(value: INameAttrList*): Self = StObject.set(x, "func", js.Array(value :_*))
      
      inline def setI(value: js.Array[Double | String]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setINull: Self = StObject.set(x, "i", null)
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setIVarargs(value: (Double | String)*): Self = StObject.set(x, "i", js.Array(value :_*))
      
      inline def setS(value: js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSNull: Self = StObject.set(x, "s", null)
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
      
      inline def setShape(value: js.Array[ITensorShape]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeNull: Self = StObject.set(x, "shape", null)
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShapeVarargs(value: ITensorShape*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      inline def setTensor(value: js.Array[ITensor]): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
      
      inline def setTensorNull: Self = StObject.set(x, "tensor", null)
      
      inline def setTensorUndefined: Self = StObject.set(x, "tensor", js.undefined)
      
      inline def setTensorVarargs(value: ITensor*): Self = StObject.set(x, "tensor", js.Array(value :_*))
      
      inline def setType(value: js.Array[DataType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: DataType*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
}
