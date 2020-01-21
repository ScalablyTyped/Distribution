package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequired extends js.Object {
  var required: Double
  var supported: Double
  var unsupported: Double
}

object AnonRequired {
  @scala.inline
  def apply(required: Double, supported: Double, unsupported: Double): AnonRequired = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], unsupported = unsupported.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequired]
  }
}

