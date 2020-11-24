package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.usersClientMod.UsersList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getUsersFromIdList")
@js.native
object getUsersFromIdList extends js.Object {
  
  def apply(commaSeparatedIds: String): js.Promise[UsersList] = js.native
  def apply(commaSeparatedIds: String, local: Boolean): js.Promise[UsersList] = js.native
}
