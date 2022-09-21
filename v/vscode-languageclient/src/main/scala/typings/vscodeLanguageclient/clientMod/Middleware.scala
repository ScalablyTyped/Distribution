package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.callHierarchyMod.CallHierarchyMiddleware
import typings.vscodeLanguageclient.codeActionMod.CodeActionMiddleware
import typings.vscodeLanguageclient.codeLensMod.CodeLensMiddleware
import typings.vscodeLanguageclient.colorProviderMod.ColorProviderMiddleware
import typings.vscodeLanguageclient.completionMod.CompletionMiddleware
import typings.vscodeLanguageclient.declarationMod.DeclarationMiddleware
import typings.vscodeLanguageclient.definitionMod.DefinitionMiddleware
import typings.vscodeLanguageclient.diagnosticMod.DiagnosticProviderMiddleware
import typings.vscodeLanguageclient.documentHighlightMod.DocumentHighlightMiddleware
import typings.vscodeLanguageclient.documentLinkMod.DocumentLinkMiddleware
import typings.vscodeLanguageclient.documentSymbolMod.DocumentSymbolMiddleware
import typings.vscodeLanguageclient.executeCommandMod.ExecuteCommandMiddleware
import typings.vscodeLanguageclient.foldingRangeMod.FoldingRangeProviderMiddleware
import typings.vscodeLanguageclient.formattingMod.FormattingMiddleware
import typings.vscodeLanguageclient.hoverMod.HoverMiddleware
import typings.vscodeLanguageclient.implementationMod.ImplementationMiddleware
import typings.vscodeLanguageclient.inlayHintMod.InlayHintsMiddleware
import typings.vscodeLanguageclient.inlineValueMod.InlineValueMiddleware
import typings.vscodeLanguageclient.linkedEditingRangeMod.LinkedEditingRangeMiddleware
import typings.vscodeLanguageclient.notebookMod.NotebookDocumentMiddleware
import typings.vscodeLanguageclient.referenceMod.ReferencesMiddleware
import typings.vscodeLanguageclient.renameMod.RenameMiddleware
import typings.vscodeLanguageclient.selectionRangeMod.SelectionRangeProviderMiddleware
import typings.vscodeLanguageclient.semanticTokensMod.SemanticTokensMiddleware
import typings.vscodeLanguageclient.signatureHelpMod.SignatureHelpMiddleware
import typings.vscodeLanguageclient.textSynchronizationMod.TextDocumentSynchronizationMiddleware
import typings.vscodeLanguageclient.typeDefinitionMod.TypeDefinitionMiddleware
import typings.vscodeLanguageclient.typeHierarchyMod.TypeHierarchyMiddleware
import typings.vscodeLanguageclient.workspaceSymbolMod.WorkspaceSymbolMiddleware
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
