package typings.ts3DashNodejsDashLibrary.propertyServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the response of the serverlist command for a single virtual server
  */
trait ServerListResponse extends js.Object {
  var virtualserver_id: Double
}

object ServerListResponse {
  @scala.inline
  def apply(virtualserver_id: Double): ServerListResponse = {
    val __obj = js.Dynamic.literal(virtualserver_id = virtualserver_id)
  
    __obj.asInstanceOf[ServerListResponse]
  }
}

