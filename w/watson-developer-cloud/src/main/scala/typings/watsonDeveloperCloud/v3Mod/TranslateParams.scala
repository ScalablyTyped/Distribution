package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `translate` operation. */
trait TranslateParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** A globally unique string that identifies the underlying model that is used for translation. */
  var model_id: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Translation source language code. */
  var source: js.UndefOr[String] = js.undefined
  /** Translation target language code. */
  var target: js.UndefOr[String] = js.undefined
  /** Input text in UTF-8 encoding. Multiple entries will result in multiple translations in the response. */
  var text: js.Array[String]
}

object TranslateParams {
  @scala.inline
  def apply(
    text: js.Array[String],
    headers: js.Object = null,
    model_id: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    target: String = null
  ): TranslateParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (model_id != null) __obj.updateDynamic("model_id")(model_id.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateParams]
  }
}

