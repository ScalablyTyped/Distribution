package typings.typedRestClient.restClientMod

import typings.typedRestClient.interfacesMod.IHeaders
import typings.typedRestClient.interfacesMod.IRequestQueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestOptions extends js.Object {
  var acceptHeader: js.UndefOr[String] = js.undefined
  var additionalHeaders: js.UndefOr[IHeaders] = js.undefined
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  var queryParameters: js.UndefOr[IRequestQueryParams] = js.undefined
  var responseProcessor: js.UndefOr[js.Function] = js.undefined
}

object IRequestOptions {
  @scala.inline
  def apply(
    acceptHeader: String = null,
    additionalHeaders: IHeaders = null,
    deserializeDates: js.UndefOr[Boolean] = js.undefined,
    queryParameters: IRequestQueryParams = null,
    responseProcessor: js.Function = null
  ): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptHeader != null) __obj.updateDynamic("acceptHeader")(acceptHeader.asInstanceOf[js.Any])
    if (additionalHeaders != null) __obj.updateDynamic("additionalHeaders")(additionalHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(deserializeDates)) __obj.updateDynamic("deserializeDates")(deserializeDates.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (responseProcessor != null) __obj.updateDynamic("responseProcessor")(responseProcessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestOptions]
  }
}

