package typings.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasErrors extends js.Object {
  var hasErrors: Boolean
  var inputFiles: js.Array[String]
}

object HasErrors {
  @scala.inline
  def apply(hasErrors: Boolean, inputFiles: js.Array[String]): HasErrors = {
    val __obj = js.Dynamic.literal(hasErrors = hasErrors.asInstanceOf[js.Any], inputFiles = inputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasErrors]
  }
}

