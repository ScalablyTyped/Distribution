package typings.xhrDashMock.libTypesMod

import typings.xhrDashMock.libMockHeadersMod.MockHeaders
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
    status: Int | Double = null
  ): MockObject = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockObject]
  }
}

