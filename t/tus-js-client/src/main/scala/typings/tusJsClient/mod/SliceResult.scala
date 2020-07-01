package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceResult extends js.Object {
  var done: Boolean
  // Platform-specific data type which must be usable by the HTTP stack as a body.
  var value: js.Any
}

object SliceResult {
  @scala.inline
  def apply(done: Boolean, value: js.Any): SliceResult = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceResult]
  }
}

