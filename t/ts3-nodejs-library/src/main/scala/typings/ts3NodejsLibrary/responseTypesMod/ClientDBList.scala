package typings.ts3NodejsLibrary.responseTypesMod

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
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], client_created = client_created.asInstanceOf[js.Any], client_description = client_description.asInstanceOf[js.Any], client_lastconnected = client_lastconnected.asInstanceOf[js.Any], client_lastip = client_lastip.asInstanceOf[js.Any], client_login_name = client_login_name.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_totalconnections = client_totalconnections.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientDBList]
  }
}

