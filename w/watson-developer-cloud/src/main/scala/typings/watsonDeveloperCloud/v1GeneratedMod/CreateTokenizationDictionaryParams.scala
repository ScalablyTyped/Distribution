package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createTokenizationDictionary` operation. */
@js.native
trait CreateTokenizationDictionaryParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** An array of tokenization rules. Each rule contains, the original `text` string, component `tokens`, any alternate character set `readings`, and which `part_of_speech` the text is from. */
  var tokenization_rules: js.UndefOr[js.Array[TokenDictRule]] = js.native
}

object CreateTokenizationDictionaryParams {
  @scala.inline
  def apply(collection_id: String, environment_id: String): CreateTokenizationDictionaryParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTokenizationDictionaryParams]
  }
  @scala.inline
  implicit class CreateTokenizationDictionaryParamsOps[Self <: CreateTokenizationDictionaryParams] (val x: Self) extends AnyVal {
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
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setTokenization_rulesVarargs(value: TokenDictRule*): Self = this.set("tokenization_rules", js.Array(value :_*))
    @scala.inline
    def setTokenization_rules(value: js.Array[TokenDictRule]): Self = this.set("tokenization_rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenization_rules: Self = this.set("tokenization_rules", js.undefined)
  }
  
}

