package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSendFax")
@js.native
object nlapiSendFax extends js.Object {
  /**
    * Send out a fax and associate it with records in the system. This requires fax preferences to be configured.
    * Supported base types are entity for entities, transaction for transactions, activity for activities and cases, record|recordtype for custom records
    * @governance 10 units
    *
    * @param {int}        from internal ID for employee user on behalf of whom this fax is sent
    * @param {string, int} to fax address or internal ID of user that this fax is being sent to
    * @param {string}        subject fax subject
    * @param {string}        body fax body
    * @param {Object}        records Object of base types -> internal IDs used to associate fax to records. i.e. {entity: 100, record: 23, recordtype: customrecord_surveys}
    * @param {nlobjFile[]} files array of nlobjFile objects (files) to include as attachments
    * @return {void}
    *
    * @since    2008.2
    * @param from
    * @param to
    * @param subject
    * @param body
    * @param records
    * @param files
    * @return
    */
  def apply(from: js.Any, to: js.Any, subject: String, body: String, records: js.Any, files: js.Any): js.Any = js.native
}

