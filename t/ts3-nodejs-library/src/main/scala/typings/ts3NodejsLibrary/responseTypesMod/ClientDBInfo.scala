package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDBInfo extends js.Object {
  var client_base64HashClientUID: String
  var client_created: Double
  var client_database_id: Double
  var client_description: String
  var client_flag_avatar: String
  var client_lastconnected: Double
  var client_lastip: String
  var client_month_bytes_downloaded: Double
  var client_month_bytes_uploaded: Double
  var client_nickname: String
  var client_total_bytes_downloaded: Double
  var client_total_bytes_uploaded: Double
  var client_totalconnections: Double
  var client_unique_identifier: String
}

object ClientDBInfo {
  @scala.inline
  def apply(
    client_base64HashClientUID: String,
    client_created: Double,
    client_database_id: Double,
    client_description: String,
    client_flag_avatar: String,
    client_lastconnected: Double,
    client_lastip: String,
    client_month_bytes_downloaded: Double,
    client_month_bytes_uploaded: Double,
    client_nickname: String,
    client_total_bytes_downloaded: Double,
    client_total_bytes_uploaded: Double,
    client_totalconnections: Double,
    client_unique_identifier: String
  ): ClientDBInfo = {
    val __obj = js.Dynamic.literal(client_base64HashClientUID = client_base64HashClientUID.asInstanceOf[js.Any], client_created = client_created.asInstanceOf[js.Any], client_database_id = client_database_id.asInstanceOf[js.Any], client_description = client_description.asInstanceOf[js.Any], client_flag_avatar = client_flag_avatar.asInstanceOf[js.Any], client_lastconnected = client_lastconnected.asInstanceOf[js.Any], client_lastip = client_lastip.asInstanceOf[js.Any], client_month_bytes_downloaded = client_month_bytes_downloaded.asInstanceOf[js.Any], client_month_bytes_uploaded = client_month_bytes_uploaded.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_total_bytes_downloaded = client_total_bytes_downloaded.asInstanceOf[js.Any], client_total_bytes_uploaded = client_total_bytes_uploaded.asInstanceOf[js.Any], client_totalconnections = client_totalconnections.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientDBInfo]
  }
}

