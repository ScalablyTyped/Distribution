package typings.typedDashGithubDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Additions extends js.Object {
  var additions: Double
  var deletions: Double
  var total: Double
}

object Anon_Additions {
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): Anon_Additions = {
    val __obj = js.Dynamic.literal(additions = additions, deletions = deletions, total = total)
  
    __obj.asInstanceOf[Anon_Additions]
  }
}

