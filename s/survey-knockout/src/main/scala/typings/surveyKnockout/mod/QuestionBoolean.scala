package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionBoolean")
@js.native
class QuestionBoolean protected () extends QuestionBooleanModel {
  def this(name: String) = this()
  
  def getCheckedLabelCss(): String = js.native
  
  def getItemCss(row: js.Any, column: js.Any): js.Any = js.native
  
  def getUncheckedLabelCss(): String = js.native
  
  def onFalseLabelClick(data: js.Any, event: js.Any): Boolean = js.native
  
  def onSwitchClick(data: js.Any, event: js.Any): Boolean = js.native
  
  def onTrueLabelClick(data: js.Any, event: js.Any): Boolean = js.native
}
