package typings.tizenCommonWeb.tizenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAPIError extends js.Object {
  /**
    * 16-bit error code.
    * Possible values are defined in [DOMException](http://www.w3.org/TR/dom/#domexception).
    */
  val code: Double = js.native
  /**
    * An error message that describes the details of the error encountered.
    *
    * This attribute is not intended to be used directly in the user interfaces
    * as it is mainly intended to be useful for developers rather than end users.
    */
  val message: String = js.native
  /**
    * An error type. The name attribute must return the value it had been initialized with.
    *
    *  This attribute can have one of the following values:
    * - UnknownError  An unknown error has occurred
    * - InvalidValuesError  The content of an object does not contain valid values
    * - IOError  An error occurred in communication with the underlying implementation and so the requested method cannot be completed
    * - ServiceNotAvailableError  The requested service is not available
    * - VerificationError  An error occurred in authentication and so the requested method cannot be completed
    *  For other possible values of this attribute, see the values defined in [DOM error names](http://www.w3.org/TR/dom/#error-names-0)
    */
  val name: String = js.native
}

object WebAPIError {
  @scala.inline
  def apply(code: Double, message: String, name: String): WebAPIError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAPIError]
  }
  @scala.inline
  implicit class WebAPIErrorOps[Self <: WebAPIError] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

