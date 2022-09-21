package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyProgressButtonsModel")
@js.native
open class SurveyProgressButtonsModel protected () extends StObject {
  def this(survey: SurveyModel) = this()
  
  def clickListElement(index: Double): Unit = js.native
  
  def getListElementCss(index: Double): String = js.native
  
  def getScrollButtonCss(hasScroller: Boolean, isLeftScroll: Boolean): String = js.native
  
  def isListElementClickable(index: Double): Boolean = js.native
}
