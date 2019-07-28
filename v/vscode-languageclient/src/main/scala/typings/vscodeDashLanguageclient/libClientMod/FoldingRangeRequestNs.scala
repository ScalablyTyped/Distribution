package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRange
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "FoldingRangeRequest")
@js.native
object FoldingRangeRequestNs extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[FoldingRangeParams, js.Array[FoldingRange] | Null, js.Any, js.Any] = js.native
}

