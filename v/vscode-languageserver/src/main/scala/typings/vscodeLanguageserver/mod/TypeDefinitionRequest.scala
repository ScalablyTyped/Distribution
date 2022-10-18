package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashtypeDefinition
import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeDefinitionMod.TypeDefinitionParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeDefinitionMod.TypeDefinitionRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeDefinitionRequest {
  
  @JSImport("vscode-languageserver", "TypeDefinitionRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "TypeDefinitionRequest.method")
  @js.native
  val method: textDocumentSlashtypeDefinition = js.native
  
  @JSImport("vscode-languageserver", "TypeDefinitionRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    TypeDefinitionParams, 
    Definition | js.Array[typings.vscodeLanguageserverTypes.mod.LocationLink] | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    TypeDefinitionRegistrationOptions
  ] = js.native
}
