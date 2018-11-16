package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VastRequestOptions extends js.Object {
  /**
       * A VAST XML document. When response is provided, no Ajax request is made and thus the url parameter is ignored.
       */
  var response: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A URL handler module, used to fetch the VAST document instead of the default ones.
       */
  var urlhandler: js.UndefOr[js.Any] = js.undefined
  /**
       * A boolean to enable the withCredentials options for the XHR and FLASH URLHandlers.
       */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A number of available Wrapper responses that can be received with no InLine response.
       */
  var wrapperLimit: js.UndefOr[scala.Double] = js.undefined
}

