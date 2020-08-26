package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** VoiceModel. */
@js.native
trait VoiceModel extends js.Object {
  /** The date and time in Coordinated Universal Time (UTC) at which the custom voice model was created. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var created: js.UndefOr[String] = js.native
  /** The customization ID (GUID) of the custom voice model. The **Create a custom model** method returns only this field. It does not not return the other fields of this object. */
  var customization_id: String = js.native
  /** The description of the custom voice model. */
  var description: js.UndefOr[String] = js.native
  /** The language identifier of the custom voice model (for example, `en-US`). */
  var language: js.UndefOr[String] = js.native
  /** The date and time in Coordinated Universal Time (UTC) at which the custom voice model was last modified. Equals `created` when a new voice model is first added but has yet to be updated. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var last_modified: js.UndefOr[String] = js.native
  /** The name of the custom voice model. */
  var name: js.UndefOr[String] = js.native
  /** The GUID of the service credentials for the instance of the service that owns the custom voice model. */
  var owner: js.UndefOr[String] = js.native
  /** An array of `Word` objects that lists the words and their translations from the custom voice model. The words are listed in alphabetical order, with uppercase letters listed before lowercase letters. The array is empty if the custom model contains no words. This field is returned only by the **Get a voice** method and only when you specify the customization ID of a custom voice model. */
  var words: js.UndefOr[js.Array[Word]] = js.native
}

object VoiceModel {
  @scala.inline
  def apply(customization_id: String): VoiceModel = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceModel]
  }
  @scala.inline
  implicit class VoiceModelOps[Self <: VoiceModel] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLast_modified(value: String): Self = this.set("last_modified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_modified: Self = this.set("last_modified", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setWordsVarargs(value: Word*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[Word]): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

