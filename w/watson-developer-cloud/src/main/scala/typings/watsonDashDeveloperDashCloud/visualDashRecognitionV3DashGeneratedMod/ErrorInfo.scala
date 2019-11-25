package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about what might have caused a failure, such as an image that is too large. Not returned when there is no error. */
trait ErrorInfo extends js.Object {
  /** HTTP status code. */
  var code: Double
  /** Human-readable error description. For example, `File size limit exceeded`. */
  var description: String
  /** Codified error string. For example, `limit_exceeded`. */
  var error_id: String
}

object ErrorInfo {
  @scala.inline
  def apply(code: Double, description: String, error_id: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], error_id = error_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorInfo]
  }
}

