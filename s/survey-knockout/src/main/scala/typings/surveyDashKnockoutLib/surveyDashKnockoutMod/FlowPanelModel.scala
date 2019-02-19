package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "FlowPanelModel")
@js.native
class FlowPanelModel () extends PanelModel {
  def this(name: java.lang.String) = this()
  var content: java.lang.String = js.native
  var html: java.lang.String = js.native
  val locContent: LocalizableString = js.native
  def contentChangedCallback(): scala.Unit = js.native
  def getElementContentText(element: IElement): java.lang.String = js.native
  /* protected */ def getHtmlForQuestion(question: Question): java.lang.String = js.native
  def getQuestionFromText(str: java.lang.String): Question = js.native
  /* protected */ def getQuestionHtmlId(question: Question): java.lang.String = js.native
  /* protected */ def onContentChanged(): js.Any = js.native
  def onCustomHtmlProducing(): java.lang.String = js.native
  def onGetHtmlForQuestion(question: Question): java.lang.String = js.native
  def produceHtml(): java.lang.String = js.native
}

/* static members */
@JSImport("survey-knockout", "FlowPanelModel")
@js.native
object FlowPanelModel extends js.Object {
  var contentElementNamePrefix: java.lang.String = js.native
}

