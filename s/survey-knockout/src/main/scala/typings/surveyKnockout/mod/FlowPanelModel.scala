package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "FlowPanelModel")
@js.native
class FlowPanelModel () extends PanelModel {
  def this(name: String) = this()
  
  var content: String = js.native
  
  def contentChangedCallback(): Unit = js.native
  
  def getElementContentText(element: IElement): String = js.native
  
  /* protected */ def getHtmlForQuestion(question: Question): String = js.native
  
  def getQuestionFromText(str: String): Question = js.native
  
  /* protected */ def getQuestionHtmlId(question: Question): String = js.native
  
  var html: String = js.native
  
  val locContent: LocalizableString = js.native
  
  /* protected */ def onContentChanged(): js.Any = js.native
  
  def onCustomHtmlProducing(): String = js.native
  
  def onGetHtmlForQuestion(question: Question): String = js.native
  
  def produceHtml(): String = js.native
}
/* static members */
object FlowPanelModel {
  
  @JSImport("survey-knockout", "FlowPanelModel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "FlowPanelModel.contentElementNamePrefix")
  @js.native
  def contentElementNamePrefix: String = js.native
  @scala.inline
  def contentElementNamePrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentElementNamePrefix")(x.asInstanceOf[js.Any])
}
