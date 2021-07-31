package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FailureHandlingKind {
  
  /**
    * Applying the workspace change is simply aborted if one of the changes provided
    * fails. All operations executed before the failing operation stay executed.
    */
  @JSImport("vscode-languageclient/lib/client", "FailureHandlingKind.Abort")
  @js.native
  val Abort: typings.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
  
  /**
    * If the workspace edit contains only textual file changes they are executed transactional.
    * If resource changes (create, rename or delete file) are part of the change the failure
    * handling startegy is abort.
    */
  @JSImport("vscode-languageclient/lib/client", "FailureHandlingKind.TextOnlyTransactional")
  @js.native
  val TextOnlyTransactional: typings.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
  
  /**
    * All operations are executed transactional. That means they either all
    * succeed or no changes at all are applied to the workspace.
    */
  @JSImport("vscode-languageclient/lib/client", "FailureHandlingKind.Transactional")
  @js.native
  val Transactional: typings.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
  
  /**
    * The client tries to undo the operations already executed. But there is no
    * guarantee that this is succeeding.
    */
  @JSImport("vscode-languageclient/lib/client", "FailureHandlingKind.Undo")
  @js.native
  val Undo: typings.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
}
