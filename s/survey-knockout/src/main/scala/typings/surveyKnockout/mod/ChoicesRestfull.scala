package typings.surveyKnockout.mod

import typings.surveyKnockout.anon.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ChoicesRestfull")
@js.native
class ChoicesRestfull () extends Base {
  var allowEmptyResponse: Boolean = js.native
  var error: SurveyError = js.native
  val isEmpty: Boolean = js.native
  val isRunning: Boolean = js.native
  val isWaitingForParameters: Boolean = js.native
  val itemValueType: String = js.native
  var owner: IQuestion = js.native
  var path: String = js.native
  var processedPath: String = js.native
  var processedUrl: String = js.native
  var titleName: String = js.native
  var url: String = js.native
  var valueName: String = js.native
  /* protected */ def beforeSendRequest(): Unit = js.native
  def beforeSendRequestCallback(): Unit = js.native
  def clear(): Unit = js.native
  def getCustomPropertiesNames(): js.Array[String] = js.native
  def getData(): js.Any = js.native
  def getItemValueCallback(item: js.Any): js.Any = js.native
  def getResultCallback(items: js.Array[ItemValue]): Unit = js.native
  /* protected */ def onLoad(result: js.Any): Unit = js.native
  /* protected */ def parseResponse(response: js.Any): js.Any = js.native
  def run(): Unit = js.native
  def run(textProcessor: ITextProcessor): Unit = js.native
  /* protected */ def sendRequest(): Unit = js.native
  def setData(json: js.Any): Unit = js.native
  def updateResultCallback(items: js.Array[ItemValue], serverResult: js.Any): js.Array[ItemValue] = js.native
  /* protected */ def useChangedItemsResults(): Boolean = js.native
}

/* static members */
@JSImport("survey-knockout", "ChoicesRestfull")
@js.native
object ChoicesRestfull extends js.Object {
  var EncodeParameters: Boolean = js.native
  def clearCache(): Unit = js.native
  def onBeforeSendRequest(sender: ChoicesRestfull, options: Request): Unit = js.native
}

