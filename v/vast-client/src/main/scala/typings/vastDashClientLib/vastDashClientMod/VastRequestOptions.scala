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

