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
    
    @scala.inline
    def apply(): IListValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IListValue]
    }
    
    @scala.inline
    implicit class IListValueMutableBuilder[Self <: IListValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: js.Array[Boolean]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBNull: Self = StObject.set(x, "b", null)
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      @scala.inline
      def setBVarargs(value: Boolean*): Self = StObject.set(x, "b", js.Array(value :_*))
      
      @scala.inline
      def setF(value: js.Array[Double]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFNull: Self = StObject.set(x, "f", null)
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      @scala.inline
      def setFVarargs(value: Double*): Self = StObject.set(x, "f", js.Array(value :_*))
      
      @scala.inline
      def setFunc(value: js.Array[INameAttrList]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncNull: Self = StObject.set(x, "func", null)
      
      @scala.inline
      def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      @scala.inline
      def setFuncVarargs(value: INameAttrList*): Self = StObject.set(x, "func", js.Array(value :_*))
      
      @scala.inline
      def setI(value: js.Array[Double | String]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINull: Self = StObject.set(x, "i", null)
      
      @scala.inline
      def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      @scala.inline
      def setIVarargs(value: (Double | String)*): Self = StObject.set(x, "i", js.Array(value :_*))
      
      @scala.inline
      def setS(value: js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSNull: Self = StObject.set(x, "s", null)
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
      
      @scala.inline
      def setShape(value: js.Array[ITensorShape]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeNull: Self = StObject.set(x, "shape", null)
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setShapeVarargs(value: ITensorShape*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      @scala.inline
      def setTensor(value: js.Array[ITensor]): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensorNull: Self = StObject.set(x, "tensor", null)
      
      @scala.inline
      def setTensorUndefined: Self = StObject.set(x, "tensor", js.undefined)
      
      @scala.inline
      def setTensorVarargs(value: ITensor*): Self = StObject.set(x, "tensor", js.Array(value :_*))
      
      @scala.inline
      def setType(value: js.Array[DataType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: DataType*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
}
