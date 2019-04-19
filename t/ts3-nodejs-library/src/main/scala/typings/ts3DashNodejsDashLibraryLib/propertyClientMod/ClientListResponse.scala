package typings
package ts3DashNodejsDashLibraryLib.propertyClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the response of the clientlist command for a single client
  */
trait ClientListResponse extends js.Object {
  var clid: scala.Double
  var client_database_id: scala.Double
  var client_type: scala.Double
  var client_unique_identifier: java.lang.String
}

object ClientListResponse {
  @scala.inline
  def apply(
    clid: scala.Double,
    client_database_id: scala.Double,
    client_type: scala.Double,
    client_unique_identifier: java.lang.String
  ): ClientListResponse = {
    val __obj = js.Dynamic.literal(clid = clid, client_database_id = client_database_id, client_type = client_type, client_unique_identifier = client_unique_identifier)
  
    __obj.asInstanceOf[ClientListResponse]
  }
}

