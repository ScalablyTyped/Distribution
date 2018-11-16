package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/main", "WorkspaceSymbolRequest")
@js.native
object WorkspaceSymbolRequestNs extends js.Object {
  val `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceSymbolParams, 
    (js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ]) | scala.Null, 
    scala.Unit, 
    scala.Unit
  ] = js.native
}

