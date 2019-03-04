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
    val __obj = js.Dynamic.literal(added = added, deleted = deleted, total = total)
  
    __obj.asInstanceOf[GitChanges]
  }
}

