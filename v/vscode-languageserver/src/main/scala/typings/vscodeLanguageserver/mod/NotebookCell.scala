package typings.vscodeLanguageserver.mod

import typings.std.Set
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.document
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.executionSummary
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.kind
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotebookCell {
  
  @JSImport("vscode-languageserver", "NotebookCell")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    kind: typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCellKind,
    document: typings.vscodeLanguageserverTypes.mod.DocumentUri
  ): typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(kind.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell]
  
  inline def diff(
    one: typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell,
    two: typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell
  ): Set[
    /* keyof vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ kind | document | metadata | executionSummary
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Set[
    /* keyof vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ kind | document | metadata | executionSummary
  ]]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCell */ Boolean]
}
