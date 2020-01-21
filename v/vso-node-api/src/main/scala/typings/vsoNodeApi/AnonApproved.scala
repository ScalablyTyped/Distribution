package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApproved extends js.Object {
  var approved: Double
  var created: Double
  var deleted: Double
  var rejected: Double
}

object AnonApproved {
  @scala.inline
  def apply(approved: Double, created: Double, deleted: Double, rejected: Double): AnonApproved = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApproved]
  }
}

