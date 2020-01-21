package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinedName extends js.Object {
  /** Name comment */
  var Comment: js.UndefOr[String] = js.undefined
  /** Name */
  var Name: String
  /** Reference */
  var Ref: String
  /** Scope (undefined for workbook scope) */
  var Sheet: js.UndefOr[Double] = js.undefined
}

object DefinedName {
  @scala.inline
  def apply(Name: String, Ref: String, Comment: String = null, Sheet: Int | Double = null): DefinedName = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Ref = Ref.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (Sheet != null) __obj.updateDynamic("Sheet")(Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedName]
  }
}

