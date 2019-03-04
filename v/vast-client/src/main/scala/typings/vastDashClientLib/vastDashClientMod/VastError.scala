package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastError extends js.Object {
  /**
    * Whenever an error occurs during the VAST parsing, the parser will call on his own all related tracking error URLs. Reported errors are:
    *      no_ad: The VAST document is empty
    *      VAST error 101: VAST schema validation error.
    *      VAST error 301: Timeout of VAST URI provided in Wrapper element.
    *      VAST error 302: Wrapper limit reached.
    *      VAST error 303: No VAST response after one or more Wrappers.
    */
  var ERRORCODE: java.lang.String | scala.Double
  var ERRORMESSAGE: js.UndefOr[java.lang.String] = js.undefined
  var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.undefined
  var system: js.UndefOr[VastSystem | java.lang.String | scala.Null] = js.undefined
}

object VastError {
  @scala.inline
  def apply(
    ERRORCODE: java.lang.String | scala.Double,
    ERRORMESSAGE: java.lang.String = null,
    extensions: js.Array[VastAdExtension] = null,
    system: VastSystem | java.lang.String = null
  ): VastError = {
    val __obj = js.Dynamic.literal(ERRORCODE = ERRORCODE.asInstanceOf[js.Any])
    if (ERRORMESSAGE != null) __obj.updateDynamic("ERRORMESSAGE")(ERRORMESSAGE)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastError]
  }
}

