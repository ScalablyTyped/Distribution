package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiTeam extends WebApiTeamRef {
  /**
    * Team description
    */
  var description: String
  /**
    * Identity REST API Url to this team
    */
  var identityUrl: String
}

object WebApiTeam {
  @scala.inline
  def apply(description: String, id: String, identityUrl: String, name: String, url: String): WebApiTeam = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identityUrl = identityUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebApiTeam]
  }
}

