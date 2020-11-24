package typings.tensorflowTfjsConverter.compiledApiMod.AttrValue

import typings.tensorflowTfjsConverter.compiledApiMod.DataType
import typings.tensorflowTfjsConverter.compiledApiMod.INameAttrList
import typings.tensorflowTfjsConverter.compiledApiMod.ITensor
import typings.tensorflowTfjsConverter.compiledApiMod.ITensorShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListValue. */
@js.native
trait IListValue extends js.Object {
  
  /** ListValue b */
  var b: js.UndefOr[js.Array[Boolean] | Null] = js.native
  
  /** ListValue f */
  var f: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** ListValue func */
  var func: js.UndefOr[js.Array[INameAttrList] | Null] = js.native
  
  /** ListValue i */
  var i: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  
  /** ListValue s */
  var s: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ListValue shape */
  var shape: js.UndefOr[js.Array[ITensorShape] | Null] = js.native
  
  /** ListValue tensor */
  var tensor: js.UndefOr[js.Array[ITensor] | Null] = js.native
  
  /** ListValue type */
  var `type`: js.UndefOr[js.Array[DataType] | Null] = js.native
}
object IListValue {
  
  @scala.inline
  def apply(): IListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListValue]
  }
  
  @scala.inline
  implicit class IListValueOps[Self <: IListValue] (val x: Self) extends AnyVal {
    
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
    def setBVarargs(value: Boolean*): Self = this.set("b", js.Array(value :_*))
    
    @scala.inline
    def setB(value: js.Array[Boolean]): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    
    @scala.inline
    def setBNull: Self = this.set("b", null)
    
    @scala.inline
    def setFVarargs(value: Double*): Self = this.set("f", js.Array(value :_*))
    
    @scala.inline
    def setF(value: js.Array[Double]): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
    
    @scala.inline
    def setFNull: Self = this.set("f", null)
    
    @scala.inline
    def setFuncVarargs(value: INameAttrList*): Self = this.set("func", js.Array(value :_*))
    
    @scala.inline
    def setFunc(value: js.Array[INameAttrList]): Self = this.set("func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunc: Self = this.set("func", js.undefined)
    
    @scala.inline
    def setFuncNull: Self = this.set("func", null)
    
    @scala.inline
    def setIVarargs(value: (Double | String)*): Self = this.set("i", js.Array(value :_*))
    
    @scala.inline
    def setI(value: js.Array[Double | String]): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    
    @scala.inline
    def setINull: Self = this.set("i", null)
    
    @scala.inline
    def setSVarargs(value: String*): Self = this.set("s", js.Array(value :_*))
    
    @scala.inline
    def setS(value: js.Array[String]): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    
    @scala.inline
    def setSNull: Self = this.set("s", null)
    
    @scala.inline
    def setShapeVarargs(value: ITensorShape*): Self = this.set("shape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: js.Array[ITensorShape]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setShapeNull: Self = this.set("shape", null)
    
    @scala.inline
    def setTensorVarargs(value: ITensor*): Self = this.set("tensor", js.Array(value :_*))
    
    @scala.inline
    def setTensor(value: js.Array[ITensor]): Self = this.set("tensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensor: Self = this.set("tensor", js.undefined)
    
    @scala.inline
    def setTensorNull: Self = this.set("tensor", null)
    
    @scala.inline
    def setTypeVarargs(value: DataType*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[DataType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
