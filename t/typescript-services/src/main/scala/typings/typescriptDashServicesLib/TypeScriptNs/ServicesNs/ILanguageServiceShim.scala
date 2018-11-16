package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILanguageServiceShim extends IShim {
  var languageService: ILanguageService
  def cleanupSemanticCache(): scala.Unit
  def getBraceMatchingAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getBreakpointStatementAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getCompilerOptionsDiagnostics(): java.lang.String
  def getCompletionEntryDetails(fileName: java.lang.String, position: scala.Double, entryName: java.lang.String): java.lang.String
  def getCompletionsAtPosition(fileName: java.lang.String, position: scala.Double, isMemberCompletion: scala.Boolean): java.lang.String
  def getDefinitionAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getEmitOutput(fileName: java.lang.String): java.lang.String
  def getFormattingEditsAfterKeystroke(
    fileName: java.lang.String,
    position: scala.Double,
    key: java.lang.String,
    options: java.lang.String
  ): java.lang.String
  def getFormattingEditsForDocument(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: java.lang.String
  ): java.lang.String
  def getFormattingEditsForRange(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: java.lang.String
  ): java.lang.String
  def getFormattingEditsOnPaste(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: java.lang.String
  ): java.lang.String
  def getImplementorsAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getIndentationAtPosition(fileName: java.lang.String, position: scala.Double, options: java.lang.String): java.lang.String
  def getNameOrDottedNameSpan(fileName: java.lang.String, startPos: scala.Double, endPos: scala.Double): java.lang.String
  def getNavigateToItems(searchValue: java.lang.String): java.lang.String
  def getOccurrencesAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getOutliningRegions(fileName: java.lang.String): java.lang.String
  def getReferencesAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getScriptLexicalStructure(fileName: java.lang.String): java.lang.String
  def getSemanticDiagnostics(fileName: java.lang.String): java.lang.String
  def getSignatureAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getSyntacticDiagnostics(fileName: java.lang.String): java.lang.String
  def getTypeAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def refresh(throwOnError: scala.Boolean): scala.Unit
}

