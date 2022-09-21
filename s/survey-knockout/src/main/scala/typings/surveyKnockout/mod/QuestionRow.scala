package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.`survey-panel`
import typings.surveyKnockout.surveyKnockoutStrings.`survey-question`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionRow")
@js.native
open class QuestionRow protected () extends QuestionRowModel {
  def this(panel: Any) = this()
  
  def getElementType(el: Any): `survey-panel` | `survey-question` = js.native
  
  def koAfterRender(el: Any, con: Any): Unit = js.native
  
  var koElementAfterRender: Any = js.native
  
  def rowAfterRender(elements: Any, model: QuestionRow): Unit = js.native
}
