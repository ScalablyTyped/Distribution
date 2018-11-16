package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Object passed to the error callback when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
 */

trait ErrorCallbackArgs extends js.Object {
  /**
  	 * Error code. Returns a non-zero value.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The error code of the error (potentially system-dependent).
  	 */
  var errorCode: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Socket that experienced the error.
  	 */
  var socket: js.UndefOr[titaniumLib.TitaniumNs.NetworkNs.SocketNs.TCP] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `false`.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

