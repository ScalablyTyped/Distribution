package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixDropdownRenderedCell")
@js.native
open class QuestionMatrixDropdownRenderedCell () extends StObject {
  
  def calculateFinalClassName(matrixCssClasses: Any): String = js.native
  
  var cell: MatrixDropdownCell = js.native
  
  var choiceIndex: Double = js.native
  
  def choiceValue: Any = js.native
  
  def className: String = js.native
  
  var classNameValue: String = js.native
  
  var colSpans: Double = js.native
  
  var column: MatrixDropdownColumn = js.native
  
  def getTitle(): String = js.native
  
  def hasPanel: Boolean = js.native
  
  def hasQuestion: Boolean = js.native
  
  def hasTitle: Boolean = js.native
  
  def headers: String = js.native
  
  def id: Double = js.native
  
  var idValue: Double = js.native
  
  var isActionsCell: Boolean = js.native
  
  def isCheckbox: Boolean = js.native
  
  def isChoice: Boolean = js.native
  
  var isDragHandlerCell: Boolean = js.native
  
  var isEmpty: Boolean = js.native
  
  def isFirstChoice: Boolean = js.native
  
  def isItemChoice: Boolean = js.native
  
  var isOtherChoice: Boolean = js.native
  
  def isRadio: Boolean = js.native
  
  var isRemoveRow: Boolean = js.native
  
  var isShowHideDetail: Boolean = js.native
  
  def item: ItemValue = js.native
  
  var itemValue: ItemValue = js.native
  
  def item_=(`val`: ItemValue): Unit = js.native
  
  var locTitle: LocalizableString = js.native
  
  var matrix: QuestionMatrixDropdownModelBase = js.native
  
  var minWidth: String = js.native
  
  var panel: PanelModel = js.native
  
  var question: Question = js.native
  
  var requiredText: String = js.native
  
  var row: MatrixDropdownRowModelBase = js.native
  
  def showErrorOnBottom: Boolean = js.native
  
  def showErrorOnTop: Boolean = js.native
  
  var width: String = js.native
}
/* static members */
object QuestionMatrixDropdownRenderedCell {
  
  @JSImport("survey-knockout", "QuestionMatrixDropdownRenderedCell")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "QuestionMatrixDropdownRenderedCell.counter")
  @js.native
  def counter: Double = js.native
  inline def counter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("counter")(x.asInstanceOf[js.Any])
}
