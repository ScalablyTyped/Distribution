package typings.surveyKnockout.mod

import typings.surveyKnockout.anon.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ChoicesRestfull")
@js.native
class ChoicesRestfull () extends Base {
  
  var allowEmptyResponse: Boolean = js.native
  
  var attachOriginalItems: Boolean = js.native
  
  /* protected */ def beforeSendRequest(): Unit = js.native
  
  def beforeSendRequestCallback(): Unit = js.native
  
  /* protected */ def callResultCallback(items: js.Array[ItemValue], loadingObjHash: String): Unit = js.native
  
  def clear(): Unit = js.native
  
  var error: SurveyError = js.native
  
  def getCustomPropertiesNames(): js.Array[String] = js.native
  
  def getData(): js.Any = js.native
  
  def getItemValueCallback(item: js.Any): js.Any = js.native
  
  def getResultCallback(items: js.Array[ItemValue]): Unit = js.native
  
  var imageLinkName: String = js.native
  
  val isEmpty: Boolean = js.native
  
  val isRunning: Boolean = js.native
  
  val isUsingCache: Boolean = js.native
  
  val isWaitingForParameters: Boolean = js.native
  
  val itemValueType: String = js.native
  
  /* protected */ def onLoad(result: js.Any): Unit = js.native
  /* protected */ def onLoad(result: js.Any, loadingObjHash: String): Unit = js.native
  
  var owner: IQuestion = js.native
  
  /* protected */ def parseResponse(response: js.Any): js.Any = js.native
  
  var path: String = js.native
  
  var processedPath: String = js.native
  
  var processedUrl: String = js.native
  
  def run(): Unit = js.native
  def run(textProcessor: ITextProcessor): Unit = js.native
  
  /* protected */ def sendRequest(): Unit = js.native
  
  def setData(json: js.Any): Unit = js.native
  
  var titleName: String = js.native
  
  def updateResultCallback(items: js.Array[ItemValue], serverResult: js.Any): js.Array[ItemValue] = js.native
  
  var url: String = js.native
  
  /* protected */ def useChangedItemsResults(): Boolean = js.native
  
  var valueName: String = js.native
}
/* static members */
object ChoicesRestfull {
  
  @JSImport("survey-knockout", "ChoicesRestfull")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "ChoicesRestfull.EncodeParameters")
  @js.native
  def EncodeParameters: Boolean = js.native
  @scala.inline
  def EncodeParameters_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EncodeParameters")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  @scala.inline
  def onBeforeSendRequest(sender: ChoicesRestfull, options: Request): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeSendRequest")(sender.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
