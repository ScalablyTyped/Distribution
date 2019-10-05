package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRange
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "FoldingRangeRequest")
@js.native
object FoldingRangeRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[FoldingRangeParams, js.Array[FoldingRange] | Null, js.Any, js.Any] = js.native
}

