package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastError extends js.Object {
  /**
    * Whenever an error occurs during the VAST parsing, the parser will call on its own all related tracking error URLs. Reported errors are:
    *      no_ad: The VAST document is empty
    *      VAST error 101: VAST schema validation error.
    *      VAST error 301: Timeout of VAST URI provided in Wrapper element.
    *      VAST error 302: Wrapper limit reached.
    *      VAST error 303: No VAST response after one or more Wrappers.
    */
  var ERRORCODE: String | Double
  var ERRORMESSAGE: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.undefined
  var system: js.UndefOr[VastSystem | String | Null] = js.undefined
}

object VastError {
  @scala.inline
  def apply(
    ERRORCODE: String | Double,
    ERRORMESSAGE: String = null,
    extensions: js.Array[VastAdExtension] = null,
    system: js.UndefOr[Null | VastSystem | String] = js.undefined
  ): VastError = {
    val __obj = js.Dynamic.literal(ERRORCODE = ERRORCODE.asInstanceOf[js.Any])
    if (ERRORMESSAGE != null) __obj.updateDynamic("ERRORMESSAGE")(ERRORMESSAGE.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(system)) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastError]
  }
}

