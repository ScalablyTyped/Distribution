package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiVoidTransaction")
@js.native
object nlapiVoidTransaction extends js.Object {
  /**
    * void a transaction based on type and id .
    * @governance 10 units for transactions
    *
    * @param {string}    type The transaction type name.
    * @param {string}    id The internal ID for the record.
    * @return {string}  if accounting preference is reversing journal, then it is new journal id,
    *                   otherwise, it is the input record id
    *
    * @since    2014.1
    * @param type
    * @param id
    * @return
    */
  def apply(`type`: String, id: String): String = js.native
}

