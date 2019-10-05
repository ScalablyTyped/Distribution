package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiCreateError")
@js.native
object nlapiCreateError extends js.Object {
  /**
    * Create an nlobjError object that can be used to abort script execution and configure error notification
    *
    * @param {string}    code error code
    * @param {string}    details error description
    * @param {boolean} [suppressEmail] if true then suppress the error notification emails from being sent out (false by default).
    * @return {nlobjError}
    *
    * @since 2008.2
    * @param code
    * @param details
    * @param suppressEmail?
    * @return
    */
  def apply(code: String, details: String): js.Any = js.native
  def apply(code: String, details: String, suppressEmail: Boolean): js.Any = js.native
}

