package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateVoiceModel` operation. */
@js.native
trait UpdateVoiceModelParams extends js.Object {
  /** The customization ID (GUID) of the custom voice model. You must make the request with service credentials created for the instance of the service that owns the custom model. */
  var customization_id: String = js.native
  /** A new description for the custom voice model. */
  var description: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** A new name for the custom voice model. */
  var name: js.UndefOr[String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** An array of `Word` objects that provides the words and their translations that are to be added or updated for the custom voice model. Pass an empty array to make no additions or updates. */
  var words: js.UndefOr[js.Array[Word]] = js.native
}

object UpdateVoiceModelParams {
  @scala.inline
  def apply(customization_id: String): UpdateVoiceModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceModelParams]
  }
  @scala.inline
  implicit class UpdateVoiceModelParamsOps[Self <: UpdateVoiceModelParams] (val x: Self) extends AnyVal {
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
    def setCustomization_id(value: String): Self = this.set("customization_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setWordsVarargs(value: Word*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[Word]): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

