package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind
import typings.vscodeLanguageserverProtocol.protocolMod.ResourceOperationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vscodeLanguageserverProtocolStrings {
  @js.native
  sealed trait abort extends FailureHandlingKind
  
  @js.native
  sealed trait begin extends js.Object
  
  @js.native
  sealed trait callHierarchySlashincomingCalls extends js.Object
  
  @js.native
  sealed trait callHierarchySlashoutgoingCalls extends js.Object
  
  @js.native
  sealed trait completionItemSlashresolve extends js.Object
  
  @js.native
  sealed trait create extends ResourceOperationKind
  
  @js.native
  sealed trait delete extends ResourceOperationKind
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait markdown extends js.Object
  
  @js.native
  sealed trait messages extends js.Object
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait plaintext extends js.Object
  
  @js.native
  sealed trait rename extends ResourceOperationKind
  
  @js.native
  sealed trait report extends js.Object
  
  @js.native
  sealed trait textDocumentSlashcodeAction extends js.Object
  
  @js.native
  sealed trait textDocumentSlashcompletion extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdeclaration extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdefinition extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdidChange extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdidClose extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdidOpen extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdidSave extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdocumentColor extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdocumentHighlight extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdocumentLink extends js.Object
  
  @js.native
  sealed trait textDocumentSlashdocumentSymbol extends js.Object
  
  @js.native
  sealed trait textDocumentSlashfoldingRange extends js.Object
  
  @js.native
  sealed trait textDocumentSlashformatting extends js.Object
  
  @js.native
  sealed trait textDocumentSlashhover extends js.Object
  
  @js.native
  sealed trait textDocumentSlashimplementation extends js.Object
  
  @js.native
  sealed trait textDocumentSlashonTypeFormatting extends js.Object
  
  @js.native
  sealed trait textDocumentSlashprepareCallHierarchy extends js.Object
  
  @js.native
  sealed trait textDocumentSlashprepareRename extends js.Object
  
  @js.native
  sealed trait textDocumentSlashrangeFormatting extends js.Object
  
  @js.native
  sealed trait textDocumentSlashreferences extends js.Object
  
  @js.native
  sealed trait textDocumentSlashrename extends js.Object
  
  @js.native
  sealed trait textDocumentSlashselectionRange extends js.Object
  
  @js.native
  sealed trait textDocumentSlashsemanticTokens extends js.Object
  
  @js.native
  sealed trait textDocumentSlashsemanticTokensSlashedits extends js.Object
  
  @js.native
  sealed trait textDocumentSlashsemanticTokensSlashrange extends js.Object
  
  @js.native
  sealed trait textDocumentSlashsignatureHelp extends js.Object
  
  @js.native
  sealed trait textDocumentSlashtypeDefinition extends js.Object
  
  @js.native
  sealed trait textDocumentSlashwillSave extends js.Object
  
  @js.native
  sealed trait textDocumentSlashwillSaveWaitUntil extends js.Object
  
  @js.native
  sealed trait textOnlyTransactional extends FailureHandlingKind
  
  @js.native
  sealed trait transactional extends FailureHandlingKind
  
  @js.native
  sealed trait undo extends FailureHandlingKind
  
  @js.native
  sealed trait verbose extends js.Object
  
  @js.native
  sealed trait workspaceSlashsymbol extends js.Object
  
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def begin: begin = "begin".asInstanceOf[begin]
  @scala.inline
  def callHierarchySlashincomingCalls: callHierarchySlashincomingCalls = "callHierarchy/incomingCalls".asInstanceOf[callHierarchySlashincomingCalls]
  @scala.inline
  def callHierarchySlashoutgoingCalls: callHierarchySlashoutgoingCalls = "callHierarchy/outgoingCalls".asInstanceOf[callHierarchySlashoutgoingCalls]
  @scala.inline
  def completionItemSlashresolve: completionItemSlashresolve = "completionItem/resolve".asInstanceOf[completionItemSlashresolve]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  @scala.inline
  def messages: messages = "messages".asInstanceOf[messages]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
  @scala.inline
  def report: report = "report".asInstanceOf[report]
  @scala.inline
  def textDocumentSlashcodeAction: textDocumentSlashcodeAction = "textDocument/codeAction".asInstanceOf[textDocumentSlashcodeAction]
  @scala.inline
  def textDocumentSlashcompletion: textDocumentSlashcompletion = "textDocument/completion".asInstanceOf[textDocumentSlashcompletion]
  @scala.inline
  def textDocumentSlashdeclaration: textDocumentSlashdeclaration = "textDocument/declaration".asInstanceOf[textDocumentSlashdeclaration]
  @scala.inline
  def textDocumentSlashdefinition: textDocumentSlashdefinition = "textDocument/definition".asInstanceOf[textDocumentSlashdefinition]
  @scala.inline
  def textDocumentSlashdidChange: textDocumentSlashdidChange = "textDocument/didChange".asInstanceOf[textDocumentSlashdidChange]
  @scala.inline
  def textDocumentSlashdidClose: textDocumentSlashdidClose = "textDocument/didClose".asInstanceOf[textDocumentSlashdidClose]
  @scala.inline
  def textDocumentSlashdidOpen: textDocumentSlashdidOpen = "textDocument/didOpen".asInstanceOf[textDocumentSlashdidOpen]
  @scala.inline
  def textDocumentSlashdidSave: textDocumentSlashdidSave = "textDocument/didSave".asInstanceOf[textDocumentSlashdidSave]
  @scala.inline
  def textDocumentSlashdocumentColor: textDocumentSlashdocumentColor = "textDocument/documentColor".asInstanceOf[textDocumentSlashdocumentColor]
  @scala.inline
  def textDocumentSlashdocumentHighlight: textDocumentSlashdocumentHighlight = "textDocument/documentHighlight".asInstanceOf[textDocumentSlashdocumentHighlight]
  @scala.inline
  def textDocumentSlashdocumentLink: textDocumentSlashdocumentLink = "textDocument/documentLink".asInstanceOf[textDocumentSlashdocumentLink]
  @scala.inline
  def textDocumentSlashdocumentSymbol: textDocumentSlashdocumentSymbol = "textDocument/documentSymbol".asInstanceOf[textDocumentSlashdocumentSymbol]
  @scala.inline
  def textDocumentSlashfoldingRange: textDocumentSlashfoldingRange = "textDocument/foldingRange".asInstanceOf[textDocumentSlashfoldingRange]
  @scala.inline
  def textDocumentSlashformatting: textDocumentSlashformatting = "textDocument/formatting".asInstanceOf[textDocumentSlashformatting]
  @scala.inline
  def textDocumentSlashhover: textDocumentSlashhover = "textDocument/hover".asInstanceOf[textDocumentSlashhover]
  @scala.inline
  def textDocumentSlashimplementation: textDocumentSlashimplementation = "textDocument/implementation".asInstanceOf[textDocumentSlashimplementation]
  @scala.inline
  def textDocumentSlashonTypeFormatting: textDocumentSlashonTypeFormatting = "textDocument/onTypeFormatting".asInstanceOf[textDocumentSlashonTypeFormatting]
  @scala.inline
  def textDocumentSlashprepareCallHierarchy: textDocumentSlashprepareCallHierarchy = "textDocument/prepareCallHierarchy".asInstanceOf[textDocumentSlashprepareCallHierarchy]
  @scala.inline
  def textDocumentSlashprepareRename: textDocumentSlashprepareRename = "textDocument/prepareRename".asInstanceOf[textDocumentSlashprepareRename]
  @scala.inline
  def textDocumentSlashrangeFormatting: textDocumentSlashrangeFormatting = "textDocument/rangeFormatting".asInstanceOf[textDocumentSlashrangeFormatting]
  @scala.inline
  def textDocumentSlashreferences: textDocumentSlashreferences = "textDocument/references".asInstanceOf[textDocumentSlashreferences]
  @scala.inline
  def textDocumentSlashrename: textDocumentSlashrename = "textDocument/rename".asInstanceOf[textDocumentSlashrename]
  @scala.inline
  def textDocumentSlashselectionRange: textDocumentSlashselectionRange = "textDocument/selectionRange".asInstanceOf[textDocumentSlashselectionRange]
  @scala.inline
  def textDocumentSlashsemanticTokens: textDocumentSlashsemanticTokens = "textDocument/semanticTokens".asInstanceOf[textDocumentSlashsemanticTokens]
  @scala.inline
  def textDocumentSlashsemanticTokensSlashedits: textDocumentSlashsemanticTokensSlashedits = "textDocument/semanticTokens/edits".asInstanceOf[textDocumentSlashsemanticTokensSlashedits]
  @scala.inline
  def textDocumentSlashsemanticTokensSlashrange: textDocumentSlashsemanticTokensSlashrange = "textDocument/semanticTokens/range".asInstanceOf[textDocumentSlashsemanticTokensSlashrange]
  @scala.inline
  def textDocumentSlashsignatureHelp: textDocumentSlashsignatureHelp = "textDocument/signatureHelp".asInstanceOf[textDocumentSlashsignatureHelp]
  @scala.inline
  def textDocumentSlashtypeDefinition: textDocumentSlashtypeDefinition = "textDocument/typeDefinition".asInstanceOf[textDocumentSlashtypeDefinition]
  @scala.inline
  def textDocumentSlashwillSave: textDocumentSlashwillSave = "textDocument/willSave".asInstanceOf[textDocumentSlashwillSave]
  @scala.inline
  def textDocumentSlashwillSaveWaitUntil: textDocumentSlashwillSaveWaitUntil = "textDocument/willSaveWaitUntil".asInstanceOf[textDocumentSlashwillSaveWaitUntil]
  @scala.inline
  def textOnlyTransactional: textOnlyTransactional = "textOnlyTransactional".asInstanceOf[textOnlyTransactional]
  @scala.inline
  def transactional: transactional = "transactional".asInstanceOf[transactional]
  @scala.inline
  def undo: undo = "undo".asInstanceOf[undo]
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  @scala.inline
  def workspaceSlashsymbol: workspaceSlashsymbol = "workspace/symbol".asInstanceOf[workspaceSlashsymbol]
}

