package typings.surveyKnockout.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionRowModel")
@js.native
class QuestionRowModel protected () extends Base {
  def this(panel: PanelModelBase) = this()
  
  def addElement(q: IElement): Unit = js.native
  
  val elements: js.Array[IElement] = js.native
  
  val id: String = js.native
  
  val index: Double = js.native
  
  var isNeedRender: Boolean = js.native
  
  var panel: PanelModelBase = js.native
  
  def setElementMaxMinWidth(el: IElement): Unit = js.native
  
  def startLazyRendering(rowContainerDiv: HTMLElement): Unit = js.native
  
  def stopLazyRendering(): Unit = js.native
  
  def updateVisible(): Unit = js.native
  
  var visible: Boolean = js.native
  
  val visibleElements: js.Array[IElement] = js.native
}
