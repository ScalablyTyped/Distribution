package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteCorpus` operation. */
trait DeleteCorpusParams extends js.Object {
  /** The name of the corpus for the custom language model. */
  var corpus_name: String
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object DeleteCorpusParams {
  @scala.inline
  def apply(
    corpus_name: String,
    customization_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): DeleteCorpusParams = {
    val __obj = js.Dynamic.literal(corpus_name = corpus_name, customization_id = customization_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[DeleteCorpusParams]
  }
}

