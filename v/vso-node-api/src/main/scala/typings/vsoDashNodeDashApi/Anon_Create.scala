package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  var create: Double
  var delete: Double
  var edit: Double
  var managePermissions: Double
  var none: Double
  var read: Double
}

object Anon_Create {
  @scala.inline
  def apply(
    create: Double,
    delete: Double,
    edit: Double,
    managePermissions: Double,
    none: Double,
    read: Double
  ): Anon_Create = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, edit = edit, managePermissions = managePermissions, none = none, read = read)
  
    __obj.asInstanceOf[Anon_Create]
  }
}

