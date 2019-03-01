package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Object describing the current audio route.
  */
trait RouteDescription extends js.Object {
  /**
  	 * An Array of current input ports for the session. See the `AUDIO_SESSION_PORT` constants.
  	 */
  var inputs: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * An Array of current output ports for the session. See the `AUDIO_SESSION_PORT` constants.
  	 */
  var outputs: js.UndefOr[js.Array[_]] = js.undefined
}

object RouteDescription {
  @scala.inline
  def apply(inputs: js.Array[_] = null, outputs: js.Array[_] = null): RouteDescription = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    __obj.asInstanceOf[RouteDescription]
  }
}

