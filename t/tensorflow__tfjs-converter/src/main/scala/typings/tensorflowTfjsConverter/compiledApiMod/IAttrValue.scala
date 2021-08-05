package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.AttrValue.IListValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttrValue extends StObject {
  
  /** AttrValue b */
  var b: js.UndefOr[Boolean | Null] = js.undefined
  
  /** AttrValue f */
  var f: js.UndefOr[Double | Null] = js.undefined
  
  /** AttrValue func */
  var func: js.UndefOr[INameAttrList | Null] = js.undefined
  
  /** AttrValue i */
  var i: js.UndefOr[Double | String | Null] = js.undefined
  
  /** AttrValue list */
  var list: js.UndefOr[IListValue | Null] = js.undefined
  
  /** AttrValue placeholder */
  var placeholder: js.UndefOr[String | Null] = js.undefined
  
  /** AttrValue s */
  var s: js.UndefOr[String | Null] = js.undefined
  
  /** AttrValue shape */
  var shape: js.UndefOr[ITensorShape | Null] = js.undefined
  
  /** AttrValue tensor */
  var tensor: js.UndefOr[ITensor | Null] = js.undefined
  
  /** AttrValue type */
  var `type`: js.UndefOr[DataType | Null] = js.undefined
}
object IAttrValue {
  
  inline def apply(): IAttrValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttrValue]
  }
  
  extension [Self <: IAttrValue](x: Self) {
    
    inline def setB(value: Boolean): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBNull: Self = StObject.set(x, "b", null)
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setFNull: Self = StObject.set(x, "f", null)
    
    inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    inline def setFunc(value: INameAttrList): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setFuncNull: Self = StObject.set(x, "func", null)
    
    inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
    
    inline def setI(value: Double | String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setINull: Self = StObject.set(x, "i", null)
    
    inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
    
    inline def setList(value: IListValue): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListNull: Self = StObject.set(x, "list", null)
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSNull: Self = StObject.set(x, "s", null)
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setShape(value: ITensorShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeNull: Self = StObject.set(x, "shape", null)
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTensor(value: ITensor): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
    
    inline def setTensorNull: Self = StObject.set(x, "tensor", null)
    
    inline def setTensorUndefined: Self = StObject.set(x, "tensor", js.undefined)
    
    inline def setType(value: DataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
