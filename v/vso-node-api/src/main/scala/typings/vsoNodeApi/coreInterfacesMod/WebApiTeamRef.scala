package typings.vsoNodeApi.coreInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiTeamRef]
  }
}

