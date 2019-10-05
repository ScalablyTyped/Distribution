package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentLinkParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentLinkRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DocumentLinkRequest")
@js.native
object DocumentLinkRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    DocumentLinkParams, 
    (js.Array[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink
    ]) | Null, 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}

