package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiTeamRef extends js.Object {
  /**
    * Team (Identity) Guid. A Team Foundation ID.
    */
  var id: String
  /**
    * Team name
    */
  var name: String
  /**
    * Team REST API Url
    */
  var url: String
}

object WebApiTeamRef {
  @scala.inline
  def apply(id: String, name: String, url: String): WebApiTeamRef = {
    val __obj = js.Dynamic.literal(id = id, name = name, url = url)
  
    __obj.asInstanceOf[WebApiTeamRef]
  }
}

