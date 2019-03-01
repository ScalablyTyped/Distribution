package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Object describing the current ready state. See [onreadystatechange](Titanium.Network.HTTPClient.onreadystatechange) for more information.
  */
trait ReadyStatePayload extends js.Object {
  /**
  	 * The state for which `onreadystatechange` was invoked. Set to one of `Titanium.Network.HTTPClient` ready-state constants
  	 */
  var readyState: js.UndefOr[scala.Double] = js.undefined
}

object ReadyStatePayload {
  @scala.inline
  def apply(readyState: scala.Int | scala.Double = null): ReadyStatePayload = {
    val __obj = js.Dynamic.literal()
    if (readyState != null) __obj.updateDynamic("readyState")(readyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadyStatePayload]
  }
}

