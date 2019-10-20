package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashClassifierV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listClassifiers` operation. */
trait ListClassifiersParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object ListClassifiersParams {
  @scala.inline
  def apply(headers: js.Object = null, return_response: js.UndefOr[Boolean] = js.undefined): ListClassifiersParams = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[ListClassifiersParams]
  }
}

