package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  var create: Double
  var delete: Double
  var edit: Double
  var managePermissions: Double
  var none: Double
  var read: Double
}

object AnonCreate {
  @scala.inline
  def apply(
    create: Double,
    delete: Double,
    edit: Double,
    managePermissions: Double,
    none: Double,
    read: Double
  ): AnonCreate = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreate]
  }
}

