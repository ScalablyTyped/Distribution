package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinedName extends js.Object {
  /** Name comment */
  var Comment: js.UndefOr[java.lang.String] = js.undefined
  /** Name */
  var Name: java.lang.String
  /** Reference */
  var Ref: java.lang.String
  /** Scope (undefined for workbook scope) */
  var Sheet: js.UndefOr[scala.Double] = js.undefined
}

object DefinedName {
  @scala.inline
  def apply(
    Name: java.lang.String,
    Ref: java.lang.String,
    Comment: java.lang.String = null,
    Sheet: scala.Int | scala.Double = null
  ): DefinedName = {
    val __obj = js.Dynamic.literal(Name = Name, Ref = Ref)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (Sheet != null) __obj.updateDynamic("Sheet")(Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedName]
  }
}

