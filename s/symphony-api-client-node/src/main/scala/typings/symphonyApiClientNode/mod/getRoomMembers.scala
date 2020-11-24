package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.streamsClientMod.RoomMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getRoomMembers")
@js.native
object getRoomMembers extends js.Object {
  
  def apply(streamId: String): js.Promise[js.Array[RoomMember]] = js.native
}
