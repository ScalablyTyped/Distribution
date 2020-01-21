package typings.whatwgUrl

import typings.whatwgUrl.mod.StateOverride
import typings.whatwgUrl.mod.URLRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseURLEncodingOverride extends js.Object {
  var baseURL: js.UndefOr[String] = js.undefined
  var encodingOverride: js.UndefOr[String] = js.undefined
  var stateOverride: js.UndefOr[StateOverride] = js.undefined
  var url: js.UndefOr[URLRecord] = js.undefined
}

object AnonBaseURLEncodingOverride {
  @scala.inline
  def apply(
    baseURL: String = null,
    encodingOverride: String = null,
    stateOverride: StateOverride = null,
    url: URLRecord = null
  ): AnonBaseURLEncodingOverride = {
    val __obj = js.Dynamic.literal()
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (encodingOverride != null) __obj.updateDynamic("encodingOverride")(encodingOverride.asInstanceOf[js.Any])
    if (stateOverride != null) __obj.updateDynamic("stateOverride")(stateOverride.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseURLEncodingOverride]
  }
}

