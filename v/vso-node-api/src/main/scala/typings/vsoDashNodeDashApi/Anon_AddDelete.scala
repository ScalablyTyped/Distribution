package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddDelete extends js.Object {
  var add: Double
  var delete: Double
  var edit: Double
  var none: Double
  var rename: Double
}

object Anon_AddDelete {
  @scala.inline
  def apply(add: Double, delete: Double, edit: Double, none: Double, rename: Double): Anon_AddDelete = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AddDelete]
  }
}

