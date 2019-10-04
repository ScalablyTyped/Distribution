package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDBList extends js.Object {
  var cldbid: Double
  var client_created: Double
  var client_description: String
  var client_lastconnected: Double
  var client_lastip: String
  var client_login_name: String
  var client_nickname: String
  var client_totalconnections: Double
  var client_unique_identifier: String
  var count: Double
}

object ClientDBList {
  @scala.inline
  def apply(
    cldbid: Double,
    client_created: Double,
    client_description: String,
    client_lastconnected: Double,
    client_lastip: String,
    client_login_name: String,
    client_nickname: String,
    client_totalconnections: Double,
    client_unique_identifier: String,
    count: Double
  ): ClientDBList = {
    val __obj = js.Dynamic.literal(cldbid = cldbid, client_created = client_created, client_description = client_description, client_lastconnected = client_lastconnected, client_lastip = client_lastip, client_login_name = client_login_name, client_nickname = client_nickname, client_totalconnections = client_totalconnections, client_unique_identifier = client_unique_identifier, count = count)
  
    __obj.asInstanceOf[ClientDBList]
  }
}

