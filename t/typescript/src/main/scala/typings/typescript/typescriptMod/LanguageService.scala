package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageService extends js.Object {
  var toLineColumnOffset: js.UndefOr[js.Function2[/* fileName */ String, /* position */ Double, LineAndCharacter]] = js.native
  def applyCodeActionCommand(action: js.Array[CodeActionCommand]): js.Promise[js.Array[ApplyCodeActionCommandResult]] = js.native
  def applyCodeActionCommand(action: js.Array[CodeActionCommand], formatSettings: FormatCodeSettings): js.Promise[js.Array[ApplyCodeActionCommandResult]] = js.native
  def applyCodeActionCommand(action: CodeActionCommand): js.Promise[ApplyCodeActionCommandResult] = js.native
  def applyCodeActionCommand(action: CodeActionCommand, formatSettings: FormatCodeSettings): js.Promise[ApplyCodeActionCommandResult] = js.native
  /** @deprecated `fileName` will be ignored */
  def applyCodeActionCommand(fileName: String, action: js.Array[CodeActionCommand]): js.Promise[js.Array[ApplyCodeActionCommandResult]] = js.native
  /** @deprecated `fileName` will be ignored */
  def applyCodeActionCommand(fileName: String, action: CodeActionCommand): js.Promise[ApplyCodeActionCommandResult] = js.native
  def cleanupSemanticCache(): Unit = js.native
  def dispose(): Unit = js.native
  def findReferences(fileName: String, position: Double): js.UndefOr[js.Array[ReferencedSymbol]] = js.native
  def findRenameLocations(fileName: String, position: Double, findInStrings: Boolean, findInComments: Boolean): js.UndefOr[js.Array[RenameLocation]] = js.native
  def findRenameLocations(
    fileName: String,
    position: Double,
    findInStrings: Boolean,
    findInComments: Boolean,
    providePrefixAndSuffixTextForRename: Boolean
  ): js.UndefOr[js.Array[RenameLocation]] = js.native
  def getApplicableRefactors(fileName: String, positionOrRange: Double): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(fileName: String, positionOrRange: Double, preferences: UserPreferences): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(fileName: String, positionOrRange: TextRange): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(fileName: String, positionOrRange: TextRange, preferences: UserPreferences): js.Array[ApplicableRefactorInfo] = js.native
  def getBraceMatchingAtPosition(fileName: String, position: Double): js.Array[TextSpan] = js.native
  def getBreakpointStatementAtPosition(fileName: String, position: Double): js.UndefOr[TextSpan] = js.native
  def getCodeFixesAtPosition(
    fileName: String,
    start: Double,
    end: Double,
    errorCodes: js.Array[Double],
    formatOptions: FormatCodeSettings,
    preferences: UserPreferences
  ): js.Array[CodeFixAction] = js.native
  def getCombinedCodeFix(
    scope: CombinedCodeFixScope,
    fixId: js.Object,
    formatOptions: FormatCodeSettings,
    preferences: UserPreferences
  ): CombinedCodeActions = js.native
  def getCompilerOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  def getCompletionEntryDetails(fileName: String, position: Double, name: String): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: String,
    position: Double,
    name: String,
    formatOptions: js.UndefOr[scala.Nothing],
    source: js.UndefOr[scala.Nothing],
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: String,
    position: Double,
    name: String,
    formatOptions: js.UndefOr[scala.Nothing],
    source: String
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: String,
    position: Double,
    name: String,
    formatOptions: js.UndefOr[scala.Nothing],
    source: String,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(fileName: String, position: Double, name: String, formatOptions: FormatCodeOptions): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: String,
    position: Double,
    name: String,
    formatOptions: FormatCodeOptions,
    source: js.UndefOr[scala.Nothing],
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(fileName: String, position: Double, name: String, formatOptions: FormatCodeOptions, source: String): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: String,
    position: Double,
    name: String,
    formatOptions: FormatCodeOptions,
    source: String,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(fileName: String, position: Double, name: String, formatOptions: FormatCodeSettings): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: String,
    position: Double,
    name: String,
    formatOptions: FormatCodeSettings,
    source: js.UndefOr[scala.Nothing],
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: String,
    position: Double,
    name: String,
    formatOptions: FormatCodeSettings,
    source: String
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: String,
    position: Double,
    name: String,
    formatOptions: FormatCodeSettings,
    source: String,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntrySymbol(fileName: String, position: Double, name: String): js.UndefOr[Symbol] = js.native
  def getCompletionEntrySymbol(fileName: String, position: Double, name: String, source: String): js.UndefOr[Symbol] = js.native
  def getCompletionsAtPosition(fileName: String, position: Double): js.UndefOr[WithMetadata[CompletionInfo]] = js.native
  def getCompletionsAtPosition(fileName: String, position: Double, options: GetCompletionsAtPositionOptions): js.UndefOr[WithMetadata[CompletionInfo]] = js.native
  def getDefinitionAndBoundSpan(fileName: String, position: Double): js.UndefOr[DefinitionInfoAndBoundSpan] = js.native
  def getDefinitionAtPosition(fileName: String, position: Double): js.UndefOr[js.Array[DefinitionInfo]] = js.native
  def getDocCommentTemplateAtPosition(fileName: String, position: Double): js.UndefOr[TextInsertion] = js.native
  def getDocumentHighlights(fileName: String, position: Double, filesToSearch: js.Array[String]): js.UndefOr[js.Array[DocumentHighlights]] = js.native
  def getEditsForFileRename(oldFilePath: String, newFilePath: String, formatOptions: FormatCodeSettings): js.Array[FileTextChanges] = js.native
  def getEditsForFileRename(
    oldFilePath: String,
    newFilePath: String,
    formatOptions: FormatCodeSettings,
    preferences: UserPreferences
  ): js.Array[FileTextChanges] = js.native
  def getEditsForRefactor(
    fileName: String,
    formatOptions: FormatCodeSettings,
    positionOrRange: Double,
    refactorName: String,
    actionName: String
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEditsForRefactor(
    fileName: String,
    formatOptions: FormatCodeSettings,
    positionOrRange: Double,
    refactorName: String,
    actionName: String,
    preferences: UserPreferences
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEditsForRefactor(
    fileName: String,
    formatOptions: FormatCodeSettings,
    positionOrRange: TextRange,
    refactorName: String,
    actionName: String
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEditsForRefactor(
    fileName: String,
    formatOptions: FormatCodeSettings,
    positionOrRange: TextRange,
    refactorName: String,
    actionName: String,
    preferences: UserPreferences
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEmitOutput(fileName: String): EmitOutput = js.native
  def getEmitOutput(fileName: String, emitOnlyDtsFiles: Boolean): EmitOutput = js.native
  def getEmitOutput(fileName: String, emitOnlyDtsFiles: Boolean, forceDtsEmit: Boolean): EmitOutput = js.native
  def getEncodedSemanticClassifications(fileName: String, span: TextSpan): Classifications = js.native
  def getEncodedSyntacticClassifications(fileName: String, span: TextSpan): Classifications = js.native
  def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: FormatCodeOptions): js.Array[TextChange] = js.native
  def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: FormatCodeSettings): js.Array[TextChange] = js.native
  def getFormattingEditsForDocument(fileName: String, options: FormatCodeOptions): js.Array[TextChange] = js.native
  def getFormattingEditsForDocument(fileName: String, options: FormatCodeSettings): js.Array[TextChange] = js.native
  def getFormattingEditsForRange(fileName: String, start: Double, end: Double, options: FormatCodeOptions): js.Array[TextChange] = js.native
  def getFormattingEditsForRange(fileName: String, start: Double, end: Double, options: FormatCodeSettings): js.Array[TextChange] = js.native
  def getImplementationAtPosition(fileName: String, position: Double): js.UndefOr[js.Array[ImplementationLocation]] = js.native
  def getIndentationAtPosition(fileName: String, position: Double, options: EditorOptions): Double = js.native
  def getIndentationAtPosition(fileName: String, position: Double, options: EditorSettings): Double = js.native
  /**
    * This will return a defined result if the position is after the `>` of the opening tag, or somewhere in the text, of a JSXElement with no closing tag.
    * Editors should call this after `>` is typed.
    */
  def getJsxClosingTagAtPosition(fileName: String, position: Double): js.UndefOr[JsxClosingTagInfo] = js.native
  def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): js.UndefOr[TextSpan] = js.native
  def getNavigateToItems(searchValue: String): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: String, maxResultCount: Double): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: String, maxResultCount: Double, fileName: String): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: String, maxResultCount: Double, fileName: String, excludeDtsFiles: Boolean): js.Array[NavigateToItem] = js.native
  def getNavigationBarItems(fileName: String): js.Array[NavigationBarItem] = js.native
  def getNavigationTree(fileName: String): NavigationTree = js.native
  /** @deprecated */
  def getOccurrencesAtPosition(fileName: String, position: Double): js.UndefOr[js.Array[ReferenceEntry]] = js.native
  def getOutliningSpans(fileName: String): js.Array[OutliningSpan] = js.native
  def getProgram(): js.UndefOr[Program] = js.native
  def getQuickInfoAtPosition(fileName: String, position: Double): js.UndefOr[QuickInfo] = js.native
  def getReferencesAtPosition(fileName: String, position: Double): js.UndefOr[js.Array[ReferenceEntry]] = js.native
  def getRenameInfo(fileName: String, position: Double): RenameInfo = js.native
  def getRenameInfo(fileName: String, position: Double, options: RenameInfoOptions): RenameInfo = js.native
  /**
    * @deprecated Use getEncodedSemanticClassifications instead.
    */
  def getSemanticClassifications(fileName: String, span: TextSpan): js.Array[ClassifiedSpan] = js.native
  /** The first time this is called, it will return global diagnostics (no location). */
  def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  def getSignatureHelpItems(fileName: String, position: Double): js.UndefOr[SignatureHelpItems] = js.native
  def getSignatureHelpItems(fileName: String, position: Double, options: SignatureHelpItemsOptions): js.UndefOr[SignatureHelpItems] = js.native
  def getSmartSelectionRange(fileName: String, position: Double): SelectionRange = js.native
  def getSpanOfEnclosingComment(fileName: String, position: Double, onlyMultiLine: Boolean): js.UndefOr[TextSpan] = js.native
  def getSuggestionDiagnostics(fileName: String): js.Array[DiagnosticWithLocation] = js.native
  /**
    * @deprecated Use getEncodedSyntacticClassifications instead.
    */
  def getSyntacticClassifications(fileName: String, span: TextSpan): js.Array[ClassifiedSpan] = js.native
  def getSyntacticDiagnostics(fileName: String): js.Array[DiagnosticWithLocation] = js.native
  def getTodoComments(fileName: String, descriptors: js.Array[TodoCommentDescriptor]): js.Array[TodoComment] = js.native
  def getTypeDefinitionAtPosition(fileName: String, position: Double): js.UndefOr[js.Array[DefinitionInfo]] = js.native
  def isValidBraceCompletionAtPosition(fileName: String, position: Double, openingBrace: Double): Boolean = js.native
  def organizeImports(scope: OrganizeImportsScope, formatOptions: FormatCodeSettings): js.Array[FileTextChanges] = js.native
  def organizeImports(scope: OrganizeImportsScope, formatOptions: FormatCodeSettings, preferences: UserPreferences): js.Array[FileTextChanges] = js.native
}

