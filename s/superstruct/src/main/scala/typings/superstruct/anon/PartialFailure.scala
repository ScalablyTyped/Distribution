package typings.superstruct.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<superstruct.superstruct/lib/typings.Failure> */
@js.native
trait PartialFailure extends js.Object {
  var branch: js.UndefOr[js.Array[_]] = js.native
  var path: js.UndefOr[js.Array[String | Double]] = js.native
  var refinement: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
  ] = js.native
}

object PartialFailure {
  @scala.inline
  def apply(): PartialFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFailure]
  }
  @scala.inline
  implicit class PartialFailureOps[Self <: PartialFailure] (val x: Self) extends AnyVal {
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
    def setBranchVarargs(value: js.Any*): Self = this.set("branch", js.Array(value :_*))
    @scala.inline
    def setBranch(value: js.Array[_]): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String | Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRefinement(value: String): Self = this.set("refinement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefinement: Self = this.set("refinement", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
    ): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

