package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationParams
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DeclarationRequest")
@js.native
object DeclarationRequest extends js.Object {
  val method: textDocumentSlashdeclaration = js.native
  /** @deprecated Use DeclarationRequest.type */
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ]
  ] = js.native
  val `type`: ProtocolRequestType[
    DeclarationParams, 
    typings.vscodeLanguageserverTypes.mod.Location | (js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ]) | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    DeclarationRegistrationOptions
  ] = js.native
}

