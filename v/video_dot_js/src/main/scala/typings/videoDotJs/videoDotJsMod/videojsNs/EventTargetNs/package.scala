package typings.videoDotJs.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventTargetNs {
  /**
  		 * All event listeners should follow the following format.
  		 *
  		 * @param event
  		 *        the event that triggered this function
  		 *
  		 * @param [hash]
  		 *        hash of data sent during the event
  		 */
  type EventListener = js.Function2[/* e */ Event, /* data */ js.UndefOr[js.Any], Unit]
}
