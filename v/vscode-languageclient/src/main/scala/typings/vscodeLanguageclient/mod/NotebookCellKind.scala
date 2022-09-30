package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientInts.`1`
import typings.vscodeLanguageclient.vscodeLanguageclientInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotebookCellKind {
  
  @JSImport("vscode-languageclient", "NotebookCellKind")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A code-cell is source code.
    */
  @JSImport("vscode-languageclient", "NotebookCellKind.Code")
  @js.native
  val Code: `2` = js.native
  
  /**
    * A markup-cell is formatted source that is used for display.
    */
  @JSImport("vscode-languageclient", "NotebookCellKind.Markup")
  @js.native
  val Markup: `1` = js.native
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCellKind */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCellKind */ Boolean]
}
