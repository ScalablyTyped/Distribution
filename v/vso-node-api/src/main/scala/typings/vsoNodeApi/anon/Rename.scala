package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rename extends js.Object {
  var add: scala.Double
  var delete: scala.Double
  var edit: scala.Double
  var none: scala.Double
  var rename: scala.Double
}

object Rename {
  @scala.inline
  def apply(
    add: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    none: scala.Double,
    rename: scala.Double
  ): Rename = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rename]
  }
}

