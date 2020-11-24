package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about what might have caused a failure, such as an image that is too large. Not returned when there is no error. */
@js.native
trait ErrorInfo extends js.Object {
  
  /** HTTP status code. */
  var code: Double = js.native
  
  /** Human-readable error description. For example, `File size limit exceeded`. */
  var description: String = js.native
  
  /** Codified error string. For example, `limit_exceeded`. */
  var error_id: String = js.native
}
object ErrorInfo {
  
  @scala.inline
  def apply(code: Double, description: String, error_id: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], error_id = error_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
  
  @scala.inline
  implicit class ErrorInfoOps[Self <: ErrorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_id(value: String): Self = this.set("error_id", value.asInstanceOf[js.Any])
  }
}
