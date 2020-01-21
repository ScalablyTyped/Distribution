package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnError extends js.Object {
  var onError: String
  var root: String
  var small: String
}

object AnonOnError {
  @scala.inline
  def apply(onError: String, root: String, small: String): AnonOnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnError]
  }
}

