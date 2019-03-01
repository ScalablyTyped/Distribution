package typings
package xhrDashMockLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockObject extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[MockHeaders] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
}

object MockObject {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: MockHeaders = null,
    reason: java.lang.String = null,
    status: scala.Int | scala.Double = null
  ): MockObject = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockObject]
  }
}

