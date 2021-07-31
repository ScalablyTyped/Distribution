package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensRequest {
  
  /** @deprecated Use CodeLensRequest.type */
  @JSImport("vscode-languageserver", "CodeLensRequest.resultType")
  @js.native
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens]] = js.native
  
  @JSImport("vscode-languageserver", "CodeLensRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CodeLensParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens], 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}
