package typings.xhrMock.typesMod

import typings.xhrMock.mockHeadersMod.MockHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockObject extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[MockHeaders] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object MockObject {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: MockHeaders = null,
    reason: String = null,
    status: js.UndefOr[Double] = js.undefined
  ): MockObject = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockObject]
  }
}

