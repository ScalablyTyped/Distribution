package typings.symphonyApiClientNode.usersClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node/UsersClient", "getUsersFromEmailList")
@js.native
object getUsersFromEmailList extends js.Object {
  
  def apply(commaSeparatedEmails: String): js.Promise[UsersList] = js.native
  def apply(commaSeparatedEmails: String, local: Boolean): js.Promise[UsersList] = js.native
}
