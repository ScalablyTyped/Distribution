package typings.webdriverio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: Double
  var error: js.UndefOr[js.Any] = js.undefined
  var passed: Boolean
  var result: js.UndefOr[js.Any] = js.undefined
  var retries: Attempts
}

object Duration {
  @scala.inline
  def apply(duration: Double, passed: Boolean, retries: Attempts, error: js.Any = null, result: js.Any = null): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

