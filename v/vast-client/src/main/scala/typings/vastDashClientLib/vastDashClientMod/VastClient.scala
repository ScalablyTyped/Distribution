package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastClient extends js.Object {
  /**
    * Used for ignoring the first n calls. Automatically reset 1 hour after the 1st ignored call. Free Lunch capping is disable if sets to 0.
    * Default: 0
    */
  var cappingFreeLunch: scala.Double = js.native
  /**
    * Used for ignoring calls that happen n ms after the previous call. Minimum time interval is disabled if sets to 0.
    * Default: 0
    */
  var cappingMinimumTimeInterval: scala.Double = js.native
  /**
    * Fetch a URL and parse the response into a valid VAST object.
    *
    * String url – Contains the URL for fetching the VAST XML document.
    * Object options – An optional set of key/value to configure the Ajax request:
    *      String response – A VAST XML document. When response is provided, no Ajax request is made and thus the url parameter is ignored
    *      Object urlhandler – A URL handler module, used to fetch the VAST document instead of the default ones.
    *      Boolean withCredentials – A boolean to enable the withCredentials options for the XHR and FLASH URLHandlers.
    *      Number wrapperLimit – A number of available Wrapper responses that can be received with no InLine response.
    * Function done – Method to be called once the VAST document is parsed. The VAST JS object is passed as the 1st parameter. If null, an error is provided as a 2nd parameter.
    */
  def get(
    url: java.lang.String,
    done: js.Function2[/* response */ VastResponse, /* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def get(
    url: java.lang.String,
    options: VastRequestOptions,
    done: js.Function2[/* response */ VastResponse, /* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

