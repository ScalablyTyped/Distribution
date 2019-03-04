package typings
package typedDashGithubDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Additions extends js.Object {
  var additions: scala.Double
  var deletions: scala.Double
  var total: scala.Double
}

object Anon_Additions {
  @scala.inline
  def apply(additions: scala.Double, deletions: scala.Double, total: scala.Double): Anon_Additions = {
    val __obj = js.Dynamic.literal(additions = additions, deletions = deletions, total = total)
  
    __obj.asInstanceOf[Anon_Additions]
  }
}

