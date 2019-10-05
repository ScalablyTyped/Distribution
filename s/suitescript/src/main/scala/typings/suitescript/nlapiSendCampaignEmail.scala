package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSendCampaignEmail")
@js.native
object nlapiSendCampaignEmail extends js.Object {
  /**
    * Sends a single on-demand campaign email to a specified recipient and returns a campaign response ID to track the email.
    * @governance 10 units
    * @restriction works in conjunction with the Lead Nurturing (campaigndrip) sublist only
    *
    * @param {int} campaigneventid internal ID of the campaign event
    * @param {int} recipientid internal ID of the recipient - the recipient must have an email
    * @return {int}
    *
    * @since    2010.1
    * @param campaigneventid
    * @param recipientid
    * @return
    */
  def apply(campaigneventid: js.Any, recipientid: js.Any): js.Any = js.native
}

