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
  
  @scala.inline
  def apply(): IAttrValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttrValue]
  }
  
  @scala.inline
  implicit class IAttrValueMutableBuilder[Self <: IAttrValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: Boolean): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBNull: Self = StObject.set(x, "b", null)
    
    @scala.inline
    def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    @scala.inline
    def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFNull: Self = StObject.set(x, "f", null)
    
    @scala.inline
    def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    @scala.inline
    def setFunc(value: INameAttrList): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuncNull: Self = StObject.set(x, "func", null)
    
    @scala.inline
    def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
    
    @scala.inline
    def setI(value: Double | String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINull: Self = StObject.set(x, "i", null)
    
    @scala.inline
    def setIUndefined: Self = StObject.set(x, "i", js.undefined)
    
    @scala.inline
    def setList(value: IListValue): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListNull: Self = StObject.set(x, "list", null)
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNull: Self = StObject.set(x, "s", null)
    
    @scala.inline
    def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    @scala.inline
    def setShape(value: ITensorShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeNull: Self = StObject.set(x, "shape", null)
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setTensor(value: ITensor): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorNull: Self = StObject.set(x, "tensor", null)
    
    @scala.inline
    def setTensorUndefined: Self = StObject.set(x, "tensor", js.undefined)
    
    @scala.inline
    def setType(value: DataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
