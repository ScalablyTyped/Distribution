package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Required extends js.Object {
  var required: scala.Double
  var supported: scala.Double
  var unsupported: scala.Double
}

object Required {
  @scala.inline
  def apply(required: scala.Double, supported: scala.Double, unsupported: scala.Double): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
}

