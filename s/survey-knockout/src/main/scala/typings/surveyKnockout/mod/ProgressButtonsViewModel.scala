package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ProgressButtonsViewModel")
@js.native
open class ProgressButtonsViewModel protected () extends StObject {
  def this(survey: Any, element: Any) = this()
  
  def clickListElement(index: Any): Unit = js.native
  
  def clickScrollButton(listContainerElement: Any, isLeftScroll: Boolean): Unit = js.native
  
  def dispose(): Unit = js.native
  
  def getListElementCss(index: Any): String = js.native
  
  def getScrollButtonCss(isLeftScroll: Boolean): Any = js.native
  
  var hasScroller: Any = js.native
  
  def isListElementClickable(index: Any): Boolean = js.native
  
  var progressButtonsModel: Any = js.native
  
  var scrollButtonCssKo: Any = js.native
  
  var updateScroller: Any = js.native
}
