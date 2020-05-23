package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `identify` operation. */
trait IdentifyParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Input text in UTF-8 format. */
  var text: String
}

object IdentifyParams {
  @scala.inline
  def apply(text: String, headers: js.Object = null, return_response: js.UndefOr[Boolean] = js.undefined): IdentifyParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifyParams]
  }
}

