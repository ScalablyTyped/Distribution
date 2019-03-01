package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deleted extends js.Object {
  var deleted: scala.Double
  var edited: scala.Double
  var restored: scala.Double
  var visited: scala.Double
}

object Anon_Deleted {
  @scala.inline
  def apply(deleted: scala.Double, edited: scala.Double, restored: scala.Double, visited: scala.Double): Anon_Deleted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleted")(deleted)
    __obj.updateDynamic("edited")(edited)
    __obj.updateDynamic("restored")(restored)
    __obj.updateDynamic("visited")(visited)
    __obj.asInstanceOf[Anon_Deleted]
  }
}

