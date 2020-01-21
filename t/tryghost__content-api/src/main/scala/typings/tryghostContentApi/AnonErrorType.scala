package typings.tryghostContentApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorType extends js.Object {
  var errorType: String
  var message: String
}

object AnonErrorType {
  @scala.inline
  def apply(errorType: String, message: String): AnonErrorType = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorType]
  }
}

