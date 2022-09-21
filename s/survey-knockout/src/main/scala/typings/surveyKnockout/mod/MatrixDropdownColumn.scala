package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MatrixDropdownColumn")
@js.native
open class MatrixDropdownColumn protected ()
  extends Base
     with ILocalizableOwner
     with IWrapperObject {
  def this(name: String) = this()
  def this(name: String, title: String) = this()
  
  var _hasVisibleCell: Boolean = js.native
  
  var _isVisible: Boolean = js.native
  
  /* protected */ def calcCellQuestionType(row: MatrixDropdownRowModelBase): String = js.native
  
  def cellHint: String = js.native
  def cellHint_=(`val`: String): Unit = js.native
  
  def cellType: String = js.native
  def cellType_=(`val`: String): Unit = js.native
  
  def colCount: Double = js.native
  def colCount_=(`val`: Double): Unit = js.native
  
  def colOwner: IMatrixColumnOwner = js.native
  
  var colOwnerValue: IMatrixColumnOwner = js.native
  
  def colOwner_=(`val`: IMatrixColumnOwner): Unit = js.native
  
  def createCellQuestion(row: MatrixDropdownRowModelBase): Question = js.native
  
  /* protected */ def createNewQuestion(cellType: String): Question = js.native
  
  def defaultCellTypeChanged(): Unit = js.native
  
  def enableIf: String = js.native
  def enableIf_=(`val`: String): Unit = js.native
  
  def fullTitle: String = js.native
  
  /* CompleteClass */
  override def getClassNameProperty(): String = js.native
  
  def getDynamicPropertyName(): String = js.native
  
  def getDynamicType(): String = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  /* CompleteClass */
  override def getOriginalObj(): Base = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def hasOther: Boolean = js.native
  def hasOther_=(`val`: Boolean): Unit = js.native
  
  def hasTotal: Boolean = js.native
  
  def hasVisibleCell: Boolean = js.native
  def hasVisibleCell_=(`val`: Boolean): Unit = js.native
  
  def index: Double = js.native
  
  var indexValue: Double = js.native
  
  def isRenderedRequired: Boolean = js.native
  def isRenderedRequired_=(`val`: Boolean): Unit = js.native
  
  def isRequired: Boolean = js.native
  def isRequired_=(`val`: Boolean): Unit = js.native
  
  def isShowInMultipleColumns: Boolean = js.native
  
  def isSupportMultipleColumns: Boolean = js.native
  
  def isUnique: Boolean = js.native
  def isUnique_=(`val`: Boolean): Unit = js.native
  
  def isVisible: Boolean = js.native
  
  def locCellHint: LocalizableString = js.native
  
  def locRequiredErrorText: LocalizableString = js.native
  
  def locTitle: LocalizableString = js.native
  
  def locTotalFormat: LocalizableString = js.native
  
  def minWidth: String = js.native
  def minWidth_=(`val`: String): Unit = js.native
  
  def name: String = js.native
  def name_=(`val`: String): Unit = js.native
  
  var previousChoicesId: String = js.native
  
  def readOnly: Boolean = js.native
  def readOnly_=(`val`: Boolean): Unit = js.native
  
  def renderAs: String = js.native
  def renderAs_=(`val`: String): Unit = js.native
  
  def requiredErrorText: String = js.native
  def requiredErrorText_=(`val`: String): Unit = js.native
  
  def requiredIf: String = js.native
  def requiredIf_=(`val`: String): Unit = js.native
  
  def requiredText: String = js.native
  
  def setIndex(`val`: Double): Unit = js.native
  
  def setIsVisible(newVal: Boolean): Unit = js.native
  
  /* protected */ def setQuestionProperties(question: Question): Unit = js.native
  /* protected */ def setQuestionProperties(question: Question, onUpdateJson: js.Function1[/* json */ Any, Any]): Unit = js.native
  
  def showInMultipleColumns: Boolean = js.native
  def showInMultipleColumns_=(`val`: Boolean): Unit = js.native
  
  def templateQuestion: Question = js.native
  
  var templateQuestionValue: Question = js.native
  
  def title: String = js.native
  def title_=(`val`: String): Unit = js.native
  
  def totalCurrency: String = js.native
  def totalCurrency_=(`val`: String): Unit = js.native
  
  def totalDisplayStyle: String = js.native
  def totalDisplayStyle_=(`val`: String): Unit = js.native
  
  def totalExpression: String = js.native
  def totalExpression_=(`val`: String): Unit = js.native
  
  def totalFormat: String = js.native
  def totalFormat_=(`val`: String): Unit = js.native
  
  def totalMaximumFractionDigits: Double = js.native
  def totalMaximumFractionDigits_=(`val`: Double): Unit = js.native
  
  def totalMinimumFractionDigits: Double = js.native
  def totalMinimumFractionDigits_=(`val`: Double): Unit = js.native
  
  def totalType: String = js.native
  def totalType_=(`val`: String): Unit = js.native
  
  def updateCellQuestion(cellQuestion: Question, data: Any): Unit = js.native
  def updateCellQuestion(cellQuestion: Question, data: Any, onUpdateJson: js.Function1[/* json */ Any, Any]): Unit = js.native
  
  def updateIsRenderedRequired(`val`: Boolean): Unit = js.native
  
  /* protected */ def updateTemplateQuestion(): Unit = js.native
  /* protected */ def updateTemplateQuestion(newCellType: String): Unit = js.native
  
  def validators: Any = js.native
  def validators_=(`val`: Any): Unit = js.native
  
  def value: String = js.native
  
  def visibleIf: String = js.native
  def visibleIf_=(`val`: String): Unit = js.native
  
  def width: String = js.native
  def width_=(`val`: String): Unit = js.native
}
/* static members */
object MatrixDropdownColumn {
  
  @JSImport("survey-knockout", "MatrixDropdownColumn")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getColumnTypes(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColumnTypes")().asInstanceOf[js.Array[Any]]
}
