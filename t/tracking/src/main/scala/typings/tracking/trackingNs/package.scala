package typings.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object trackingNs {
  /**
    * Color match predicate function.
    */
  type ColorFunction = js.Function3[/* r */ Double, /* g */ Double, /* b */ Double, Boolean]
  /**
    * Listener callback type for track events.
    */
  type TrackEventListener = js.Function1[/* event */ TrackEvent, Unit]
}
