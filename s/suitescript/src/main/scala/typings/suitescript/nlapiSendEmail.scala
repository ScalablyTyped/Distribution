package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSendEmail")
@js.native
object nlapiSendEmail extends js.Object {
  /**
    * Send out an email and associate it with records in the system.
    * Supported base types are entity for entities, transaction for transactions, activity for activities and cases, record|recordtype for custom records
    * @governance 10 units
    * @restriction all outbound emails subject to email Anti-SPAM policies
    *
    * @param {int}        from internal ID for employee user on behalf of whom this email is sent
    * @param {string, int} to email address or internal ID of user that this email is being sent to
    * @param {string}        subject email subject
    * @param {string}        body email body
    * @param {string, string[]} cc copy email address(es)
    * @param {string, string[]} bcc blind copy email address(es)
    * @param {Object}        records Object of base types -> internal IDs used to associate email to records. i.e. {entity: 100, record: 23, recordtype: customrecord_surveys}
    * @param {nlobjFile[]} files array of nlobjFile objects (files) to include as attachments
    * @param {boolean}     notifySenderOnBounce controls whether or not the sender will receive email notification of bounced emails (defaults to false)
    * @param {boolean}     internalOnly controls or not the resultingMmessage record will be visible to non-employees on the Communication tab of attached records (defaults to false)
    * @param {string}        replyTo email reply-to address
    * @return {void}
    *
    * @since    2007.0
    * @param from
    * @param to
    * @param subject
    * @param body
    * @param cc
    * @param bcc
    * @param records
    * @param files
    * @param notifySenderOnBounce
    * @param internalOnly
    * @param replyTo
    * @return
    */
  def apply(
    author: Double,
    recipient: String | Double,
    subject: String,
    body: String | js.Array[nlobjFile],
    cc: js.UndefOr[String | js.Array[String]],
    bcc: js.UndefOr[String | js.Array[String]],
    records: js.UndefOr[js.Any],
    attachments: js.UndefOr[nlobjFile | js.Array[nlobjFile]],
    notifySenderOnBounce: js.UndefOr[Boolean],
    internalOnly: js.UndefOr[Boolean],
    replyTo: js.UndefOr[String]
  ): Unit = js.native
}

