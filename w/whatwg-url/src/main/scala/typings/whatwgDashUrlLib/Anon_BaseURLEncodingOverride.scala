package typings
package whatwgDashUrlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseURLEncodingOverride extends js.Object {
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  var encodingOverride: js.UndefOr[java.lang.String] = js.undefined
  var stateOverride: js.UndefOr[whatwgDashUrlLib.whatwgDashUrlMod.StateOverride] = js.undefined
  var url: js.UndefOr[whatwgDashUrlLib.whatwgDashUrlMod.URLRecord] = js.undefined
}

object Anon_BaseURLEncodingOverride {
  @scala.inline
  def apply(
    baseURL: java.lang.String = null,
    encodingOverride: java.lang.String = null,
    stateOverride: whatwgDashUrlLib.whatwgDashUrlMod.StateOverride = null,
    url: whatwgDashUrlLib.whatwgDashUrlMod.URLRecord = null
  ): Anon_BaseURLEncodingOverride = {
    val __obj = js.Dynamic.literal()
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (encodingOverride != null) __obj.updateDynamic("encodingOverride")(encodingOverride)
    if (stateOverride != null) __obj.updateDynamic("stateOverride")(stateOverride)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_BaseURLEncodingOverride]
  }
}

