package typings.vscodeLanguageserverProtocol.protocolConfigurationMod

import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.mod.HandlerResult
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.configuration", "ConfigurationRequest")
@js.native
object ConfigurationRequest extends js.Object {
  val `type`: ProtocolRequestType[
    ConfigurationParams with PartialResultParams, 
    js.Array[js.Any], 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
  type HandlerSignature = RequestHandler[ConfigurationParams, js.Array[js.Any], Unit]
  type MiddlewareSignature = js.Function3[
    /* params */ ConfigurationParams, 
    /* token */ CancellationToken, 
    /* next */ HandlerSignature, 
    HandlerResult[js.Array[js.Any], Unit]
  ]
}

