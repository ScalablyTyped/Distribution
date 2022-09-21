package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISurvey
  extends StObject
     with ITextProcessor
     with ISurveyErrorOwner {
  
  def afterRenderPage(htmlElement: Any): Any = js.native
  
  def afterRenderPanel(panel: IElement, htmlElement: Any): Any = js.native
  
  def afterRenderQuestion(question: IQuestion, htmlElement: Any): Any = js.native
  
  def afterRenderQuestionInput(question: IQuestion, htmlElement: Any): Any = js.native
  
  var areEmptyElementsHidden: Boolean = js.native
  
  var areInvisibleElementsShowing: Boolean = js.native
  
  var autoGrowComment: Boolean = js.native
  
  def beforeSettingPanelErrors(question: IPanel, errors: Any): Unit = js.native
  
  def beforeSettingQuestionErrors(question: IQuestion, errors: Any): Unit = js.native
  
  def canChangeChoiceItemsVisibility(): Boolean = js.native
  
  def cancelPreviewByPage(panel: IPanel): Any = js.native
  
  def clearFiles(
    question: IQuestion,
    name: String,
    value: Any,
    fileName: String,
    clearCallback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Any = js.native
  
  var clearValueOnDisableItems: Boolean = js.native
  
  var cssNavigationEdit: String = js.native
  
  var currentPage: IPage = js.native
  
  def downloadFile(
    question: IQuestion,
    name: String,
    content: String,
    callback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Any = js.native
  
  def dragAndDropAllow(options: Any): Boolean = js.native
  
  def dynamicPanelAdded(question: IQuestion): Unit = js.native
  def dynamicPanelAdded(question: IQuestion, panelIndex: Double): Unit = js.native
  def dynamicPanelAdded(question: IQuestion, panelIndex: Double, panel: IPanel): Unit = js.native
  def dynamicPanelAdded(question: IQuestion, panelIndex: Unit, panel: IPanel): Unit = js.native
  
  def dynamicPanelItemValueChanged(question: IQuestion, options: Any): Any = js.native
  
  def dynamicPanelRemoved(question: IQuestion, panelIndex: Double, panel: IPanel): Unit = js.native
  
  def dynamicPanelRemoving(question: IQuestion, panelIndex: Double, panel: IPanel): Boolean = js.native
  
  var editText: String = js.native
  
  def elementContentVisibilityChanged(element: ISurveyElement): Unit = js.native
  
  def getChoiceItemVisibility(question: IQuestion, item: Any, `val`: Boolean): Boolean = js.native
  
  def getCss(): Any = js.native
  
  def getElementTitleTagName(element: Base, tagName: String): String = js.native
  
  def getExpressionDisplayValue(question: IQuestion, value: Any, displayValue: String): String = js.native
  
  def getQuestionByName(name: String): IQuestion = js.native
  
  def getQuestionByValueNameFromArray(valueName: String, name: String, index: Double): IQuestion = js.native
  
  def getRendererContextForString(element: Base, locStr: LocalizableString): Any = js.native
  
  def getRendererForString(element: Base, name: String): String = js.native
  
  def getSkeletonComponentName(element: ISurveyElement): String = js.native
  
  def getSurveyErrorCustomText(obj: Base, text: String, error: SurveyError): String = js.native
  
  def getSurveyMarkdownHtml(element: Base, text: String, name: String): String = js.native
  
  def getUpdatedElementTitleActions(element: ISurveyElement, titleActions: Any): js.Array[IAction] = js.native
  
  def getUpdatedMatrixRowActions(question: QuestionMatrixDropdownModelBase, row: MatrixDropdownRowModelBase, actions: Any): js.Array[IAction] = js.native
  
  def getUpdatedQuestionNo(question: IQuestion, no: String): String = js.native
  
  def getUpdatedQuestionTitle(question: IQuestion, title: String): String = js.native
  
  def hasVisibleQuestionByValueName(valueName: String): Boolean = js.native
  
  var isClearValueOnHidden: Boolean = js.native
  
  var isClearValueOnHiddenContainer: Boolean = js.native
  
  var isDesignMode: Boolean = js.native
  
  var isDisplayMode: Boolean = js.native
  
  var isEditingSurveyElement: Boolean = js.native
  
  var isLazyRendering: Boolean = js.native
  
  var isLoadingFromJson: Boolean = js.native
  
  def isPageStarted(page: IPage): Boolean = js.native
  
  var isUpdateValueTextOnTyping: Boolean = js.native
  
  var isValidateOnValueChanged: Boolean = js.native
  
  var isValidateOnValueChanging: Boolean = js.native
  
  def loadedChoicesFromServer(question: IQuestion): Unit = js.native
  
  def matrixAfterCellRender(question: IQuestion, options: Any): Any = js.native
  
  def matrixAllowRemoveRow(question: IQuestion, rowIndex: Double, row: Any): Boolean = js.native
  
  def matrixBeforeRowAdded(options: Any): Any = js.native
  
  def matrixCellCreated(question: IQuestion, options: Any): Any = js.native
  
  def matrixCellCreating(question: IQuestion, options: Any): Any = js.native
  
  def matrixCellValidate(question: IQuestion, options: Any): SurveyError = js.native
  
  def matrixCellValueChanged(question: IQuestion, options: Any): Any = js.native
  
  def matrixCellValueChanging(question: IQuestion, options: Any): Any = js.native
  
  def matrixRowAdded(question: IQuestion, row: Any): Any = js.native
  
  def matrixRowRemoved(question: IQuestion, rowIndex: Double, row: Any): Any = js.native
  
  def matrixRowRemoving(question: IQuestion, rowIndex: Double, row: Any): Boolean = js.native
  
  var maxOthersLength: Double = js.native
  
  var maxTextLength: Double = js.native
  
  def pageVisibilityChanged(page: IPage, newValue: Boolean): Any = js.native
  
  var pages: Any = js.native
  
  def panelAdded(panel: IElement, index: Double, parentPanel: Any, rootPanel: Any): Any = js.native
  
  def panelRemoved(panel: IElement): Any = js.native
  
  def panelVisibilityChanged(panel: IPanel, newValue: Boolean): Any = js.native
  
  def processHtml(html: String): String = js.native
  
  def questionAdded(question: IQuestion, index: Double, parentPanel: Any, rootPanel: Any): Any = js.native
  
  def questionCountByValueName(valueName: String): Double = js.native
  
  def questionCreated(question: IQuestion): Any = js.native
  
  var questionDescriptionLocation: String = js.native
  
  var questionErrorLocation: String = js.native
  
  def questionRemoved(question: IQuestion): Any = js.native
  
  def questionRenamed(question: IQuestion, oldName: String, oldValueName: String): Any = js.native
  
  var questionStartIndex: String = js.native
  
  var questionTitleLocation: String = js.native
  
  var questionTitlePattern: String = js.native
  
  def questionVisibilityChanged(question: IQuestion, newValue: Boolean): Any = js.native
  
  var questionsOrder: String = js.native
  
  var requiredText: String = js.native
  
  def runExpression(expression: String): Any = js.native
  
  def scrollElementToTop(element: ISurveyElement, question: IQuestion, page: IPage, id: String): Any = js.native
  
  var state: String = js.native
  
  var storeOthersAsComment: Boolean = js.native
  
  def updateChoiceItemCss(question: IQuestion, options: Any): Any = js.native
  
  def updateChoicesFromServer(question: IQuestion, choices: Any, serverResult: Any): js.Array[Any] = js.native
  
  def updatePageCssClasses(panel: IPanel, cssClasses: Any): Any = js.native
  
  def updatePanelCssClasses(panel: IPanel, cssClasses: Any): Any = js.native
  
  def updateQuestionCssClasses(question: IQuestion, cssClasses: Any): Any = js.native
  
  def uploadFiles(
    question: IQuestion,
    name: String,
    files: Any,
    uploadingCallback: js.Function2[/* status */ String, /* data */ Any, Any]
  ): Any = js.native
  
  def validatePanel(panel: IPanel): SurveyError = js.native
  
  def validateQuestion(question: IQuestion): SurveyError = js.native
}
