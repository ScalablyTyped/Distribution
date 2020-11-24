package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.AttrValue.IListValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAttrValue extends js.Object {
  
  /** AttrValue b */
  var b: js.UndefOr[Boolean | Null] = js.native
  
  /** AttrValue f */
  var f: js.UndefOr[Double | Null] = js.native
  
  /** AttrValue func */
  var func: js.UndefOr[INameAttrList | Null] = js.native
  
  /** AttrValue i */
  var i: js.UndefOr[Double | String | Null] = js.native
  
  /** AttrValue list */
  var list: js.UndefOr[IListValue | Null] = js.native
  
  /** AttrValue placeholder */
  var placeholder: js.UndefOr[String | Null] = js.native
  
  /** AttrValue s */
  var s: js.UndefOr[String | Null] = js.native
  
  /** AttrValue shape */
  var shape: js.UndefOr[ITensorShape | Null] = js.native
  
  /** AttrValue tensor */
  var tensor: js.UndefOr[ITensor | Null] = js.native
  
  /** AttrValue type */
  var `type`: js.UndefOr[DataType | Null] = js.native
}
object IAttrValue {
  
  @scala.inline
  def apply(): IAttrValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttrValue]
  }
  
  @scala.inline
  implicit class IAttrValueOps[Self <: IAttrValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setB(value: Boolean): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    
    @scala.inline
    def setBNull: Self = this.set("b", null)
    
    @scala.inline
    def setF(value: Double): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
    
    @scala.inline
    def setFNull: Self = this.set("f", null)
    
    @scala.inline
    def setFunc(value: INameAttrList): Self = this.set("func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunc: Self = this.set("func", js.undefined)
    
    @scala.inline
    def setFuncNull: Self = this.set("func", null)
    
    @scala.inline
    def setI(value: Double | String): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    
    @scala.inline
    def setINull: Self = this.set("i", null)
    
    @scala.inline
    def setList(value: IListValue): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setListNull: Self = this.set("list", null)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    
    @scala.inline
    def setSNull: Self = this.set("s", null)
    
    @scala.inline
    def setShape(value: ITensorShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setShapeNull: Self = this.set("shape", null)
    
    @scala.inline
    def setTensor(value: ITensor): Self = this.set("tensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensor: Self = this.set("tensor", js.undefined)
    
    @scala.inline
    def setTensorNull: Self = this.set("tensor", null)
    
    @scala.inline
    def setType(value: DataType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
