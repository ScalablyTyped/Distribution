package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceInstance extends InstanceResource {
  var channels: ServiceChannelResource = js.native
  var roles: ServiceRoleResource = js.native
  var users: ServiceUserResource = js.native
}

