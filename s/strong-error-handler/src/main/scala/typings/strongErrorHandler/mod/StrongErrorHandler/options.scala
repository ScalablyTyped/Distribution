package typings.strongErrorHandler.mod.StrongErrorHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait options extends js.Object {
  /***
    * HTTP responses include all error properties, including sensitive data such as file paths,
    * URLs and stack traces, defaults to false.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /***
    * Specify the default response content type to use when the client does not provide any Accepts header.
    * Defaults to 'json'.
    */
  var defaultType: js.UndefOr[String] = js.native
  /***
    *If true, all errors are printed via console.error, including an array of fields (custom error properties)
    *that are safe to include in response messages (both 4xx and 5xx).
    *If false, sends only the error back in the response.
    * Defaults to true
    */
  var log: js.UndefOr[Boolean] = js.native
  /***
    * Negotiate the response content type via Accepts request header.
    * When disabled, strong-error-handler will always use the default content type when producing responses.
    * Disabling content type negotiation is useful if you want to see JSON-formatted
    * error responses in browsers, because browsers usually prefer HTML and XML over other content types.
    */
  var negotiateContentType: js.UndefOr[Boolean] = js.native
  /***
    * Specifies property names on errors that are allowed to be passed through in 4xx and 5xx responses.
    */
  var safeFields: js.UndefOr[js.Array[String]] = js.native
}

object options {
  @scala.inline
  def apply(): options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[options]
  }
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDefaultType(value: String): Self = this.set("defaultType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultType: Self = this.set("defaultType", js.undefined)
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setNegotiateContentType(value: Boolean): Self = this.set("negotiateContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegotiateContentType: Self = this.set("negotiateContentType", js.undefined)
    @scala.inline
    def setSafeFieldsVarargs(value: String*): Self = this.set("safeFields", js.Array(value :_*))
    @scala.inline
    def setSafeFields(value: js.Array[String]): Self = this.set("safeFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeFields: Self = this.set("safeFields", js.undefined)
  }
  
}

