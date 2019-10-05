package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiResolveURL")
@js.native
object nlapiResolveURL extends js.Object {
  /**
    * Resolve a URL to a resource or object in the system.
    *
    * @param {string} type type specifier for URL: suitelet|tasklink|record|mediaitem
    * @param {string} subtype subtype specifier for URL (corresponding to type): scriptid|taskid|recordtype|mediaid
    * @param {string} [id] internal ID specifier (sub-subtype corresponding to type): deploymentid|n/a|recordid|n/a
    * @param {string} [pagemode] string specifier used to configure page (suitelet: external|internal, tasklink|record: edit|view)
    * @return {string}
    *
    * @since    2007.0
    * @param type
    * @param subtype
    * @param id?
    * @param pagemode?
    * @return
    */
  def apply(`type`: String, subtype: String): String = js.native
  def apply(`type`: String, subtype: String, id: String): String = js.native
  def apply(`type`: String, subtype: String, id: String, pagemode: String): String = js.native
}

