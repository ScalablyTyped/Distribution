package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod

import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.HandlerResult
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationRequestNs.HandlerSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.configuration", "ConfigurationRequest")
@js.native
object ConfigurationRequestNs extends js.Object {
  val `type`: RequestType[ConfigurationParams, js.Array[js.Any], Unit, Unit] = js.native
  type HandlerSignature = RequestHandler[ConfigurationParams, js.Array[js.Any], Unit]
  type MiddlewareSignature = js.Function3[
    /* params */ ConfigurationParams, 
    /* token */ CancellationToken, 
    /* next */ HandlerSignature, 
    HandlerResult[js.Array[js.Any], Unit]
  ]
}

