package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SpeechModels. */
trait SpeechModels extends js.Object {
  /** An array of `SpeechModel` objects that provides information about each available model. */
  var models: js.Array[SpeechModel]
}

object SpeechModels {
  @scala.inline
  def apply(models: js.Array[SpeechModel]): SpeechModels = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechModels]
  }
}

