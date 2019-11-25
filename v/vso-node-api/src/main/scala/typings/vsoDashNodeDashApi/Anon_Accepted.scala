package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accepted extends js.Object {
  var accepted: Double
  var open: Double
  var rejected: Double
}

object Anon_Accepted {
  @scala.inline
  def apply(accepted: Double, open: Double, rejected: Double): Anon_Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Accepted]
  }
}

