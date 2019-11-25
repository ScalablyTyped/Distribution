package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "FoldingRangeRequest")
@js.native
object FoldingRangeRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    FoldingRangeParams, 
    (js.Array[
      typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRange
    ]) | Null, 
    js.Any, 
    js.Any
  ] = js.native
}

