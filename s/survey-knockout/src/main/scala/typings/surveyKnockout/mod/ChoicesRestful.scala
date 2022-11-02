package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ChoicesRestful")
@js.native
open class ChoicesRestful () extends Base {
  
  def allowEmptyResponse: Boolean = js.native
  def allowEmptyResponse_=(`val`: Boolean): Unit = js.native
  
  def attachOriginalItems: Boolean = js.native
  def attachOriginalItems_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def beforeLoadRequest(): Unit = js.native
  
  /* protected */ def beforeSendRequest(): Unit = js.native
  
  var beforeSendRequestCallback: Any = js.native
  
  /* protected */ def callResultCallback(items: Any, loadingObjHash: String): Unit = js.native
  
  def clear(): Unit = js.native
  
  def createItemValue(value: Any): ItemValue = js.native
  
  var error: SurveyError = js.native
  
  def getCustomPropertiesNames(): js.Array[Any] = js.native
  
  def getData(): Any = js.native
  
  /* protected */ def getIsRunning(): Boolean = js.native
  
  def getItemValueCallback(item: Any): Any = js.native
  
  def getResultCallback(items: Any): Unit = js.native
  
  /*
    * Specifies which property in the obtained data object contains image URLs. Used only in [Image Picker](https://surveyjs.io/Examples/Library?id=questiontype-imagepicker) questions.
    */
  def imageLinkName: String = js.native
  def imageLinkName_=(`val`: String): Unit = js.native
  
  def isEmpty: Boolean = js.native
  
  def isRunning: Boolean = js.native
  
  var isRunningValue: Boolean = js.native
  
  def isUsingCache: Boolean = js.native
  
  var isUsingCacheFromUrl: Boolean = js.native
  
  def isWaitingForParameters: Boolean = js.native
  
  def itemValueType: String = js.native
  
  var lastObjHash: String = js.native
  
  /* protected */ def onLoad(result: Any): Unit = js.native
  /* protected */ def onLoad(result: Any, loadingObjHash: String): Unit = js.native
  
  def onProcessedUrlCallback(url: String, path: String): Unit = js.native
  
  var owner: IQuestion = js.native
  
  /* protected */ def parseResponse(response: Any): Any = js.native
  
  /*
    * Path to the array of choices. The following path separators are allowed: semicolon `;`, comma `,`.
    * 
    * Specify this property only if the array of choices is nested within the object returned by the service. For example, the service returns the following object:
    * 
    * ```js
    * {
    *   countries: [ ... ],
    *   capitals: [ ... ]
    * }
    * ```
    * 
    * To populate choices with values from the `countries` array, set the `path` property to `"countries"`. To use the `capitals` array, set this property to `"capitals"`.
    */
  def path: String = js.native
  def path_=(`val`: String): Unit = js.native
  
  /* protected */ var processedPath: String = js.native
  
  /* protected */ var processedUrl: String = js.native
  
  def run(): Unit = js.native
  def run(textProcessor: ITextProcessor): Unit = js.native
  
  /* protected */ def sendRequest(): Unit = js.native
  
  def setData(json: Any): Unit = js.native
  
  /*
    * Specifies which property in the obtained data object contains display texts for choices.
    */
  def titleName: String = js.native
  def titleName_=(`val`: String): Unit = js.native
  
  def updateResultCallback(items: Any, serverResult: Any): Any = js.native
  
  /*
    * A RESTful service's URL.
    * 
    * This property supports [dynamic URLs](https://surveyjs.io/Documentation/Library?id=design-survey-conditional-logic#dynamic-texts). For example, the URL below depends on the `region` question's value. When the value changes, the survey automatically loads a new dataset that corresponds to the selected region.
    * 
    * ```js
    * url: "https://surveyjs.io/api/CountriesExample?region={region}"
    * ```
    * 
    * [View Example](https://surveyjs.io/Examples/Library/?id=questiontype-dropdownrestfull (linkStyle))
    */
  def url: String = js.native
  def url_=(`val`: String): Unit = js.native
  
  /* protected */ def useChangedItemsResults(): Boolean = js.native
  
  /*
    * Specifies which property in the obtained data object contains choice values.
    * 
    * [View Example](https://surveyjs.io/Examples/Library/?id=questiontype-dropdownrestfull (linkStyle))
    */
  def valueName: String = js.native
  def valueName_=(`val`: String): Unit = js.native
}
/* static members */
object ChoicesRestful {
  
  @JSImport("survey-knockout", "ChoicesRestful")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "ChoicesRestful.cacheText")
  @js.native
  def cacheText: String = js.native
  inline def cacheText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheText")(x.asInstanceOf[js.Any])
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  @JSImport("survey-knockout", "ChoicesRestful.itemsResult")
  @js.native
  def itemsResult: Any = js.native
  inline def itemsResult_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemsResult")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "ChoicesRestful.noCacheText")
  @js.native
  def noCacheText: String = js.native
  inline def noCacheText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noCacheText")(x.asInstanceOf[js.Any])
  
  inline def onBeforeSendRequest(sender: ChoicesRestful, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeSendRequest")(sender.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("survey-knockout", "ChoicesRestful.sendingSameRequests")
  @js.native
  def sendingSameRequests: Any = js.native
  inline def sendingSameRequests_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendingSameRequests")(x.asInstanceOf[js.Any])
}
