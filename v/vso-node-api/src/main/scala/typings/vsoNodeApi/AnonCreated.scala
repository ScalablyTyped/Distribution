package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreated extends js.Object {
  var created: Double
  var pendingUpload: Double
}

object AnonCreated {
  @scala.inline
  def apply(created: Double, pendingUpload: Double): AnonCreated = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], pendingUpload = pendingUpload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreated]
  }
}

