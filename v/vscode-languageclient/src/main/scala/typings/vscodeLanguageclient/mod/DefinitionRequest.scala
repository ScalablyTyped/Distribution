package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdefinition
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DefinitionParams
import typings.vscodeLanguageserverProtocol.protocolMod.DefinitionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefinitionRequest {
  
  @JSImport("vscode-languageclient", "DefinitionRequest.method")
  @js.native
  val method: textDocumentSlashdefinition = js.native
  
  /** @deprecated Use DefinitionRequest.type */
  @JSImport("vscode-languageclient", "DefinitionRequest.resultType")
  @js.native
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ]
  ] = js.native
  
  @JSImport("vscode-languageclient", "DefinitionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DefinitionParams, 
    typings.vscodeLanguageserverTypes.mod.Location | (js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ]) | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Location | typings.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    DefinitionRegistrationOptions
  ] = js.native
}
