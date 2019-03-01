package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delete extends js.Object {
  var delete: scala.Double
  var edit: scala.Double
  var none: scala.Double
  var view: scala.Double
}

object Anon_Delete {
  @scala.inline
  def apply(delete: scala.Double, edit: scala.Double, none: scala.Double, view: scala.Double): Anon_Delete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("edit")(edit)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Anon_Delete]
  }
}

