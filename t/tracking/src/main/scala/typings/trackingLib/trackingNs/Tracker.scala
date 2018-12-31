package typings
package trackingLib.trackingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for specific tracker types.
  */
@JSGlobal("tracking.Tracker")
@js.native
abstract class Tracker () extends EventEmitter {
  /**
    * Tracks the pixels on the array. This method is called for each video
    * frame in order to emit `track` event.
    * @param pixels The pixel data to track.
    * @param width The pixel canvas width.
    * @param height The pixel data height.
    */
  def track(pixels: stdLib.Uint8ClampedArray, width: scala.Double, height: scala.Double): scala.Unit = js.native
}

