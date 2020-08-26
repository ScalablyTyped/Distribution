package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinedName extends js.Object {
  /** Name comment */
  var Comment: js.UndefOr[String] = js.native
  /** Name */
  var Name: String = js.native
  /** Reference */
  var Ref: String = js.native
  /** Scope (undefined for workbook scope) */
  var Sheet: js.UndefOr[Double] = js.native
}

object DefinedName {
  @scala.inline
  def apply(Name: String, Ref: String): DefinedName = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Ref = Ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedName]
  }
  @scala.inline
  implicit class DefinedNameOps[Self <: DefinedName] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("Ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    @scala.inline
    def setSheet(value: Double): Self = this.set("Sheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheet: Self = this.set("Sheet", js.undefined)
  }
  
}

