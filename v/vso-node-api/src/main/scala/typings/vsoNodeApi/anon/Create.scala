package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  var create: scala.Double
  var delete: scala.Double
  var edit: scala.Double
  var managePermissions: scala.Double
  var none: scala.Double
  var read: scala.Double
}

object Create {
  @scala.inline
  def apply(
    create: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    managePermissions: scala.Double,
    none: scala.Double,
    read: scala.Double
  ): Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
}

