package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpList extends js.Object {
  /** OpList op */
  var op: js.UndefOr[js.Array[IOpDef] | Null] = js.native
}

object IOpList {
  @scala.inline
  def apply(): IOpList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpList]
  }
  @scala.inline
  implicit class IOpListOps[Self <: IOpList] (val x: Self) extends AnyVal {
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
    def setOpVarargs(value: IOpDef*): Self = this.set("op", js.Array(value :_*))
    @scala.inline
    def setOp(value: js.Array[IOpDef]): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
    @scala.inline
    def setOpNull: Self = this.set("op", null)
  }
  
}

