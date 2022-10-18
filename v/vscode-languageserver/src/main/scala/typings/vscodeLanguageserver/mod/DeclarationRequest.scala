package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdeclaration
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeclarationRequest {
  
  @JSImport("vscode-languageserver", "DeclarationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DeclarationRequest.method")
  @js.native
  val method: textDocumentSlashdeclaration = js.native
  
  @JSImport("vscode-languageserver", "DeclarationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DeclarationParams, 
    Declaration | js.Array[typings.vscodeLanguageserverTypes.mod.LocationLink] | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    DeclarationRegistrationOptions
  ] = js.native
}
