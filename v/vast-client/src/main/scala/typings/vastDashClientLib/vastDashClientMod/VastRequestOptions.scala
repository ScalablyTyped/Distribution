package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastRequestOptions extends js.Object {
  /**
    * Allows you to parse all the ads contained in the VAST or to parse them ad by ad or adPod by adPod (default true)
    */
  var resolveAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A custom timeout for the requests (default 0)
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Custom urlhandler to be used instead of the default ones urlhandlers
    */
  var urlHandler: js.UndefOr[VASTClientUrlHandler] = js.undefined
  /**
    * A boolean to enable the withCredentials options for the XHR and FLASH URLHandlers (default false)
    */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A number of Wrapper responses that can be received with no InLine response (default 0)
    */
  var wrapperLimit: js.UndefOr[scala.Double] = js.undefined
}

object VastRequestOptions {
  @scala.inline
  def apply(
    resolveAll: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    urlHandler: VASTClientUrlHandler = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    wrapperLimit: scala.Int | scala.Double = null
  ): VastRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resolveAll)) __obj.updateDynamic("resolveAll")(resolveAll)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (urlHandler != null) __obj.updateDynamic("urlHandler")(urlHandler)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (wrapperLimit != null) __obj.updateDynamic("wrapperLimit")(wrapperLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastRequestOptions]
  }
}

