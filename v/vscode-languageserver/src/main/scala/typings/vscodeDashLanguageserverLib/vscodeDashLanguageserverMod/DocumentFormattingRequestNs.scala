package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DocumentFormattingRequest")
@js.native
object DocumentFormattingRequestNs extends js.Object {
  val `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType[
    vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentFormattingParams, 
    (js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]) | scala.Null, 
    scala.Unit, 
    vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

