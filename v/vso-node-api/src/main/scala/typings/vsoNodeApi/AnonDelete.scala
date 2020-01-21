package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelete extends js.Object {
  var delete: Double
  var edit: Double
  var none: Double
  var view: Double
}

object AnonDelete {
  @scala.inline
  def apply(delete: Double, edit: Double, none: Double, view: Double): AnonDelete = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDelete]
  }
}

