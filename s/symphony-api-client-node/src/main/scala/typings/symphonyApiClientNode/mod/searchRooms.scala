package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.streamsClientMod.SearchRoomResponse
import typings.symphonyApiClientNode.streamsClientMod.UserId
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.BASIC
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.RELEVANCE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "searchRooms")
@js.native
object searchRooms extends js.Object {
  
  def apply(
    skip: js.UndefOr[Double],
    limit: js.UndefOr[Double],
    query: js.UndefOr[String],
    labels: js.UndefOr[js.Array[String]],
    active: js.UndefOr[Boolean],
    includePrivateRooms: js.UndefOr[Boolean],
    creator: js.UndefOr[UserId],
    owner: js.UndefOr[UserId],
    member: js.UndefOr[UserId],
    sortOrder: js.UndefOr[BASIC | RELEVANCE]
  ): js.Promise[SearchRoomResponse] = js.native
}
