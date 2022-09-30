package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientInts.`1`
import typings.vscodeLanguageclient.vscodeLanguageclientInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionTriggerKind {
  
  /**
    * Code actions were requested automatically.
    *
    * This typically happens when current selection in a file changes, but can
    * also be triggered when file content changes.
    */
  @JSImport("vscode-languageclient", "CodeActionTriggerKind.Automatic")
  @js.native
  val Automatic: `2` = js.native
  
  /**
    * Code actions were explicitly requested by the user or by an extension.
    */
  @JSImport("vscode-languageclient", "CodeActionTriggerKind.Invoked")
  @js.native
  val Invoked: `1` = js.native
}
