package typings.winrt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSucceededBoolean extends js.Object {
  var succeeded: Boolean
  var value: Boolean
}

object AnonSucceededBoolean {
  @scala.inline
  def apply(succeeded: Boolean, value: Boolean): AnonSucceededBoolean = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSucceededBoolean]
  }
}

