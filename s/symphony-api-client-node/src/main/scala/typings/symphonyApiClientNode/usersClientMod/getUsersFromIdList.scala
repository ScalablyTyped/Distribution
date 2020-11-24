package typings.symphonyApiClientNode.usersClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node/UsersClient", "getUsersFromIdList")
@js.native
object getUsersFromIdList extends js.Object {
  
  def apply(commaSeparatedIds: String): js.Promise[UsersList] = js.native
  def apply(commaSeparatedIds: String, local: Boolean): js.Promise[UsersList] = js.native
}
