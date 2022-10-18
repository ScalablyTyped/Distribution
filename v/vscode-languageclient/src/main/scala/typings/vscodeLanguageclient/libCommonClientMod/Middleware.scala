package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscodeLanguageclient.libCommonCallHierarchyMod.CallHierarchyMiddleware
import typings.vscodeLanguageclient.libCommonCodeActionMod.CodeActionMiddleware
import typings.vscodeLanguageclient.libCommonCodeLensMod.CodeLensMiddleware
import typings.vscodeLanguageclient.libCommonColorProviderMod.ColorProviderMiddleware
import typings.vscodeLanguageclient.libCommonCompletionMod.CompletionMiddleware
import typings.vscodeLanguageclient.libCommonDeclarationMod.DeclarationMiddleware
import typings.vscodeLanguageclient.libCommonDefinitionMod.DefinitionMiddleware
import typings.vscodeLanguageclient.libCommonDiagnosticMod.DiagnosticProviderMiddleware
import typings.vscodeLanguageclient.libCommonDocumentHighlightMod.DocumentHighlightMiddleware
import typings.vscodeLanguageclient.libCommonDocumentLinkMod.DocumentLinkMiddleware
import typings.vscodeLanguageclient.libCommonDocumentSymbolMod.DocumentSymbolMiddleware
import typings.vscodeLanguageclient.libCommonExecuteCommandMod.ExecuteCommandMiddleware
import typings.vscodeLanguageclient.libCommonFoldingRangeMod.FoldingRangeProviderMiddleware
import typings.vscodeLanguageclient.libCommonFormattingMod.FormattingMiddleware
import typings.vscodeLanguageclient.libCommonHoverMod.HoverMiddleware
import typings.vscodeLanguageclient.libCommonImplementationMod.ImplementationMiddleware
import typings.vscodeLanguageclient.libCommonInlayHintMod.InlayHintsMiddleware
import typings.vscodeLanguageclient.libCommonInlineValueMod.InlineValueMiddleware
import typings.vscodeLanguageclient.libCommonLinkedEditingRangeMod.LinkedEditingRangeMiddleware
import typings.vscodeLanguageclient.libCommonNotebookMod.NotebookDocumentMiddleware
import typings.vscodeLanguageclient.libCommonReferenceMod.ReferencesMiddleware
import typings.vscodeLanguageclient.libCommonRenameMod.RenameMiddleware
import typings.vscodeLanguageclient.libCommonSelectionRangeMod.SelectionRangeProviderMiddleware
import typings.vscodeLanguageclient.libCommonSemanticTokensMod.SemanticTokensMiddleware
import typings.vscodeLanguageclient.libCommonSignatureHelpMod.SignatureHelpMiddleware
import typings.vscodeLanguageclient.libCommonTextSynchronizationMod.TextDocumentSynchronizationMiddleware
import typings.vscodeLanguageclient.libCommonTypeDefinitionMod.TypeDefinitionMiddleware
import typings.vscodeLanguageclient.libCommonTypeHierarchyMod.TypeHierarchyMiddleware
import typings.vscodeLanguageclient.libCommonWorkspaceSymbolMod.WorkspaceSymbolMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware
  extends StObject
     with _Middleware
     with TextDocumentSynchronizationMiddleware
     with CompletionMiddleware
     with HoverMiddleware
     with DefinitionMiddleware
     with SignatureHelpMiddleware
     with DocumentHighlightMiddleware
     with DocumentSymbolMiddleware
     with WorkspaceSymbolMiddleware
     with ReferencesMiddleware
     with TypeDefinitionMiddleware
     with ImplementationMiddleware
     with ColorProviderMiddleware
     with CodeActionMiddleware
     with CodeLensMiddleware
     with FormattingMiddleware
     with RenameMiddleware
     with DocumentLinkMiddleware
     with ExecuteCommandMiddleware
     with FoldingRangeProviderMiddleware
     with DeclarationMiddleware
     with SelectionRangeProviderMiddleware
     with CallHierarchyMiddleware
     with SemanticTokensMiddleware
     with LinkedEditingRangeMiddleware
     with TypeHierarchyMiddleware
     with InlineValueMiddleware
     with InlayHintsMiddleware
     with NotebookDocumentMiddleware
     with DiagnosticProviderMiddleware
object Middleware {
  
  inline def apply(): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Middleware]
  }
}
