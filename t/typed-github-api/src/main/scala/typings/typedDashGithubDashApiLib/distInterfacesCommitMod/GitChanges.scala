package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitChanges extends js.Object {
  var added: scala.Double
  var deleted: scala.Double
  var total: scala.Double
}

object GitChanges {
  @scala.inline
  def apply(added: scala.Double, deleted: scala.Double, total: scala.Double): GitChanges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("added")(added)
    __obj.updateDynamic("deleted")(deleted)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[GitChanges]
  }
}

