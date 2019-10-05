package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiRequestURL")
@js.native
object nlapiRequestURL extends js.Object {
  /**
    * Request a URL to an external or internal resource.
    * @restriction NetSuite maintains a white list of CAs that are allowed for https requests. Please see the online documentation for the complete list.
    * @governance 10 units
    *
    * @param {string} url        A fully qualified URL to an HTTP(s) resource
    * @param {string, Object}    [postdata] - string, document, or Object containing POST payload
    * @param {Object}            [headers] - Object containing request headers.
    * @param {function}        [callback] - available on the Client to support asynchronous requests. function is passed an nlobjServerResponse with the results.
    * @return {nlobjServerResponse}
    *
    * @exception {SSS_UNKNOWN_HOST}
    * @exception {SSS_INVALID_HOST_CERT}
    * @exception {SSS_REQUEST_TIME_EXCEEDED}
    *
    * @since    2007.0
    * @param url
    * @param postdata
    * @param headers?
    * @param callback?
    * @param method
    * @return
    */
  def apply(url: String): js.Any = js.native
  def apply(url: String, postdata: js.Any): js.Any = js.native
  def apply(url: String, postdata: js.Any, headers: js.Any): js.Any = js.native
  def apply(url: String, postdata: js.Any, headers: js.Any, callback: js.Any): js.Any = js.native
  def apply(url: String, postdata: js.Any, headers: js.Any, callback: js.Any, method: js.Any): js.Any = js.native
}

