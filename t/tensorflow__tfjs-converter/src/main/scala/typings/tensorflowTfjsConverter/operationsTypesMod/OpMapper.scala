package typings.tensorflowTfjsConverter.operationsTypesMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpMapper extends js.Object {
  var attrs: js.UndefOr[js.Array[AttrParamMapper]] = js.native
  var category: js.UndefOr[Category] = js.native
  var customExecutor: js.UndefOr[OpExecutor] = js.native
  var inputs: js.UndefOr[js.Array[InputParamMapper]] = js.native
  var tfOpName: String = js.native
}

object OpMapper {
  @scala.inline
  def apply(tfOpName: String): OpMapper = {
    val __obj = js.Dynamic.literal(tfOpName = tfOpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpMapper]
  }
  @scala.inline
  implicit class OpMapperOps[Self <: OpMapper] (val x: Self) extends AnyVal {
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
    def setTfOpName(value: String): Self = this.set("tfOpName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttrsVarargs(value: AttrParamMapper*): Self = this.set("attrs", js.Array(value :_*))
    @scala.inline
    def setAttrs(value: js.Array[AttrParamMapper]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setCategory(value: Category): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setCustomExecutor(
      value: /* node */ GraphNode => Tensor[Rank] | js.Array[Tensor[Rank]] | (js.Promise[Tensor[Rank] | js.Array[Tensor[Rank]]])
    ): Self = this.set("customExecutor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomExecutor: Self = this.set("customExecutor", js.undefined)
    @scala.inline
    def setInputsVarargs(value: InputParamMapper*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[InputParamMapper]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
  }
  
}

