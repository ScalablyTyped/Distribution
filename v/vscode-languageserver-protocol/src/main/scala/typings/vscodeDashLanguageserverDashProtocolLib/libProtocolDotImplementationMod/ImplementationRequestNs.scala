package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotImplementationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest")
@js.native
object ImplementationRequestNs extends js.Object {
  val `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType[
    vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams, 
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location | (js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location
    ]) | (js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.LocationLink
    ]) | scala.Null, 
    scala.Unit, 
    vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions
  ] = js.native
  type HandlerSignature = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
    vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams, 
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Definition | (js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DefinitionLink
    ]) | scala.Null, 
    scala.Unit
  ]
}

