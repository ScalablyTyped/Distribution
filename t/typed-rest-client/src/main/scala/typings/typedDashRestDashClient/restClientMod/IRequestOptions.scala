package typings.typedDashRestDashClient.restClientMod

import typings.typedDashRestDashClient.interfacesMod.IHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestOptions extends js.Object {
  var acceptHeader: js.UndefOr[String] = js.undefined
  var additionalHeaders: js.UndefOr[IHeaders] = js.undefined
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  var responseProcessor: js.UndefOr[js.Function] = js.undefined
}

object IRequestOptions {
  @scala.inline
  def apply(
    acceptHeader: String = null,
    additionalHeaders: IHeaders = null,
    deserializeDates: js.UndefOr[Boolean] = js.undefined,
    responseProcessor: js.Function = null
  ): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptHeader != null) __obj.updateDynamic("acceptHeader")(acceptHeader)
    if (additionalHeaders != null) __obj.updateDynamic("additionalHeaders")(additionalHeaders)
    if (!js.isUndefined(deserializeDates)) __obj.updateDynamic("deserializeDates")(deserializeDates)
    if (responseProcessor != null) __obj.updateDynamic("responseProcessor")(responseProcessor)
    __obj.asInstanceOf[IRequestOptions]
  }
}

