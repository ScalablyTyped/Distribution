package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasErrors extends js.Object {
  var hasErrors: Boolean
  var inputFiles: js.Array[String]
}

object AnonHasErrors {
  @scala.inline
  def apply(hasErrors: Boolean, inputFiles: js.Array[String]): AnonHasErrors = {
    val __obj = js.Dynamic.literal(hasErrors = hasErrors.asInstanceOf[js.Any], inputFiles = inputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasErrors]
  }
}

