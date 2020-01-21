package typings.watsonDeveloperCloud.speechToTextV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechToTextV1
  extends typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.^ {
  def recognize(params: js.Any, callback: js.Any): Unit | js.Promise[_] = js.native
  /**
    * Use the recognize function with a single 2-way stream over websockets
    *
    * @param {Object} params The parameters
    * @return {RecognizeStream}
    */
  def recognizeUsingWebSocket(params: js.Any): typings.watsonDeveloperCloud.recognizeStreamMod.^ = js.native
  /**
    * Waits while corpora analysis status is 'being_processes', fires callback once the status is 'analyzed'
    *
    * Note: the code will throw an error in case there in no corpus in the customization
    *
    *
    * @param {Object} params The parameters
    * @param {String} params.customization_id - The GUID of the custom language model
    * @param {Number} [params.interval=5000] - (milliseconds) - how long to wait between status checks
    * @param {Number} [params.times=30] - maximum number of attempts
    * @param {Function} callback
    */
  def whenCorporaAnalyzed(params: js.Any, callback: js.Any): Unit = js.native
  /**
    * Waits while a customization status is 'pending' or 'training', fires callback once the status is 'ready' or 'available'.
    *
    * Note: the customization will remain in 'pending' status until at least one word corpus is added.
    *
    * See http://www.ibm.com/watson/developercloud/speech-to-text/api/v1/#list_models for status details.
    *
    * @param {Object} params The parameters
    * @param {String} params.customization_id - The GUID of the custom language model
    * @param {Number} [params.interval=5000] - (milliseconds) - how log to wait between status checks
    * @param {Number} [params.times=30] - maximum number of attempts
    * @param {Function} callback
    */
  def whenCustomizationReady(params: js.Any, callback: js.Any): Unit = js.native
}

