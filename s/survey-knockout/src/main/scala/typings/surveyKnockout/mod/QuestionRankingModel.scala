package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionRankingModel")
@js.native
open class QuestionRankingModel protected () extends QuestionCheckboxModel {
  def this(name: String) = this()
  
  var currentDropTarget: ItemValue = js.native
  
  var domNode: Any = js.native
  
  var dragDropRankingChoices: DragDropRankingChoices = js.native
  
  var dropTargetNodeMove: String = js.native
  
  def focusItem(index: Double): Unit = js.native
  
  def getIconFocusCss(): String = js.native
  
  def getIconHoverCss(): String = js.native
  
  /* protected */ def getItemClassCore(item: ItemValue, options: Any): String = js.native
  
  def getNumberByIndex(index: Double): String = js.native
  
  def ghostPositionCssClass: String = js.native
  
  def handleArrowDown(index: Double, choice: ItemValue): Unit = js.native
  
  def handleArrowUp(index: Double, choice: ItemValue): Unit = js.native
  
  def handleKeydown(event: Any, choice: ItemValue): Unit = js.native
  
  def handlePointerDown(event: Any, choice: ItemValue, node: Any): Unit = js.native
  
  /* protected */ def isItemCurrentDropTarget(item: ItemValue): Boolean = js.native
  
  @JSName("localeChanged")
  var localeChanged_FQuestionRankingModel: Any = js.native
  
  /*
    * For mobile devices. Set this property to false, to disable the "long tap" before drag start. Default is true.
    */
  def longTap: Boolean = js.native
  def longTap_=(`val`: Boolean): Unit = js.native
  
  /* protected */ @JSName("onVisibleChoicesChanged")
  var onVisibleChoicesChanged_FQuestionRankingModel: Any = js.native
  
  def rankingChoices: Any = js.native
  
  def rootClass: String = js.native
  
  def setGhostText(text: String): Unit = js.native
  
  var setValue: Any = js.native
  
  var setValueFromUI: Any = js.native
  
  var syncNumbers: Any = js.native
}
