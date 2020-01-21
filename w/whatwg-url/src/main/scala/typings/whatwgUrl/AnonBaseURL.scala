package typings.whatwgUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseURL extends js.Object {
  var baseURL: js.UndefOr[String] = js.undefined
  var encodingOverride: js.UndefOr[String] = js.undefined
}

object AnonBaseURL {
  @scala.inline
  def apply(baseURL: String = null, encodingOverride: String = null): AnonBaseURL = {
    val __obj = js.Dynamic.literal()
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (encodingOverride != null) __obj.updateDynamic("encodingOverride")(encodingOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseURL]
  }
}

