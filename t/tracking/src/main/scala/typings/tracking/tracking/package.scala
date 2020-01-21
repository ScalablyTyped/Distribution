package typings.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tracking {
  /**
    * Color match predicate function.
    */
  type ColorFunction = js.Function3[/* r */ scala.Double, /* g */ scala.Double, /* b */ scala.Double, scala.Boolean]
  /**
    * Listener callback type for track events.
    */
  type TrackEventListener = js.Function1[/* event */ typings.tracking.tracking.TrackEvent, scala.Unit]
}
