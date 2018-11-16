package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.configuration", "ConfigurationRequest")
@js.native
object ConfigurationRequestNs extends js.Object {
  val `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType[
    vscodeDashLanguageserverDashProtocolLib.libProtocolDotConfigurationMod.ConfigurationParams, 
    js.Array[js.Any], 
    scala.Unit, 
    scala.Unit
  ] = js.native
  type HandlerSignature = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
    vscodeDashLanguageserverDashProtocolLib.libProtocolDotConfigurationMod.ConfigurationParams, 
    js.Array[js.Any], 
    scala.Unit
  ]
  type MiddlewareSignature = js.Function3[
    /* params */ vscodeDashLanguageserverDashProtocolLib.libProtocolDotConfigurationMod.ConfigurationParams, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* next */ HandlerSignature, 
    vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.HandlerResult[js.Array[js.Any], scala.Unit]
  ]
}

