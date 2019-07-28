package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRange
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "FoldingRangeRequest")
@js.native
object FoldingRangeRequestNs extends js.Object {
  val `type`: RequestType[FoldingRangeParams, js.Array[FoldingRange] | Null, js.Any, js.Any] = js.native
}

