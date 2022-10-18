package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdefinition
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DefinitionParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DefinitionRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefinitionRequest {
  
  @JSImport("vscode-languageserver", "DefinitionRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DefinitionRequest.method")
  @js.native
  val method: textDocumentSlashdefinition = js.native
  
  @JSImport("vscode-languageserver", "DefinitionRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DefinitionParams, 
    Definition | js.Array[typings.vscodeLanguageserverTypes.mod.LocationLink] | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    DefinitionRegistrationOptions
  ] = js.native
}
