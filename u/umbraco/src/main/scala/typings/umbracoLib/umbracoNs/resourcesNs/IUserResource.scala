package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.userResource
  **/
trait IUserResource extends js.Object {
  def disableUser(userId: scala.Double): scala.Unit
}

object IUserResource {
  @scala.inline
  def apply(disableUser: js.Function1[scala.Double, scala.Unit]): IUserResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disableUser")(disableUser)
    __obj.asInstanceOf[IUserResource]
  }
}

