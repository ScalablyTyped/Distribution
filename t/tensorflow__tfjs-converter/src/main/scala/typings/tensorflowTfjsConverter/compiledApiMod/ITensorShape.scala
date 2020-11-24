package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.TensorShape.IDim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITensorShape extends js.Object {
  
  /** TensorShape dim */
  var dim: js.UndefOr[js.Array[IDim] | Null] = js.native
  
  /** TensorShape unknownRank */
  var unknownRank: js.UndefOr[Boolean | Null] = js.native
}
object ITensorShape {
  
  @scala.inline
  def apply(): ITensorShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensorShape]
  }
  
  @scala.inline
  implicit class ITensorShapeOps[Self <: ITensorShape] (val x: Self) extends AnyVal {
    
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
    def setDimVarargs(value: IDim*): Self = this.set("dim", js.Array(value :_*))
    
    @scala.inline
    def setDim(value: js.Array[IDim]): Self = this.set("dim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDim: Self = this.set("dim", js.undefined)
    
    @scala.inline
    def setDimNull: Self = this.set("dim", null)
    
    @scala.inline
    def setUnknownRank(value: Boolean): Self = this.set("unknownRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownRank: Self = this.set("unknownRank", js.undefined)
    
    @scala.inline
    def setUnknownRankNull: Self = this.set("unknownRank", null)
  }
}
