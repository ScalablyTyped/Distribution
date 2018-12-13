package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest")
@js.native
object DeclarationRequestNs extends js.Object {
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
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Declaration | (js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DeclarationLink
    ]) | scala.Null, 
    scala.Unit
  ]
}

