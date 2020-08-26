package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDBInfo extends ResponseEntry {
  var clientBase64HashClientUID: String = js.native
  var clientCreated: Double = js.native
  var clientDatabaseId: String = js.native
  var clientDescription: String = js.native
  var clientFlagAvatar: String = js.native
  var clientLastconnected: Double = js.native
  var clientLastip: String = js.native
  var clientMonthBytesDownloaded: Double = js.native
  var clientMonthBytesUploaded: Double = js.native
  var clientNickname: String = js.native
  var clientTotalBytesDownloaded: Double = js.native
  var clientTotalBytesUploaded: Double = js.native
  var clientTotalconnections: Double = js.native
  var clientUniqueIdentifier: String = js.native
}

object ClientDBInfo {
  @scala.inline
  def apply(
    clientBase64HashClientUID: String,
    clientCreated: Double,
    clientDatabaseId: String,
    clientDescription: String,
    clientFlagAvatar: String,
    clientLastconnected: Double,
    clientLastip: String,
    clientMonthBytesDownloaded: Double,
    clientMonthBytesUploaded: Double,
    clientNickname: String,
    clientTotalBytesDownloaded: Double,
    clientTotalBytesUploaded: Double,
    clientTotalconnections: Double,
    clientUniqueIdentifier: String
  ): ClientDBInfo = {
    val __obj = js.Dynamic.literal(clientBase64HashClientUID = clientBase64HashClientUID.asInstanceOf[js.Any], clientCreated = clientCreated.asInstanceOf[js.Any], clientDatabaseId = clientDatabaseId.asInstanceOf[js.Any], clientDescription = clientDescription.asInstanceOf[js.Any], clientFlagAvatar = clientFlagAvatar.asInstanceOf[js.Any], clientLastconnected = clientLastconnected.asInstanceOf[js.Any], clientLastip = clientLastip.asInstanceOf[js.Any], clientMonthBytesDownloaded = clientMonthBytesDownloaded.asInstanceOf[js.Any], clientMonthBytesUploaded = clientMonthBytesUploaded.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientTotalBytesDownloaded = clientTotalBytesDownloaded.asInstanceOf[js.Any], clientTotalBytesUploaded = clientTotalBytesUploaded.asInstanceOf[js.Any], clientTotalconnections = clientTotalconnections.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBInfo]
  }
  @scala.inline
  implicit class ClientDBInfoOps[Self <: ClientDBInfo] (val x: Self) extends AnyVal {
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
    def setClientBase64HashClientUID(value: String): Self = this.set("clientBase64HashClientUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientCreated(value: Double): Self = this.set("clientCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientDatabaseId(value: String): Self = this.set("clientDatabaseId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientDescription(value: String): Self = this.set("clientDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientFlagAvatar(value: String): Self = this.set("clientFlagAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientLastconnected(value: Double): Self = this.set("clientLastconnected", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientLastip(value: String): Self = this.set("clientLastip", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientMonthBytesDownloaded(value: Double): Self = this.set("clientMonthBytesDownloaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientMonthBytesUploaded(value: Double): Self = this.set("clientMonthBytesUploaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientNickname(value: String): Self = this.set("clientNickname", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientTotalBytesDownloaded(value: Double): Self = this.set("clientTotalBytesDownloaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientTotalBytesUploaded(value: Double): Self = this.set("clientTotalBytesUploaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientTotalconnections(value: Double): Self = this.set("clientTotalconnections", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = this.set("clientUniqueIdentifier", value.asInstanceOf[js.Any])
  }
  
}

