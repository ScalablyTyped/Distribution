package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiPrintRecord")
@js.native
object nlapiPrintRecord extends js.Object {
  /**
    * Print a record (transaction) gievn its type, id, and output format.
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {string}    type print output type: transaction|statement|packingslip|pickingticket
    * @param {int}    id internal ID of record to print
    * @param {string}    [format] output format: html|pdf|default
    * @param {Object}    [properties] Object of properties used to configure print
    * @return {nlobjFile}
    *
    * @since 2008.2
    * @param type
    * @param id
    * @param format?
    * @param properties?
    * @return
    */
  def apply(`type`: String, id: js.Any): js.Any = js.native
  def apply(`type`: String, id: js.Any, format: String): js.Any = js.native
  def apply(`type`: String, id: js.Any, format: String, properties: js.Any): js.Any = js.native
}

