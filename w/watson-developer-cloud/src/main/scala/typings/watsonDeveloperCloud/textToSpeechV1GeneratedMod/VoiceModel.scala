package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** VoiceModel. */
trait VoiceModel extends js.Object {
  /** The date and time in Coordinated Universal Time (UTC) at which the custom voice model was created. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var created: js.UndefOr[String] = js.undefined
  /** The customization ID (GUID) of the custom voice model. The **Create a custom model** method returns only this field. It does not not return the other fields of this object. */
  var customization_id: String
  /** The description of the custom voice model. */
  var description: js.UndefOr[String] = js.undefined
  /** The language identifier of the custom voice model (for example, `en-US`). */
  var language: js.UndefOr[String] = js.undefined
  /** The date and time in Coordinated Universal Time (UTC) at which the custom voice model was last modified. Equals `created` when a new voice model is first added but has yet to be updated. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var last_modified: js.UndefOr[String] = js.undefined
  /** The name of the custom voice model. */
  var name: js.UndefOr[String] = js.undefined
  /** The GUID of the service credentials for the instance of the service that owns the custom voice model. */
  var owner: js.UndefOr[String] = js.undefined
  /** An array of `Word` objects that lists the words and their translations from the custom voice model. The words are listed in alphabetical order, with uppercase letters listed before lowercase letters. The array is empty if the custom model contains no words. This field is returned only by the **Get a voice** method and only when you specify the customization ID of a custom voice model. */
  var words: js.UndefOr[js.Array[Word]] = js.undefined
}

object VoiceModel {
  @scala.inline
  def apply(
    customization_id: String,
    created: String = null,
    description: String = null,
    language: String = null,
    last_modified: String = null,
    name: String = null,
    owner: String = null,
    words: js.Array[Word] = null
  ): VoiceModel = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (last_modified != null) __obj.updateDynamic("last_modified")(last_modified.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceModel]
  }
}

