package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCompositeModel")
@js.native
open class QuestionCompositeModel protected () extends QuestionCustomModelBase {
  def this(name: String, customQuestion: ComponentQuestionJSON) = this()
  
  def contentPanel: PanelModel = js.native
  
  /* protected */ def createPanel(): PanelModel = js.native
  
  var panelWrapper: PanelModel = js.native
  
  var settingNewValue: Boolean = js.native
  
  var textProcessing: QuestionCompositeTextProcessor = js.native
}
/* static members */
object QuestionCompositeModel {
  
  @JSImport("survey-knockout", "QuestionCompositeModel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "QuestionCompositeModel.ItemVariableName")
  @js.native
  def ItemVariableName: String = js.native
  inline def ItemVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemVariableName")(x.asInstanceOf[js.Any])
}
