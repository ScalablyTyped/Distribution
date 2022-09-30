package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DocumentDiagnosticReportKind
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.FileOperationPatternKind
import typings.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind
import typings.vscodeLanguageserverProtocol.protocolMod.ResourceOperationKind
import typings.vscodeLanguageserverProtocol.protocolMonikerMod.MonikerKind
import typings.vscodeLanguageserverProtocol.protocolMonikerMod.UniquenessLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vscodeLanguageserverProtocolStrings {
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait abort
    extends StObject
       with FailureHandlingKind
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait begin extends StObject
  inline def begin: begin = "begin".asInstanceOf[begin]
  
  @js.native
  sealed trait callHierarchySlashincomingCalls extends StObject
  inline def callHierarchySlashincomingCalls: callHierarchySlashincomingCalls = "callHierarchy/incomingCalls".asInstanceOf[callHierarchySlashincomingCalls]
  
  @js.native
  sealed trait callHierarchySlashoutgoingCalls extends StObject
  inline def callHierarchySlashoutgoingCalls: callHierarchySlashoutgoingCalls = "callHierarchy/outgoingCalls".asInstanceOf[callHierarchySlashoutgoingCalls]
  
  @js.native
  sealed trait clientSlashregisterCapability extends StObject
  inline def clientSlashregisterCapability: clientSlashregisterCapability = "client/registerCapability".asInstanceOf[clientSlashregisterCapability]
  
  @js.native
  sealed trait clientSlashunregisterCapability extends StObject
  inline def clientSlashunregisterCapability: clientSlashunregisterCapability = "client/unregisterCapability".asInstanceOf[clientSlashunregisterCapability]
  
  @js.native
  sealed trait codeActionSlashresolve extends StObject
  inline def codeActionSlashresolve: codeActionSlashresolve = "codeAction/resolve".asInstanceOf[codeActionSlashresolve]
  
  @js.native
  sealed trait codeLensSlashresolve extends StObject
  inline def codeLensSlashresolve: codeLensSlashresolve = "codeLens/resolve".asInstanceOf[codeLensSlashresolve]
  
  @js.native
  sealed trait compact extends StObject
  inline def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait completionItemSlashresolve extends StObject
  inline def completionItemSlashresolve: completionItemSlashresolve = "completionItem/resolve".asInstanceOf[completionItemSlashresolve]
  
  @js.native
  sealed trait create
    extends StObject
       with ResourceOperationKind
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait delete
    extends StObject
       with ResourceOperationKind
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait document
    extends StObject
       with UniquenessLevel
  inline def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait documentLinkSlashresolve extends StObject
  inline def documentLinkSlashresolve: documentLinkSlashresolve = "documentLink/resolve".asInstanceOf[documentLinkSlashresolve]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait executionSummary extends StObject
  inline def executionSummary: executionSummary = "executionSummary".asInstanceOf[executionSummary]
  
  @js.native
  sealed trait exit extends StObject
  inline def exit: exit = "exit".asInstanceOf[exit]
  
  @js.native
  sealed trait `export`
    extends StObject
       with MonikerKind
  inline def `export`: `export` = "export".asInstanceOf[`export`]
  
  @js.native
  sealed trait file
    extends StObject
       with FileOperationPatternKind
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait folder
    extends StObject
       with FileOperationPatternKind
  inline def folder: folder = "folder".asInstanceOf[folder]
  
  @js.native
  sealed trait full
    extends StObject
       with DocumentDiagnosticReportKind
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait global
    extends StObject
       with UniquenessLevel
  inline def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait group
    extends StObject
       with UniquenessLevel
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait `import`
    extends StObject
       with MonikerKind
  inline def `import`: `import` = "import".asInstanceOf[`import`]
  
  @js.native
  sealed trait initialize extends StObject
  inline def initialize: initialize = "initialize".asInstanceOf[initialize]
  
  @js.native
  sealed trait initialized extends StObject
  inline def initialized: initialized = "initialized".asInstanceOf[initialized]
  
  @js.native
  sealed trait inlayHintSlashresolve extends StObject
  inline def inlayHintSlashresolve: inlayHintSlashresolve = "inlayHint/resolve".asInstanceOf[inlayHintSlashresolve]
  
  @js.native
  sealed trait kind extends StObject
  inline def kind: kind = "kind".asInstanceOf[kind]
  
  @js.native
  sealed trait local
    extends StObject
       with MonikerKind
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait markdown extends StObject
  inline def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @js.native
  sealed trait messages extends StObject
  inline def messages: messages = "messages".asInstanceOf[messages]
  
  @js.native
  sealed trait metadata extends StObject
  inline def metadata: metadata = "metadata".asInstanceOf[metadata]
  
  @js.native
  sealed trait notebookDocumentSlashdidChange extends StObject
  inline def notebookDocumentSlashdidChange: notebookDocumentSlashdidChange = "notebookDocument/didChange".asInstanceOf[notebookDocumentSlashdidChange]
  
  @js.native
  sealed trait notebookDocumentSlashdidClose extends StObject
  inline def notebookDocumentSlashdidClose: notebookDocumentSlashdidClose = "notebookDocument/didClose".asInstanceOf[notebookDocumentSlashdidClose]
  
  @js.native
  sealed trait notebookDocumentSlashdidOpen extends StObject
  inline def notebookDocumentSlashdidOpen: notebookDocumentSlashdidOpen = "notebookDocument/didOpen".asInstanceOf[notebookDocumentSlashdidOpen]
  
  @js.native
  sealed trait notebookDocumentSlashdidSave extends StObject
  inline def notebookDocumentSlashdidSave: notebookDocumentSlashdidSave = "notebookDocument/didSave".asInstanceOf[notebookDocumentSlashdidSave]
  
  @js.native
  sealed trait notebookDocumentSlashsync extends StObject
  inline def notebookDocumentSlashsync: notebookDocumentSlashsync = "notebookDocument/sync".asInstanceOf[notebookDocumentSlashsync]
  
  @js.native
  sealed trait off extends StObject
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait plaintext extends StObject
  inline def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  
  @js.native
  sealed trait project
    extends StObject
       with UniquenessLevel
  inline def project: project = "project".asInstanceOf[project]
  
  @js.native
  sealed trait quickfix extends StObject
  inline def quickfix: quickfix = "quickfix".asInstanceOf[quickfix]
  
  @js.native
  sealed trait refactor extends StObject
  inline def refactor: refactor = "refactor".asInstanceOf[refactor]
  
  @js.native
  sealed trait refactorDotextract extends StObject
  inline def refactorDotextract: refactorDotextract = "refactor.extract".asInstanceOf[refactorDotextract]
  
  @js.native
  sealed trait refactorDotinline extends StObject
  inline def refactorDotinline: refactorDotinline = "refactor.inline".asInstanceOf[refactorDotinline]
  
  @js.native
  sealed trait refactorDotrewrite extends StObject
  inline def refactorDotrewrite: refactorDotrewrite = "refactor.rewrite".asInstanceOf[refactorDotrewrite]
  
  @js.native
  sealed trait relative extends StObject
  inline def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait rename
    extends StObject
       with ResourceOperationKind
  inline def rename: rename = "rename".asInstanceOf[rename]
  
  @js.native
  sealed trait report extends StObject
  inline def report: report = "report".asInstanceOf[report]
  
  @js.native
  sealed trait scheme
    extends StObject
       with UniquenessLevel
  inline def scheme: scheme = "scheme".asInstanceOf[scheme]
  
  @js.native
  sealed trait shutdown extends StObject
  inline def shutdown: shutdown = "shutdown".asInstanceOf[shutdown]
  
  @js.native
  sealed trait source extends StObject
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait sourceDotfixAll extends StObject
  inline def sourceDotfixAll: sourceDotfixAll = "source.fixAll".asInstanceOf[sourceDotfixAll]
  
  @js.native
  sealed trait sourceDotorganizeImports extends StObject
  inline def sourceDotorganizeImports: sourceDotorganizeImports = "source.organizeImports".asInstanceOf[sourceDotorganizeImports]
  
  @js.native
  sealed trait telemetrySlashevent extends StObject
  inline def telemetrySlashevent: telemetrySlashevent = "telemetry/event".asInstanceOf[telemetrySlashevent]
  
  @js.native
  sealed trait textDocumentSlashcodeAction extends StObject
  inline def textDocumentSlashcodeAction: textDocumentSlashcodeAction = "textDocument/codeAction".asInstanceOf[textDocumentSlashcodeAction]
  
  @js.native
  sealed trait textDocumentSlashcodeLens extends StObject
  inline def textDocumentSlashcodeLens: textDocumentSlashcodeLens = "textDocument/codeLens".asInstanceOf[textDocumentSlashcodeLens]
  
  @js.native
  sealed trait textDocumentSlashcolorPresentation extends StObject
  inline def textDocumentSlashcolorPresentation: textDocumentSlashcolorPresentation = "textDocument/colorPresentation".asInstanceOf[textDocumentSlashcolorPresentation]
  
  @js.native
  sealed trait textDocumentSlashcompletion extends StObject
  inline def textDocumentSlashcompletion: textDocumentSlashcompletion = "textDocument/completion".asInstanceOf[textDocumentSlashcompletion]
  
  @js.native
  sealed trait textDocumentSlashdeclaration extends StObject
  inline def textDocumentSlashdeclaration: textDocumentSlashdeclaration = "textDocument/declaration".asInstanceOf[textDocumentSlashdeclaration]
  
  @js.native
  sealed trait textDocumentSlashdefinition extends StObject
  inline def textDocumentSlashdefinition: textDocumentSlashdefinition = "textDocument/definition".asInstanceOf[textDocumentSlashdefinition]
  
  @js.native
  sealed trait textDocumentSlashdiagnostic extends StObject
  inline def textDocumentSlashdiagnostic: textDocumentSlashdiagnostic = "textDocument/diagnostic".asInstanceOf[textDocumentSlashdiagnostic]
  
  @js.native
  sealed trait textDocumentSlashdidChange extends StObject
  inline def textDocumentSlashdidChange: textDocumentSlashdidChange = "textDocument/didChange".asInstanceOf[textDocumentSlashdidChange]
  
  @js.native
  sealed trait textDocumentSlashdidClose extends StObject
  inline def textDocumentSlashdidClose: textDocumentSlashdidClose = "textDocument/didClose".asInstanceOf[textDocumentSlashdidClose]
  
  @js.native
  sealed trait textDocumentSlashdidOpen extends StObject
  inline def textDocumentSlashdidOpen: textDocumentSlashdidOpen = "textDocument/didOpen".asInstanceOf[textDocumentSlashdidOpen]
  
  @js.native
  sealed trait textDocumentSlashdidSave extends StObject
  inline def textDocumentSlashdidSave: textDocumentSlashdidSave = "textDocument/didSave".asInstanceOf[textDocumentSlashdidSave]
  
  @js.native
  sealed trait textDocumentSlashdocumentColor extends StObject
  inline def textDocumentSlashdocumentColor: textDocumentSlashdocumentColor = "textDocument/documentColor".asInstanceOf[textDocumentSlashdocumentColor]
  
  @js.native
  sealed trait textDocumentSlashdocumentHighlight extends StObject
  inline def textDocumentSlashdocumentHighlight: textDocumentSlashdocumentHighlight = "textDocument/documentHighlight".asInstanceOf[textDocumentSlashdocumentHighlight]
  
  @js.native
  sealed trait textDocumentSlashdocumentLink extends StObject
  inline def textDocumentSlashdocumentLink: textDocumentSlashdocumentLink = "textDocument/documentLink".asInstanceOf[textDocumentSlashdocumentLink]
  
  @js.native
  sealed trait textDocumentSlashdocumentSymbol extends StObject
  inline def textDocumentSlashdocumentSymbol: textDocumentSlashdocumentSymbol = "textDocument/documentSymbol".asInstanceOf[textDocumentSlashdocumentSymbol]
  
  @js.native
  sealed trait textDocumentSlashfoldingRange extends StObject
  inline def textDocumentSlashfoldingRange: textDocumentSlashfoldingRange = "textDocument/foldingRange".asInstanceOf[textDocumentSlashfoldingRange]
  
  @js.native
  sealed trait textDocumentSlashformatting extends StObject
  inline def textDocumentSlashformatting: textDocumentSlashformatting = "textDocument/formatting".asInstanceOf[textDocumentSlashformatting]
  
  @js.native
  sealed trait textDocumentSlashhover extends StObject
  inline def textDocumentSlashhover: textDocumentSlashhover = "textDocument/hover".asInstanceOf[textDocumentSlashhover]
  
  @js.native
  sealed trait textDocumentSlashimplementation extends StObject
  inline def textDocumentSlashimplementation: textDocumentSlashimplementation = "textDocument/implementation".asInstanceOf[textDocumentSlashimplementation]
  
  @js.native
  sealed trait textDocumentSlashinlayHint extends StObject
  inline def textDocumentSlashinlayHint: textDocumentSlashinlayHint = "textDocument/inlayHint".asInstanceOf[textDocumentSlashinlayHint]
  
  @js.native
  sealed trait textDocumentSlashinlineValue extends StObject
  inline def textDocumentSlashinlineValue: textDocumentSlashinlineValue = "textDocument/inlineValue".asInstanceOf[textDocumentSlashinlineValue]
  
  @js.native
  sealed trait textDocumentSlashlinkedEditingRange extends StObject
  inline def textDocumentSlashlinkedEditingRange: textDocumentSlashlinkedEditingRange = "textDocument/linkedEditingRange".asInstanceOf[textDocumentSlashlinkedEditingRange]
  
  @js.native
  sealed trait textDocumentSlashmoniker extends StObject
  inline def textDocumentSlashmoniker: textDocumentSlashmoniker = "textDocument/moniker".asInstanceOf[textDocumentSlashmoniker]
  
  @js.native
  sealed trait textDocumentSlashonTypeFormatting extends StObject
  inline def textDocumentSlashonTypeFormatting: textDocumentSlashonTypeFormatting = "textDocument/onTypeFormatting".asInstanceOf[textDocumentSlashonTypeFormatting]
  
  @js.native
  sealed trait textDocumentSlashprepareCallHierarchy extends StObject
  inline def textDocumentSlashprepareCallHierarchy: textDocumentSlashprepareCallHierarchy = "textDocument/prepareCallHierarchy".asInstanceOf[textDocumentSlashprepareCallHierarchy]
  
  @js.native
  sealed trait textDocumentSlashprepareRename extends StObject
  inline def textDocumentSlashprepareRename: textDocumentSlashprepareRename = "textDocument/prepareRename".asInstanceOf[textDocumentSlashprepareRename]
  
  @js.native
  sealed trait textDocumentSlashprepareTypeHierarchy extends StObject
  inline def textDocumentSlashprepareTypeHierarchy: textDocumentSlashprepareTypeHierarchy = "textDocument/prepareTypeHierarchy".asInstanceOf[textDocumentSlashprepareTypeHierarchy]
  
  @js.native
  sealed trait textDocumentSlashpublishDiagnostics extends StObject
  inline def textDocumentSlashpublishDiagnostics: textDocumentSlashpublishDiagnostics = "textDocument/publishDiagnostics".asInstanceOf[textDocumentSlashpublishDiagnostics]
  
  @js.native
  sealed trait textDocumentSlashrangeFormatting extends StObject
  inline def textDocumentSlashrangeFormatting: textDocumentSlashrangeFormatting = "textDocument/rangeFormatting".asInstanceOf[textDocumentSlashrangeFormatting]
  
  @js.native
  sealed trait textDocumentSlashreferences extends StObject
  inline def textDocumentSlashreferences: textDocumentSlashreferences = "textDocument/references".asInstanceOf[textDocumentSlashreferences]
  
  @js.native
  sealed trait textDocumentSlashrename extends StObject
  inline def textDocumentSlashrename: textDocumentSlashrename = "textDocument/rename".asInstanceOf[textDocumentSlashrename]
  
  @js.native
  sealed trait textDocumentSlashselectionRange extends StObject
  inline def textDocumentSlashselectionRange: textDocumentSlashselectionRange = "textDocument/selectionRange".asInstanceOf[textDocumentSlashselectionRange]
  
  @js.native
  sealed trait textDocumentSlashsemanticTokens extends StObject
  inline def textDocumentSlashsemanticTokens: textDocumentSlashsemanticTokens = "textDocument/semanticTokens".asInstanceOf[textDocumentSlashsemanticTokens]
  
  @js.native
  sealed trait textDocumentSlashsemanticTokensSlashfull extends StObject
  inline def textDocumentSlashsemanticTokensSlashfull: textDocumentSlashsemanticTokensSlashfull = "textDocument/semanticTokens/full".asInstanceOf[textDocumentSlashsemanticTokensSlashfull]
  
  @js.native
  sealed trait textDocumentSlashsemanticTokensSlashfullSlashdelta extends StObject
  inline def textDocumentSlashsemanticTokensSlashfullSlashdelta: textDocumentSlashsemanticTokensSlashfullSlashdelta = "textDocument/semanticTokens/full/delta".asInstanceOf[textDocumentSlashsemanticTokensSlashfullSlashdelta]
  
  @js.native
  sealed trait textDocumentSlashsemanticTokensSlashrange extends StObject
  inline def textDocumentSlashsemanticTokensSlashrange: textDocumentSlashsemanticTokensSlashrange = "textDocument/semanticTokens/range".asInstanceOf[textDocumentSlashsemanticTokensSlashrange]
  
  @js.native
  sealed trait textDocumentSlashsignatureHelp extends StObject
  inline def textDocumentSlashsignatureHelp: textDocumentSlashsignatureHelp = "textDocument/signatureHelp".asInstanceOf[textDocumentSlashsignatureHelp]
  
  @js.native
  sealed trait textDocumentSlashtypeDefinition extends StObject
  inline def textDocumentSlashtypeDefinition: textDocumentSlashtypeDefinition = "textDocument/typeDefinition".asInstanceOf[textDocumentSlashtypeDefinition]
  
  @js.native
  sealed trait textDocumentSlashwillSave extends StObject
  inline def textDocumentSlashwillSave: textDocumentSlashwillSave = "textDocument/willSave".asInstanceOf[textDocumentSlashwillSave]
  
  @js.native
  sealed trait textDocumentSlashwillSaveWaitUntil extends StObject
  inline def textDocumentSlashwillSaveWaitUntil: textDocumentSlashwillSaveWaitUntil = "textDocument/willSaveWaitUntil".asInstanceOf[textDocumentSlashwillSaveWaitUntil]
  
  @js.native
  sealed trait textOnlyTransactional
    extends StObject
       with FailureHandlingKind
  inline def textOnlyTransactional: textOnlyTransactional = "textOnlyTransactional".asInstanceOf[textOnlyTransactional]
  
  @js.native
  sealed trait transactional
    extends StObject
       with FailureHandlingKind
  inline def transactional: transactional = "transactional".asInstanceOf[transactional]
  
  @js.native
  sealed trait typeHierarchySlashsubtypes extends StObject
  inline def typeHierarchySlashsubtypes: typeHierarchySlashsubtypes = "typeHierarchy/subtypes".asInstanceOf[typeHierarchySlashsubtypes]
  
  @js.native
  sealed trait typeHierarchySlashsupertypes extends StObject
  inline def typeHierarchySlashsupertypes: typeHierarchySlashsupertypes = "typeHierarchy/supertypes".asInstanceOf[typeHierarchySlashsupertypes]
  
  @js.native
  sealed trait unchanged
    extends StObject
       with DocumentDiagnosticReportKind
  inline def unchanged: unchanged = "unchanged".asInstanceOf[unchanged]
  
  @js.native
  sealed trait undo
    extends StObject
       with FailureHandlingKind
  inline def undo: undo = "undo".asInstanceOf[undo]
  
  @js.native
  sealed trait verbose extends StObject
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait windowSlashlogMessage extends StObject
  inline def windowSlashlogMessage: windowSlashlogMessage = "window/logMessage".asInstanceOf[windowSlashlogMessage]
  
  @js.native
  sealed trait windowSlashshowDocument extends StObject
  inline def windowSlashshowDocument: windowSlashshowDocument = "window/showDocument".asInstanceOf[windowSlashshowDocument]
  
  @js.native
  sealed trait windowSlashshowMessage extends StObject
  inline def windowSlashshowMessage: windowSlashshowMessage = "window/showMessage".asInstanceOf[windowSlashshowMessage]
  
  @js.native
  sealed trait windowSlashshowMessageRequest extends StObject
  inline def windowSlashshowMessageRequest: windowSlashshowMessageRequest = "window/showMessageRequest".asInstanceOf[windowSlashshowMessageRequest]
  
  @js.native
  sealed trait windowSlashworkDoneProgressSlashcancel extends StObject
  inline def windowSlashworkDoneProgressSlashcancel: windowSlashworkDoneProgressSlashcancel = "window/workDoneProgress/cancel".asInstanceOf[windowSlashworkDoneProgressSlashcancel]
  
  @js.native
  sealed trait windowSlashworkDoneProgressSlashcreate extends StObject
  inline def windowSlashworkDoneProgressSlashcreate: windowSlashworkDoneProgressSlashcreate = "window/workDoneProgress/create".asInstanceOf[windowSlashworkDoneProgressSlashcreate]
  
  @js.native
  sealed trait workspaceSlashapplyEdit extends StObject
  inline def workspaceSlashapplyEdit: workspaceSlashapplyEdit = "workspace/applyEdit".asInstanceOf[workspaceSlashapplyEdit]
  
  @js.native
  sealed trait workspaceSlashconfiguration extends StObject
  inline def workspaceSlashconfiguration: workspaceSlashconfiguration = "workspace/configuration".asInstanceOf[workspaceSlashconfiguration]
  
  @js.native
  sealed trait workspaceSlashdiagnostic extends StObject
  inline def workspaceSlashdiagnostic: workspaceSlashdiagnostic = "workspace/diagnostic".asInstanceOf[workspaceSlashdiagnostic]
  
  @js.native
  sealed trait workspaceSlashdidChangeConfiguration extends StObject
  inline def workspaceSlashdidChangeConfiguration: workspaceSlashdidChangeConfiguration = "workspace/didChangeConfiguration".asInstanceOf[workspaceSlashdidChangeConfiguration]
  
  @js.native
  sealed trait workspaceSlashdidChangeWatchedFiles extends StObject
  inline def workspaceSlashdidChangeWatchedFiles: workspaceSlashdidChangeWatchedFiles = "workspace/didChangeWatchedFiles".asInstanceOf[workspaceSlashdidChangeWatchedFiles]
  
  @js.native
  sealed trait workspaceSlashdidChangeWorkspaceFolders extends StObject
  inline def workspaceSlashdidChangeWorkspaceFolders: workspaceSlashdidChangeWorkspaceFolders = "workspace/didChangeWorkspaceFolders".asInstanceOf[workspaceSlashdidChangeWorkspaceFolders]
  
  @js.native
  sealed trait workspaceSlashdidCreateFiles extends StObject
  inline def workspaceSlashdidCreateFiles: workspaceSlashdidCreateFiles = "workspace/didCreateFiles".asInstanceOf[workspaceSlashdidCreateFiles]
  
  @js.native
  sealed trait workspaceSlashdidDeleteFiles extends StObject
  inline def workspaceSlashdidDeleteFiles: workspaceSlashdidDeleteFiles = "workspace/didDeleteFiles".asInstanceOf[workspaceSlashdidDeleteFiles]
  
  @js.native
  sealed trait workspaceSlashdidRenameFiles extends StObject
  inline def workspaceSlashdidRenameFiles: workspaceSlashdidRenameFiles = "workspace/didRenameFiles".asInstanceOf[workspaceSlashdidRenameFiles]
  
  @js.native
  sealed trait workspaceSlashexecuteCommand extends StObject
  inline def workspaceSlashexecuteCommand: workspaceSlashexecuteCommand = "workspace/executeCommand".asInstanceOf[workspaceSlashexecuteCommand]
  
  @js.native
  sealed trait workspaceSlashsymbol extends StObject
  inline def workspaceSlashsymbol: workspaceSlashsymbol = "workspace/symbol".asInstanceOf[workspaceSlashsymbol]
  
  @js.native
  sealed trait workspaceSlashwillCreateFiles extends StObject
  inline def workspaceSlashwillCreateFiles: workspaceSlashwillCreateFiles = "workspace/willCreateFiles".asInstanceOf[workspaceSlashwillCreateFiles]
  
  @js.native
  sealed trait workspaceSlashwillDeleteFiles extends StObject
  inline def workspaceSlashwillDeleteFiles: workspaceSlashwillDeleteFiles = "workspace/willDeleteFiles".asInstanceOf[workspaceSlashwillDeleteFiles]
  
  @js.native
  sealed trait workspaceSlashwillRenameFiles extends StObject
  inline def workspaceSlashwillRenameFiles: workspaceSlashwillRenameFiles = "workspace/willRenameFiles".asInstanceOf[workspaceSlashwillRenameFiles]
  
  @js.native
  sealed trait workspaceSlashworkspaceFolders extends StObject
  inline def workspaceSlashworkspaceFolders: workspaceSlashworkspaceFolders = "workspace/workspaceFolders".asInstanceOf[workspaceSlashworkspaceFolders]
  
  @js.native
  sealed trait workspaceSymbolSlashresolve extends StObject
  inline def workspaceSymbolSlashresolve: workspaceSymbolSlashresolve = "workspaceSymbol/resolve".asInstanceOf[workspaceSymbolSlashresolve]
}
