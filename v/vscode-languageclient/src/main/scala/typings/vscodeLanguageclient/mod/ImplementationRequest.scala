package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashimplementation
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImplementationRequest {
  
  @JSImport("vscode-languageclient", "ImplementationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "ImplementationRequest.method")
  @js.native
  val method: textDocumentSlashimplementation = js.native
  
  @JSImport("vscode-languageclient", "ImplementationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    ImplementationParams, 
    Definition | js.Array[typings.vscodeLanguageserverTypes.mod.LocationLink] | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    ImplementationRegistrationOptions
  ] = js.native
}
