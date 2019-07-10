package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ChoicesRestfull")
@js.native
class ChoicesRestfull () extends Base {
  var allowEmptyResponse: scala.Boolean = js.native
  var error: SurveyError = js.native
  val isEmpty: scala.Boolean = js.native
  val isRunning: scala.Boolean = js.native
  val isWaitingForParameters: scala.Boolean = js.native
  val itemValueType: java.lang.String = js.native
  var owner: IQuestion = js.native
  var path: java.lang.String = js.native
  var processedPath: java.lang.String = js.native
  var processedUrl: java.lang.String = js.native
  var titleName: java.lang.String = js.native
  var url: java.lang.String = js.native
  var valueName: java.lang.String = js.native
  def clear(): scala.Unit = js.native
  def getCustomPropertiesNames(): js.Array[java.lang.String] = js.native
  def getData(): js.Any = js.native
  def getItemValueCallback(item: js.Any): js.Any = js.native
  def getResultCallback(items: js.Array[ItemValue]): scala.Unit = js.native
  /* protected */ def onLoad(result: js.Any): scala.Unit = js.native
  /* protected */ def parseResponse(response: js.Any): js.Any = js.native
  def run(): scala.Unit = js.native
  def run(textProcessor: ITextProcessor): scala.Unit = js.native
  /* protected */ def sendRequest(): scala.Unit = js.native
  def setData(json: js.Any): scala.Unit = js.native
  def updateResultCallback(items: js.Array[ItemValue], serverResult: js.Any): js.Array[ItemValue] = js.native
  /* protected */ def useChangedItemsResults(): scala.Boolean = js.native
}

/* static members */
@JSImport("survey-knockout", "ChoicesRestfull")
@js.native
object ChoicesRestfull extends js.Object {
  var EncodeParameters: scala.Boolean = js.native
  def clearCache(): scala.Unit = js.native
  def onBeforeSendRequest(
    sender: surveyDashKnockoutLib.surveyDashKnockoutMod.ChoicesRestfull,
    options: surveyDashKnockoutLib.Anon_Request
  ): scala.Unit = js.native
}

