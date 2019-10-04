package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MatrixDropdownColumn")
@js.native
class MatrixDropdownColumn protected ()
  extends Base
     with ILocalizableOwner {
  def this(name: String) = this()
  def this(name: String, title: String) = this()
  var cellType: String = js.native
  var colCount: Double = js.native
  var colOwner: IMatrixColumnOwner = js.native
  var enableIf: String = js.native
  val fullTitle: String = js.native
  val hasCondition: Boolean = js.native
  var hasOther: Boolean = js.native
  val hasTotal: Boolean = js.native
  var hasVisibleCell: Boolean = js.native
  val index: Double = js.native
  var isRequired: Boolean = js.native
  val isVisible: Boolean = js.native
  val locRequiredErrorText: LocalizableString = js.native
  val locTitle: LocalizableString = js.native
  val locTotalFormat: LocalizableString = js.native
  var minWidth: String = js.native
  var name: String = js.native
  var readOnly: Boolean = js.native
  var requiredErrorText: String = js.native
  var requiredIf: String = js.native
  val templateQuestion: Question = js.native
  var title: String = js.native
  var totalCurrency: String = js.native
  var totalDisplayStyle: String = js.native
  var totalExpression: String = js.native
  var totalFormat: String = js.native
  var totalMaximumFractionDigits: Double = js.native
  var totalMinimumFractionDigits: Double = js.native
  var totalType: String = js.native
  var validators: js.Array[SurveyValidator] = js.native
  val value: String = js.native
  var visibleIf: String = js.native
  var width: String = js.native
  /* protected */ def calcCellQuestionType(): String = js.native
  def createCellQuestion(data: js.Any): Question = js.native
  /* protected */ def createNewQuestion(cellType: String): Question = js.native
  def defaultCellTypeChanged(): Unit = js.native
  def getDynamicProperties(): js.Array[String] = js.native
  def getDynamicPropertyName(): String = js.native
  def getDynamicType(): String = js.native
  /* CompleteClass */
  override def getLocale(): String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: String): String = js.native
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  def setIndex(`val`: Double): Unit = js.native
  def setIsVisible(newVal: Boolean): Unit = js.native
  /* protected */ def setQuestionProperties(question: Question): Unit = js.native
  def updateCellQuestion(cellQuestion: Question, data: js.Any): Unit = js.native
  /* protected */ def updateTemplateQuestion(): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "MatrixDropdownColumn")
@js.native
object MatrixDropdownColumn extends js.Object {
  def getColumnTypes(): js.Array[String] = js.native
}

