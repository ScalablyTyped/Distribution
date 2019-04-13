package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageService extends js.Object {
  var toLineColumnOffset: js.UndefOr[
    js.Function2[/* fileName */ java.lang.String, /* position */ scala.Double, LineAndCharacter]
  ] = js.native
  def applyCodeActionCommand(action: js.Array[CodeActionCommand]): js.Promise[js.Array[ApplyCodeActionCommandResult]] = js.native
  def applyCodeActionCommand(action: js.Array[CodeActionCommand], formatSettings: FormatCodeSettings): js.Promise[js.Array[ApplyCodeActionCommandResult]] = js.native
  def applyCodeActionCommand(action: CodeActionCommand): js.Promise[ApplyCodeActionCommandResult] = js.native
  def applyCodeActionCommand(action: CodeActionCommand, formatSettings: FormatCodeSettings): js.Promise[ApplyCodeActionCommandResult] = js.native
  /** @deprecated `fileName` will be ignored */
  def applyCodeActionCommand(fileName: java.lang.String, action: js.Array[CodeActionCommand]): js.Promise[js.Array[ApplyCodeActionCommandResult]] = js.native
  /** @deprecated `fileName` will be ignored */
  def applyCodeActionCommand(fileName: java.lang.String, action: CodeActionCommand): js.Promise[ApplyCodeActionCommandResult] = js.native
  def cleanupSemanticCache(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def findReferences(fileName: java.lang.String, position: scala.Double): js.UndefOr[js.Array[ReferencedSymbol]] = js.native
  def findRenameLocations(
    fileName: java.lang.String,
    position: scala.Double,
    findInStrings: scala.Boolean,
    findInComments: scala.Boolean
  ): js.UndefOr[js.Array[RenameLocation]] = js.native
  def findRenameLocations(
    fileName: java.lang.String,
    position: scala.Double,
    findInStrings: scala.Boolean,
    findInComments: scala.Boolean,
    providePrefixAndSuffixTextForRename: scala.Boolean
  ): js.UndefOr[js.Array[RenameLocation]] = js.native
  def getApplicableRefactors(fileName: java.lang.String, positionOrRange: scala.Double): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(fileName: java.lang.String, positionOrRange: scala.Double, preferences: UserPreferences): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(fileName: java.lang.String, positionOrRange: TextRange): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(fileName: java.lang.String, positionOrRange: TextRange, preferences: UserPreferences): js.Array[ApplicableRefactorInfo] = js.native
  def getBraceMatchingAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[TextSpan] = js.native
  def getBreakpointStatementAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[TextSpan] = js.native
  def getCodeFixesAtPosition(
    fileName: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    errorCodes: js.Array[scala.Double],
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
  def getCompletionEntryDetails(fileName: java.lang.String, position: scala.Double, name: java.lang.String): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: js.UndefOr[scala.Nothing],
    source: java.lang.String
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: js.UndefOr[scala.Nothing],
    source: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: js.UndefOr[scala.Nothing],
    source: js.UndefOr[scala.Nothing],
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: FormatCodeOptions
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: java.lang.String
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: js.UndefOr[scala.Nothing],
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: FormatCodeSettings
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: java.lang.String
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: js.UndefOr[scala.Nothing],
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntrySymbol(fileName: java.lang.String, position: scala.Double, name: java.lang.String): js.UndefOr[Symbol] = js.native
  def getCompletionEntrySymbol(
    fileName: java.lang.String,
    position: scala.Double,
    name: java.lang.String,
    source: java.lang.String
  ): js.UndefOr[Symbol] = js.native
  def getCompletionsAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[WithMetadata[CompletionInfo]] = js.native
  def getCompletionsAtPosition(fileName: java.lang.String, position: scala.Double, options: GetCompletionsAtPositionOptions): js.UndefOr[WithMetadata[CompletionInfo]] = js.native
  def getDefinitionAndBoundSpan(fileName: java.lang.String, position: scala.Double): js.UndefOr[DefinitionInfoAndBoundSpan] = js.native
  def getDefinitionAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[js.Array[DefinitionInfo]] = js.native
  def getDocCommentTemplateAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[TextInsertion] = js.native
  def getDocumentHighlights(fileName: java.lang.String, position: scala.Double, filesToSearch: js.Array[java.lang.String]): js.UndefOr[js.Array[DocumentHighlights]] = js.native
  def getEditsForFileRename(oldFilePath: java.lang.String, newFilePath: java.lang.String, formatOptions: FormatCodeSettings): js.Array[FileTextChanges] = js.native
  def getEditsForFileRename(
    oldFilePath: java.lang.String,
    newFilePath: java.lang.String,
    formatOptions: FormatCodeSettings,
    preferences: UserPreferences
  ): js.Array[FileTextChanges] = js.native
  def getEditsForRefactor(
    fileName: java.lang.String,
    formatOptions: FormatCodeSettings,
    positionOrRange: scala.Double,
    refactorName: java.lang.String,
    actionName: java.lang.String
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEditsForRefactor(
    fileName: java.lang.String,
    formatOptions: FormatCodeSettings,
    positionOrRange: scala.Double,
    refactorName: java.lang.String,
    actionName: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEditsForRefactor(
    fileName: java.lang.String,
    formatOptions: FormatCodeSettings,
    positionOrRange: TextRange,
    refactorName: java.lang.String,
    actionName: java.lang.String
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEditsForRefactor(
    fileName: java.lang.String,
    formatOptions: FormatCodeSettings,
    positionOrRange: TextRange,
    refactorName: java.lang.String,
    actionName: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEmitOutput(fileName: java.lang.String): EmitOutput = js.native
  def getEmitOutput(fileName: java.lang.String, emitOnlyDtsFiles: scala.Boolean): EmitOutput = js.native
  def getEncodedSemanticClassifications(fileName: java.lang.String, span: TextSpan): Classifications = js.native
  def getEncodedSyntacticClassifications(fileName: java.lang.String, span: TextSpan): Classifications = js.native
  def getFormattingEditsAfterKeystroke(
    fileName: java.lang.String,
    position: scala.Double,
    key: java.lang.String,
    options: FormatCodeOptions
  ): js.Array[TextChange] = js.native
  def getFormattingEditsAfterKeystroke(
    fileName: java.lang.String,
    position: scala.Double,
    key: java.lang.String,
    options: FormatCodeSettings
  ): js.Array[TextChange] = js.native
  def getFormattingEditsForDocument(fileName: java.lang.String, options: FormatCodeOptions): js.Array[TextChange] = js.native
  def getFormattingEditsForDocument(fileName: java.lang.String, options: FormatCodeSettings): js.Array[TextChange] = js.native
  def getFormattingEditsForRange(fileName: java.lang.String, start: scala.Double, end: scala.Double, options: FormatCodeOptions): js.Array[TextChange] = js.native
  def getFormattingEditsForRange(fileName: java.lang.String, start: scala.Double, end: scala.Double, options: FormatCodeSettings): js.Array[TextChange] = js.native
  def getImplementationAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[js.Array[ImplementationLocation]] = js.native
  def getIndentationAtPosition(fileName: java.lang.String, position: scala.Double, options: EditorOptions): scala.Double = js.native
  def getIndentationAtPosition(fileName: java.lang.String, position: scala.Double, options: EditorSettings): scala.Double = js.native
  /**
    * This will return a defined result if the position is after the `>` of the opening tag, or somewhere in the text, of a JSXElement with no closing tag.
    * Editors should call this after `>` is typed.
    */
  def getJsxClosingTagAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[JsxClosingTagInfo] = js.native
  def getNameOrDottedNameSpan(fileName: java.lang.String, startPos: scala.Double, endPos: scala.Double): js.UndefOr[TextSpan] = js.native
  def getNavigateToItems(searchValue: java.lang.String): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: java.lang.String, maxResultCount: scala.Double): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: java.lang.String, maxResultCount: scala.Double, fileName: java.lang.String): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(
    searchValue: java.lang.String,
    maxResultCount: scala.Double,
    fileName: java.lang.String,
    excludeDtsFiles: scala.Boolean
  ): js.Array[NavigateToItem] = js.native
  def getNavigationBarItems(fileName: java.lang.String): js.Array[NavigationBarItem] = js.native
  def getNavigationTree(fileName: java.lang.String): NavigationTree = js.native
  /** @deprecated */
  def getOccurrencesAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[js.Array[ReferenceEntry]] = js.native
  def getOutliningSpans(fileName: java.lang.String): js.Array[OutliningSpan] = js.native
  def getProgram(): js.UndefOr[Program] = js.native
  def getQuickInfoAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[QuickInfo] = js.native
  def getReferencesAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[js.Array[ReferenceEntry]] = js.native
  def getRenameInfo(fileName: java.lang.String, position: scala.Double): RenameInfo = js.native
  def getRenameInfo(fileName: java.lang.String, position: scala.Double, options: RenameInfoOptions): RenameInfo = js.native
  /**
    * @deprecated Use getEncodedSemanticClassifications instead.
    */
  def getSemanticClassifications(fileName: java.lang.String, span: TextSpan): js.Array[ClassifiedSpan] = js.native
  /** The first time this is called, it will return global diagnostics (no location). */
  def getSemanticDiagnostics(fileName: java.lang.String): js.Array[Diagnostic] = js.native
  def getSignatureHelpItems(fileName: java.lang.String, position: scala.Double): js.UndefOr[SignatureHelpItems] = js.native
  def getSignatureHelpItems(fileName: java.lang.String, position: scala.Double, options: SignatureHelpItemsOptions): js.UndefOr[SignatureHelpItems] = js.native
  def getSpanOfEnclosingComment(fileName: java.lang.String, position: scala.Double, onlyMultiLine: scala.Boolean): js.UndefOr[TextSpan] = js.native
  def getSuggestionDiagnostics(fileName: java.lang.String): js.Array[DiagnosticWithLocation] = js.native
  /**
    * @deprecated Use getEncodedSyntacticClassifications instead.
    */
  def getSyntacticClassifications(fileName: java.lang.String, span: TextSpan): js.Array[ClassifiedSpan] = js.native
  def getSyntacticDiagnostics(fileName: java.lang.String): js.Array[DiagnosticWithLocation] = js.native
  def getTodoComments(fileName: java.lang.String, descriptors: js.Array[TodoCommentDescriptor]): js.Array[TodoComment] = js.native
  def getTypeDefinitionAtPosition(fileName: java.lang.String, position: scala.Double): js.UndefOr[js.Array[DefinitionInfo]] = js.native
  def isValidBraceCompletionAtPosition(fileName: java.lang.String, position: scala.Double, openingBrace: scala.Double): scala.Boolean = js.native
  def organizeImports(scope: OrganizeImportsScope, formatOptions: FormatCodeSettings): js.Array[FileTextChanges] = js.native
  def organizeImports(scope: OrganizeImportsScope, formatOptions: FormatCodeSettings, preferences: UserPreferences): js.Array[FileTextChanges] = js.native
}

