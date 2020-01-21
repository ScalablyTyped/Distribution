package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createTokenizationDictionary` operation. */
trait CreateTokenizationDictionaryParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** An array of tokenization rules. Each rule contains, the original `text` string, component `tokens`, any alternate character set `readings`, and which `part_of_speech` the text is from. */
  var tokenization_rules: js.UndefOr[js.Array[TokenDictRule]] = js.undefined
}

object CreateTokenizationDictionaryParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    tokenization_rules: js.Array[TokenDictRule] = null
  ): CreateTokenizationDictionaryParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (tokenization_rules != null) __obj.updateDynamic("tokenization_rules")(tokenization_rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTokenizationDictionaryParams]
  }
}

