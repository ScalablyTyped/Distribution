package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiTeam extends WebApiTeamRef {
  /**
    * Team description
    */
  var description: java.lang.String
  /**
    * Identity REST API Url to this team
    */
  var identityUrl: java.lang.String
}

object WebApiTeam {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String,
    identityUrl: java.lang.String,
    name: java.lang.String,
    url: java.lang.String
  ): WebApiTeam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("identityUrl")(identityUrl)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebApiTeam]
  }
}

