package typings
package watsonDashDeveloperDashCloudLib.watsonDashDeveloperDashCloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("watson-developer-cloud", "SpeechToTextV1")
@js.native
class SpeechToTextV1 protected () extends js.Object {
  def this(options: js.Any) = this()
  def addCorpus(params: js.Any, callback: js.Any): js.Any = js.native
  def addWord(params: js.Any, callback: js.Any): js.Any = js.native
  def addWords(params: js.Any, callback: js.Any): js.Any = js.native
  def createCustomization(params: js.Any, callback: js.Any): js.Any = js.native
  def createRecognitionJob(params: js.Any, callback: js.Any): js.Any = js.native
  def createRecognizeStream(params: js.Any): js.Any = js.native
  def createSession(params: js.Any, callback: js.Any): js.Any = js.native
  def deleteCorpus(params: js.Any, callback: js.Any): js.Any = js.native
  def deleteCustomization(params: js.Any, callback: js.Any): js.Any = js.native
  def deleteRecognitionJob(params: js.Any, callback: js.Any): js.Any = js.native
  def deleteSession(params: js.Any, callback: js.Any): js.Any = js.native
  def deleteWord(params: js.Any, callback: js.Any): js.Any = js.native
  def getCorpora(params: js.Any, callback: js.Any): js.Any = js.native
  def getCorpus(params: js.Any, callback: js.Any): js.Any = js.native
  def getCustomization(params: js.Any, callback: js.Any): js.Any = js.native
  def getCustomizations(params: js.Any, callback: js.Any): js.Any = js.native
  def getModel(params: js.Any, callback: js.Any): js.Any = js.native
  def getModels(params: js.Any, callback: js.Any): js.Any = js.native
  def getRecognitionJob(params: js.Any, callback: js.Any): js.Any = js.native
  def getRecognitionJobs(params: js.Any, callback: js.Any): js.Any = js.native
  def getRecognizeStatus(params: js.Any, callback: js.Any): js.Any = js.native
  def getWord(params: js.Any, callback: js.Any): js.Any = js.native
  def getWords(params: js.Any, callback: js.Any): js.Any = js.native
  def observeResult(params: js.Any, args: js.Any*): js.Any = js.native
  def recognize(params: js.Any, callback: js.Any): js.Any = js.native
  def recognizeLive(params: js.Any, args: js.Any*): js.Any = js.native
  def registerCallback(params: js.Any, callback: js.Any): js.Any = js.native
  def resetCustomization(params: js.Any, callback: js.Any): js.Any = js.native
  def trainCustomization(params: js.Any, callback: js.Any): js.Any = js.native
  def whenCorporaAnalyzed(params: js.Any, callback: js.Any): js.Any = js.native
  def whenCustomizationReady(params: js.Any, callback: js.Any): js.Any = js.native
}

/* static members */
@JSImport("watson-developer-cloud", "SpeechToTextV1")
@js.native
object SpeechToTextV1 extends js.Object {
  var ERR_NO_CORPORA: java.lang.String = js.native
  var ERR_TIMEOUT: java.lang.String = js.native
  var URL: java.lang.String = js.native
}

