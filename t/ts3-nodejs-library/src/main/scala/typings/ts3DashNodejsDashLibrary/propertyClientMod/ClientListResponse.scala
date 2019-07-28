package typings.ts3DashNodejsDashLibrary.propertyClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the response of the clientlist command for a single client
  */
trait ClientListResponse extends js.Object {
  var clid: Double
  var client_database_id: Double
  var client_type: Double
  var client_unique_identifier: String
}

object ClientListResponse {
  @scala.inline
  def apply(clid: Double, client_database_id: Double, client_type: Double, client_unique_identifier: String): ClientListResponse = {
    val __obj = js.Dynamic.literal(clid = clid, client_database_id = client_database_id, client_type = client_type, client_unique_identifier = client_unique_identifier)
  
    __obj.asInstanceOf[ClientListResponse]
  }
}

