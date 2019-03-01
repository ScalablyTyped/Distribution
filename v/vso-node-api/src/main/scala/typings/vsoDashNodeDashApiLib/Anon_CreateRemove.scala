package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateRemove extends js.Object {
  var create: scala.Double
  var remove: scala.Double
}

object Anon_CreateRemove {
  @scala.inline
  def apply(create: scala.Double, remove: scala.Double): Anon_CreateRemove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[Anon_CreateRemove]
  }
}

