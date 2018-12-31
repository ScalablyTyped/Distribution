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

