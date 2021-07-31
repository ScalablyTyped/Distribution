package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCompositeModel")
@js.native
class QuestionCompositeModel protected () extends QuestionCustomModelBase {
  def this(name: String, customQuestion: ComponentQuestionJSON) = this()
  
  val contentPanel: PanelModel = js.native
  
  /* protected */ def createPanel(): PanelModel = js.native
}
