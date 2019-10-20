package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `addWord` operation. */
trait AddWordParams extends js.Object {
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  /** An alternative spelling for the custom word when it appears in a transcript. Use the parameter when you want the word to have a spelling that is different from its usual representation or from its spelling in corpora training data. */
  var display_as: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** An array of sounds-like pronunciations for the custom word. Specify how words that are difficult to pronounce, foreign words, acronyms, and so on can be pronounced by users. * For a word that is not in the service's base vocabulary, omit the parameter to have the service automatically generate a sounds-like pronunciation for the word. * For a word that is in the service's base vocabulary, use the parameter to specify additional pronunciations for the word. You cannot override the default pronunciation of a word; pronunciations you add augment the pronunciation from the base vocabulary. A word can have at most five sounds-like pronunciations. A pronunciation can include at most 40 characters not including spaces. */
  var sounds_like: js.UndefOr[js.Array[String]] = js.undefined
  /** For the **Add custom words** method, you must specify the custom word that is to be added to or updated in the custom model. Do not include spaces in the word. Use a `-` (dash) or `_` (underscore) to connect the tokens of compound words. Omit this parameter for the **Add a custom word** method. */
  var word: js.UndefOr[String] = js.undefined
  /** The custom word that is to be added to or updated in the custom language model. Do not include spaces in the word. Use a `-` (dash) or `_` (underscore) to connect the tokens of compound words. URL-encode the word if it includes non-ASCII characters. For more information, see [Character encoding](https://cloud.ibm.com/docs/services/speech-to-text/language-resource.html#charEncoding). */
  var word_name: String
}

object AddWordParams {
  @scala.inline
  def apply(
    customization_id: String,
    word_name: String,
    display_as: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sounds_like: js.Array[String] = null,
    word: String = null
  ): AddWordParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id, word_name = word_name)
    if (display_as != null) __obj.updateDynamic("display_as")(display_as)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (sounds_like != null) __obj.updateDynamic("sounds_like")(sounds_like)
    if (word != null) __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[AddWordParams]
  }
}

