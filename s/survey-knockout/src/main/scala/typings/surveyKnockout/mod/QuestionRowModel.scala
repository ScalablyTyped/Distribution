package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionRowModel")
@js.native
open class QuestionRowModel protected () extends Base {
  def this(panel: PanelModelBase) = this()
  
  /* protected */ var _scrollableParent: Any = js.native
  
  /* protected */ var _updateVisibility: Any = js.native
  
  def addElement(q: IElement): Unit = js.native
  
  def elements: Any = js.native
  
  def ensureVisibility(): Unit = js.native
  
  def getRowCss(): String = js.native
  
  def id: String = js.native
  
  var idValue: String = js.native
  
  def index: Double = js.native
  
  def isLazyRendering(): Boolean = js.native
  
  var isLazyRenderingValue: Boolean = js.native
  
  def isNeedRender: Boolean = js.native
  def isNeedRender_=(`val`: Boolean): Unit = js.native
  
  var panel: PanelModelBase = js.native
  
  def setElementMaxMinWidth(el: IElement): Unit = js.native
  
  def setIsLazyRendering(`val`: Boolean): Unit = js.native
  
  def startLazyRendering(rowContainerDiv: Any): Unit = js.native
  def startLazyRendering(rowContainerDiv: Any, findScrollableContainer: js.Function1[/* element */ Any, Any]): Unit = js.native
  
  def stopLazyRendering(): Unit = js.native
  
  def updateVisible(): Unit = js.native
  
  def visible: Boolean = js.native
  
  def visibleElements: Any = js.native
  
  def visible_=(`val`: Boolean): Unit = js.native
}
/* static members */
object QuestionRowModel {
  
  @JSImport("survey-knockout", "QuestionRowModel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "QuestionRowModel.rowCounter")
  @js.native
  def rowCounter: Double = js.native
  inline def rowCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowCounter")(x.asInstanceOf[js.Any])
}
