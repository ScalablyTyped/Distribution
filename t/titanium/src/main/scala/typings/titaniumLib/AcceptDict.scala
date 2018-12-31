package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options object for the [accept](Titanium.Network.Socket.TCP.accept) method.
  */
trait AcceptDict extends js.Object {
  /**
  	 * Callback to be fired when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ ErrorCallbackArgs, _]] = js.undefined
  /**
  	 * Timeout, in milliseconds, for all `write` operations.
  	 */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

