package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "CodeLensRequest")
@js.native
object CodeLensRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[
    CodeLensParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens] | Null, 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}

