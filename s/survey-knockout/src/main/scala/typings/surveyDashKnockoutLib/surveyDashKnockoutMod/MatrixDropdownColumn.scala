package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MatrixDropdownColumn")
@js.native
class MatrixDropdownColumn protected ()
  extends Base
     with ILocalizableOwner {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, title: java.lang.String) = this()
  var cellType: java.lang.String = js.native
  var colCount: scala.Double = js.native
  var colOwner: IMatrixColumnOwner = js.native
  var enableIf: java.lang.String = js.native
  val fullTitle: java.lang.String = js.native
  var hasOther: scala.Boolean = js.native
  val index: scala.Double = js.native
  var isRequired: scala.Boolean = js.native
  val isVisible: scala.Boolean = js.native
  val locRequiredErrorText: LocalizableString = js.native
  val locTitle: LocalizableString = js.native
  var minWidth: java.lang.String = js.native
  var name: java.lang.String = js.native
  var readOnly: scala.Boolean = js.native
  var requiredErrorText: java.lang.String = js.native
  var requiredIf: java.lang.String = js.native
  val templateQuestion: Question = js.native
  var title: java.lang.String = js.native
  var validators: js.Array[SurveyValidator] = js.native
  val value: java.lang.String = js.native
  var visibleIf: java.lang.String = js.native
  /* protected */ def calcCellQuestionType(): java.lang.String = js.native
  def createCellQuestion(data: js.Any): Question = js.native
  /* protected */ def createNewQuestion(cellType: java.lang.String): Question = js.native
  def defaultCellTypeChanged(): scala.Unit = js.native
  def getDynamicProperties(): js.Array[java.lang.String] = js.native
  def getDynamicPropertyName(): java.lang.String = js.native
  def getDynamicType(): java.lang.String = js.native
  def getFullTitle(str: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getLocale(): java.lang.String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getProcessedText(text: java.lang.String): java.lang.String = js.native
  def setIndex(`val`: scala.Double): scala.Unit = js.native
  def setIsVisible(newVal: scala.Boolean): scala.Unit = js.native
  /* protected */ def setQuestionProperties(question: Question): scala.Unit = js.native
  def updateCellQuestion(cellQuestion: Question, data: js.Any): scala.Unit = js.native
  /* protected */ def updateTemplateQuestion(): scala.Unit = js.native
}

@JSImport("survey-knockout", "MatrixDropdownColumn")
@js.native
object MatrixDropdownColumn extends js.Object {
  def getColumnTypes(): js.Array[java.lang.String] = js.native
}

