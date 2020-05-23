package typings.winrt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SucceededBoolean extends js.Object {
  var succeeded: Boolean
  var value: Boolean
}

object SucceededBoolean {
  @scala.inline
  def apply(succeeded: Boolean, value: Boolean): SucceededBoolean = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SucceededBoolean]
  }
}

