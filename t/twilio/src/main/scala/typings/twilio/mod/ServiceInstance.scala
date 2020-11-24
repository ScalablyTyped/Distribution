package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceInstance extends InstanceResource {
  
  var channels: ServiceChannelResource = js.native
  
  var roles: ServiceRoleResource = js.native
  
  var users: ServiceUserResource = js.native
}
