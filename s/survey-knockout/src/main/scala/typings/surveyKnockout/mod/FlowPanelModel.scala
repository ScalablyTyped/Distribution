package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "FlowPanelModel")
@js.native
class FlowPanelModel () extends PanelModel {
  def this(name: String) = this()
  var content: String = js.native
  var html: String = js.native
  val locContent: LocalizableString = js.native
  def contentChangedCallback(): Unit = js.native
  def getElementContentText(element: IElement): String = js.native
  /* protected */ def getHtmlForQuestion(question: Question): String = js.native
  def getQuestionFromText(str: String): Question = js.native
  /* protected */ def getQuestionHtmlId(question: Question): String = js.native
  /* protected */ def onContentChanged(): js.Any = js.native
  def onCustomHtmlProducing(): String = js.native
  def onGetHtmlForQuestion(question: Question): String = js.native
  def produceHtml(): String = js.native
}

/* static members */
@JSImport("survey-knockout", "FlowPanelModel")
@js.native
object FlowPanelModel extends js.Object {
  var contentElementNamePrefix: String = js.native
}

