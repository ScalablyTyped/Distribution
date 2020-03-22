package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRename extends js.Object {
  var add: Double
  var delete: Double
  var edit: Double
  var none: Double
  var rename: Double
}

object AnonRename {
  @scala.inline
  def apply(add: Double, delete: Double, edit: Double, none: Double, rename: Double): AnonRename = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRename]
  }
}

