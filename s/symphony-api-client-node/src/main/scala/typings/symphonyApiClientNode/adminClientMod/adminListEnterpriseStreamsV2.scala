package typings.symphonyApiClientNode.adminClientMod

import typings.symphonyApiClientNode.streamsClientMod.StreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node/AdminClient", "adminListEnterpriseStreamsV2")
@js.native
object adminListEnterpriseStreamsV2 extends js.Object {
  
  def apply(
    streamTypes: js.Array[StreamType],
    scope: String,
    origin: String,
    privacy: String,
    status: String,
    startDate: Double,
    endDate: Double,
    skip: Double,
    limit: Double
  ): js.Promise[AdminStreamListResponse] = js.native
}
