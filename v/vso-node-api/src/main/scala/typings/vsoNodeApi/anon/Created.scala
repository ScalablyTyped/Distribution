package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created extends js.Object {
  var created: scala.Double
  var pendingUpload: scala.Double
}

object Created {
  @scala.inline
  def apply(created: scala.Double, pendingUpload: scala.Double): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], pendingUpload = pendingUpload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
}

