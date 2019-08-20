package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

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
    val __obj = js.Dynamic.literal(client_base64HashClientUID = client_base64HashClientUID, client_created = client_created, client_database_id = client_database_id, client_description = client_description, client_flag_avatar = client_flag_avatar, client_lastconnected = client_lastconnected, client_lastip = client_lastip, client_month_bytes_downloaded = client_month_bytes_downloaded, client_month_bytes_uploaded = client_month_bytes_uploaded, client_nickname = client_nickname, client_total_bytes_downloaded = client_total_bytes_downloaded, client_total_bytes_uploaded = client_total_bytes_uploaded, client_totalconnections = client_totalconnections, client_unique_identifier = client_unique_identifier)
  
    __obj.asInstanceOf[ClientDBInfo]
  }
}

