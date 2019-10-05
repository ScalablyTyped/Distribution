package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeError
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "InitializeRequest")
@js.native
object InitializeRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[InitializeParams, InitializeResult, InitializeError, Unit] = js.native
}

