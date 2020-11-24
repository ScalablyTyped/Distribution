package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyError")
@js.native
class SurveyError () extends js.Object {
  def this(text: String) = this()
  def this(text: js.UndefOr[scala.Nothing], errorOwner: ISurveyErrorOwner) = this()
  def this(text: String, errorOwner: ISurveyErrorOwner) = this()
  
  var errorOwner: ISurveyErrorOwner = js.native
  
  /* protected */ def getDefaultText(): String = js.native
  
  def getErrorType(): String = js.native
  
  def getText(): String = js.native
  
  val locText: LocalizableString = js.native
  
  var text: String = js.native
  
  var visible: Boolean = js.native
}
