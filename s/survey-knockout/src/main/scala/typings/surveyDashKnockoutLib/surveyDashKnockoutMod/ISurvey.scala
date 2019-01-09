package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurvey extends ITextProcessor {
  var areInvisibleElementsShowing: scala.Boolean
  var clearValueOnDisableItems: scala.Boolean
  var currentPage: IPage
  var isDesignMode: scala.Boolean
  var isDisplayMode: scala.Boolean
  var isLoadingFromJson: scala.Boolean
  var maxOthersLength: scala.Double
  var maxTextLength: scala.Double
  var pages: js.Array[IPage]
  var questionErrorLocation: java.lang.String
  var questionStartIndex: java.lang.String
  var questionTitleLocation: java.lang.String
  var questionsOrder: java.lang.String
  var requiredText: java.lang.String
  var storeOthersAsComment: scala.Boolean
  def afterRenderPage(htmlElement: js.Any): js.Any
  def afterRenderPanel(panel: IElement, htmlElement: js.Any): js.Any
  def afterRenderQuestion(question: IQuestion, htmlElement: js.Any): js.Any
  def clearFiles(
    name: java.lang.String,
    value: js.Any,
    fileName: java.lang.String,
    clearCallback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): js.Any
  def downloadFile(
    name: java.lang.String,
    content: java.lang.String,
    callback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): js.Any
  def dragAndDropAllow(options: js.Any): scala.Boolean
  def dynamicPanelAdded(question: IQuestion): js.Any
  def dynamicPanelItemValueChanged(question: IQuestion, options: js.Any): js.Any
  def dynamicPanelRemoved(question: IQuestion, panelIndex: scala.Double): js.Any
  def getQuestionTitleTemplate(): java.lang.String
  def getSurveyMarkdownHtml(element: Base, text: java.lang.String): java.lang.String
  def getUpdatedQuestionTitle(question: IQuestion, title: java.lang.String): java.lang.String
  def hasVisibleQuestionByValueName(valueName: java.lang.String): scala.Boolean
  def isPageStarted(page: IPage): scala.Boolean
  def matrixAfterCellRender(question: IQuestion, options: js.Any): js.Any
  def matrixBeforeRowAdded(options: surveyDashKnockoutLib.Anon_CanAddRow): js.Any
  def matrixCellCreated(question: IQuestion, options: js.Any): js.Any
  def matrixCellValidate(question: IQuestion, options: js.Any): SurveyError
  def matrixCellValueChanged(question: IQuestion, options: js.Any): js.Any
  def matrixRowAdded(question: IQuestion): js.Any
  def matrixRowRemoved(question: IQuestion, rowIndex: scala.Double, row: js.Any): js.Any
  def pageVisibilityChanged(page: IPage, newValue: scala.Boolean): js.Any
  def panelAdded(panel: IElement, index: scala.Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  def panelRemoved(panel: IElement): js.Any
  def panelVisibilityChanged(panel: IPanel, newValue: scala.Boolean): js.Any
  def processHtml(html: java.lang.String): java.lang.String
  def questionAdded(question: IQuestion, index: scala.Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  def questionCountByValueName(valueName: java.lang.String): scala.Double
  def questionRemoved(question: IQuestion): js.Any
  def questionRenamed(question: IQuestion, oldName: java.lang.String, oldValueName: java.lang.String): js.Any
  def questionVisibilityChanged(question: IQuestion, newValue: scala.Boolean): js.Any
  def updateChoicesFromServer(question: IQuestion, choices: js.Array[_], serverResult: js.Any): js.Array[_]
  def updatePanelCssClasses(panel: IPanel, cssClasses: js.Any): js.Any
  def updateQuestionCssClasses(question: IQuestion, cssClasses: js.Any): js.Any
  def uploadFiles(
    name: java.lang.String,
    files: js.Array[stdLib.File],
    uploadingCallback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): js.Any
  def validatePanel(panel: IPanel): SurveyError
  def validateQuestion(question: IQuestion): SurveyError
}

