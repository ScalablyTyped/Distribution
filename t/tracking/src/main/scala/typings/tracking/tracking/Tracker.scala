package typings.tracking.tracking

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for specific tracker types.
  */
@js.native
trait Tracker extends EventEmitter {
  
  /**
    * Tracks the pixels on the array. This method is called for each video
    * frame in order to emit `track` event.
    * @param pixels The pixel data to track.
    * @param width The pixel canvas width.
    * @param height The pixel data height.
    */
  def track(pixels: Uint8ClampedArray, width: Double, height: Double): Unit = js.native
}
