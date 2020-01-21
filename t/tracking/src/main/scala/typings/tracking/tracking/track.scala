package typings.tracking.tracking

import typings.std.HTMLElement
import typings.tracking.AnonAudio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tracking.track")
@js.native
object track extends js.Object {
  def apply(element: String, tracker: Tracker): TrackerTask = js.native
  def apply(element: String, tracker: Tracker, options: AnonAudio): TrackerTask = js.native
  /**
    * Tracks a canvas, image or video element based on the specified `tracker`
    * instance. This method extract the pixel information of the input element
    * to pass to the `tracker` instance. When tracking a video, the
    * `tracker.track(pixels, width, height)` will be in a
    * `requestAnimationFrame` loop in order to track all video frames.
    * @param element HTMLElement or CSS3 selector string for the element to track.
    *                Element must be convas, image, or video.
    * @param tracker Tracker instance used to track the element.
    * @param options Optional tracker configuration.
    */
  def apply(element: HTMLElement, tracker: Tracker): TrackerTask = js.native
  def apply(element: HTMLElement, tracker: Tracker, options: AnonAudio): TrackerTask = js.native
}

