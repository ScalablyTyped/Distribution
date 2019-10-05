package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetRedirectURL")
@js.native
object nlapiSetRedirectURL extends js.Object {
  /**
    * Redirect the user to a page. Only valid in the UI on Suitelets and User Events. In Client scripts this will initialize the redirect URL used upon submit.
    *
    * @param {string} type type specifier for URL: suitelet|tasklink|record|mediaitem
    * @param {string} subtype subtype specifier for URL (corresponding to type): scriptid|taskid|recordtype|mediaid
    * @param {string} [id] internal ID specifier (sub-subtype corresponding to type): deploymentid|n/a|recordid|n/a
    * @param {string} [pagemode] string specifier used to configure page (suitelet: external|internal, tasklink|record: edit|view)
    * @param {Object} [parameters] Object used to specify additional URL parameters as name/value pairs
    * @return {void}
    *
    * @since    2007.0
    * @param type
    * @param subtype
    * @param id?
    * @param pagemode?
    * @param parameters?
    * @return
    */
  def apply(`type`: String, identifier: String): Unit = js.native
  def apply(`type`: String, identifier: String, id: String): Unit = js.native
  def apply(`type`: String, identifier: String, id: String, editmode: Boolean): Unit = js.native
  def apply(`type`: String, identifier: String, id: String, editmode: Boolean, parameters: js.Any): Unit = js.native
  def apply(`type`: String, identifier: String, id: Double): Unit = js.native
  def apply(`type`: String, identifier: String, id: Double, editmode: Boolean): Unit = js.native
  def apply(`type`: String, identifier: String, id: Double, editmode: Boolean, parameters: js.Any): Unit = js.native
}

