package typings
package vsoDashNodeDashApiLib.vsoClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientVersioningData extends js.Object {
  /**
    * The api version string to send in the request (e.g. "1.0" or "2.0-preview.2")
    */
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The request path string to send the request to.  Looked up via an options request with the location id.
    */
  var requestUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ClientVersioningData {
  @scala.inline
  def apply(apiVersion: java.lang.String = null, requestUrl: java.lang.String = null): ClientVersioningData = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    __obj.asInstanceOf[ClientVersioningData]
  }
}

