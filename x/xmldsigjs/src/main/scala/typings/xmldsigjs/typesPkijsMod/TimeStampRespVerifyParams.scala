package typings.xmldsigjs.typesPkijsMod

import typings.std.BufferSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeStampRespVerifyParams extends js.Object {
  var data: BufferSource
  var notAfter: js.UndefOr[Date] = js.undefined
  var notBefore: js.UndefOr[Date] = js.undefined
}

object TimeStampRespVerifyParams {
  @scala.inline
  def apply(data: BufferSource, notAfter: Date = null, notBefore: Date = null): TimeStampRespVerifyParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStampRespVerifyParams]
  }
}

