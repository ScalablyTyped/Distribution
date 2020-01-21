package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: String
  var root: String
  var saveAgainButton: String
  var saving: String
  var success: String
}

object AnonError {
  @scala.inline
  def apply(error: String, root: String, saveAgainButton: String, saving: String, success: String): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], saveAgainButton = saveAgainButton.asInstanceOf[js.Any], saving = saving.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonError]
  }
}

