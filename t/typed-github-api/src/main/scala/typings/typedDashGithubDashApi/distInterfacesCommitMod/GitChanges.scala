package typings.typedDashGithubDashApi.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitChanges extends js.Object {
  var added: Double
  var deleted: Double
  var total: Double
}

object GitChanges {
  @scala.inline
  def apply(added: Double, deleted: Double, total: Double): GitChanges = {
    val __obj = js.Dynamic.literal(added = added, deleted = deleted, total = total)
  
    __obj.asInstanceOf[GitChanges]
  }
}

