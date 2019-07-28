package typings.tracking.trackingNs

import typings.std.HTMLElement
import typings.tracking.Anon_Audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tracking")
@js.native
object ^ extends js.Object {
  def track(element: String, tracker: Tracker): TrackerTask = js.native
  def track(element: String, tracker: Tracker, options: Anon_Audio): TrackerTask = js.native
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
  def track(element: HTMLElement, tracker: Tracker): TrackerTask = js.native
  def track(element: HTMLElement, tracker: Tracker, options: Anon_Audio): TrackerTask = js.native
}

