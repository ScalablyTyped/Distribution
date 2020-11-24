package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.streamsClientMod.Keyword
import typings.symphonyApiClientNode.streamsClientMod.RoomInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "updateRoom")
@js.native
object updateRoom extends js.Object {
  
  def apply(
    streamId: String,
    room: String,
    description: js.UndefOr[String],
    keywords: js.UndefOr[js.Array[Keyword]],
    membersCanInvite: js.UndefOr[Boolean],
    discoverable: js.UndefOr[Boolean],
    anyoneCanJoin: js.UndefOr[Boolean],
    readOnly: js.UndefOr[Boolean],
    copyProtected: js.UndefOr[Boolean],
    crossPod: js.UndefOr[Boolean],
    viewHistory: js.UndefOr[Boolean]
  ): js.Promise[RoomInfo] = js.native
}
