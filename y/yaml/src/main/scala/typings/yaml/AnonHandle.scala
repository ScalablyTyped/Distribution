package typings.yaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandle extends js.Object {
  var handle: String
  var suffix: String
}

object AnonHandle {
  @scala.inline
  def apply(handle: String, suffix: String): AnonHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHandle]
  }
}

