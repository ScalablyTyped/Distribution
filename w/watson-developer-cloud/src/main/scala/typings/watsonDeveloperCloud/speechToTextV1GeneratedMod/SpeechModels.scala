package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SpeechModels. */
@js.native
trait SpeechModels extends js.Object {
  /** An array of `SpeechModel` objects that provides information about each available model. */
  var models: js.Array[SpeechModel] = js.native
}

object SpeechModels {
  @scala.inline
  def apply(models: js.Array[SpeechModel]): SpeechModels = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechModels]
  }
  @scala.inline
  implicit class SpeechModelsOps[Self <: SpeechModels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModelsVarargs(value: SpeechModel*): Self = this.set("models", js.Array(value :_*))
    @scala.inline
    def setModels(value: js.Array[SpeechModel]): Self = this.set("models", value.asInstanceOf[js.Any])
  }
  
}

