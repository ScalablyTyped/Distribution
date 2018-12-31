package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vast-client", "tracker")
@js.native
class tracker protected () extends js.Object {
  /**
    * The VAST tracker constructor will process the tracking URLs of the selected ad/creative and returns an instance of VASTTracker.
    * You can create an instance with new DMVAST.tracker( ad , creative ).
    *
    * Object ad – Reference to the <Ad> element of the selected mediaFile
    * Object creative – Reference to the <Creative> element of the selected mediaFile
    * Object variationd -  An optional reference to the selected <NonLinear>/<Companion> element for non-linear ads
    */
  def this(ad: VastAd, creative: VastCreativeLinear) = this()
  def this(ad: VastAd, creative: VastCreativeLinear, companion: VastCreativeCompanion) = this()
  /**
    * Must be called when the user clicks on the creative. Call the tracking URLs. Emit a clickthrough event with the resolved clickThrough URL when done.
    */
  def click(): scala.Unit = js.native
  /**
    * Must be called when the player or the window is closed during the ad. Call the closeLinear (in VAST 3.0) and close tracking URLs. Emit a closeLinear or a close event when done.
    */
  def close(): scala.Unit = js.native
  /**
    * Must be called when the user watched the linear creative until its end. Call the complete tracking URLs. Emit a complete events when done.
    */
  def complete(): scala.Unit = js.native
  /**
    * Send a request to the URI provided by the VAST <Error> element. If an [ERRORCODE] macro is included, it will be substitute with code.
    *
    * code – Replaces [ERRORCODE] macro. [ERRORCODE] values are liste in the VAST specification.
    */
  def errorWithCode(code: java.lang.String): scala.Unit = js.native
  /**
    * Report the impression URI. Can only be called once. Will report the following URI:
    *
    * - All <Impression> URI from the <InLine> and <Wrapper> tracking elements.
    * - The creativeView URI from the <Tracking> events
    *
    * Once done, a creativeView event is emitted.
    */
  def load(): scala.Unit = js.native
  /**
    * Remove a listener function for the specified event.
    *
    * eventName – Name of the event.
    * listener – Method to remove. Will remove all listeners for the given event if no specific callback is passed.
    */
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Add a listener function for the specified event.
    *
    * eventName – Name of the event to attach the listener to. See events below for all details.
    * listener – Method to be called when the event is emitted.
    */
  def on(eventName: java.lang.String, listener: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
    * Remove all listener functions for the specified event.
    *
    * eventName – Name of the event.
    */
  def removeAllListeners(eventName: java.lang.String): scala.Unit = js.native
  /**
    * Update the expand state and call the expand/collapse tracking URLs. Emit a expand or collapse event
    *
    * Boolean expanded – Indicate if the video is expanded or no
    */
  def setExpand(expanded: scala.Boolean): scala.Unit = js.native
  /**
    * Update the fullscreen state and call the fullscreen tracking URLs. Emit a fullscreen or exitFullscreen event.
    *
    * fullscreen – Indicate the fullscreen mode.
    */
  def setFullscreen(fullscreen: scala.Boolean): scala.Unit = js.native
  /**
    * Update the mute state and call the mute/unmute tracking URLs. Emit a mute or unmute event.
    *
    * muted – Indicate if the video is muted or not.
    */
  def setMuted(muted: scala.Boolean): scala.Unit = js.native
  /**
    * Update the pause state and call the resume/pause tracking URLs. Emit a resume or pause event.
    *
    * paused – Indicate if the video is paused or not.
    */
  def setPaused(paused: scala.Boolean): scala.Unit = js.native
  /**
    * Update the current time value. This is required for tracking time related events such as start, firstQuartile, midpoint, thirdQuartile or rewind.
    *
    * progess – Current playback time in seconds.
    */
  def setProgress(progress: scala.Double): scala.Unit = js.native
  /**
    * Must be called if you want to overwrite the <Linear> Skipoffset value. This will init the skip countdown duration.
    * Then, every time you call setProgress(), it will decrease the countdown and emit a skip-countdown event with the remaining time.
    * Do not call this method if you want to keep the original Skipoffset value.
    *
    * duration – The time in seconds until the skip button is displayed.
    */
  def setSkipDelay(duration: scala.Double): scala.Unit = js.native
  /**
    * Must be called when the skip button is clicked. Call the skip tracking URLs. Emit a skip event when done.
    */
  def skip(): scala.Unit = js.native
}

