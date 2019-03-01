package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiTeamRef extends js.Object {
  /**
    * Team (Identity) Guid. A Team Foundation ID.
    */
  var id: java.lang.String
  /**
    * Team name
    */
  var name: java.lang.String
  /**
    * Team REST API Url
    */
  var url: java.lang.String
}

object WebApiTeamRef {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, url: java.lang.String): WebApiTeamRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebApiTeamRef]
  }
}

