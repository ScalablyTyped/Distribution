package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.usersClientMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getUserFromEmail")
@js.native
object getUserFromEmail extends js.Object {
  
  def apply(email: String): js.Promise[User] = js.native
  def apply(email: String, local: Boolean): js.Promise[User] = js.native
}
