package typings.vastDashClient.vastDashClientMod

import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vast-client", "VASTTracker")
@js.native
class VASTTracker protected () extends EventEmitter {
  def this(
    /**
    * An optional instance of VASTClient that can be updated by the tracker.
    */
  client: Null,
    /**
    * The ad of the selected mediaFile to track
    */
  ad: VastAd,
    /**
    * The creative of the selected mediaFile to track
    */
  creative: VastCreativeLinear
  ) = this()
  /**
    * The VAST tracker constructor will process the tracking URLs of the selected ad/creative and returns an instance of VASTTracker.
    */
  def this(
    /**
    * An optional instance of VASTClient that can be updated by the tracker.
    */
  client: VASTClient,
    /**
    * The ad of the selected mediaFile to track
    */
  ad: VastAd,
    /**
    * The creative of the selected mediaFile to track
    */
  creative: VastCreativeLinear
  ) = this()
  def this(
    /**
    * An optional instance of VASTClient that can be updated by the tracker.
    */
  client: Null,
    /**
    * The ad of the selected mediaFile to track
    */
  ad: VastAd,
    /**
    * The creative of the selected mediaFile to track
    */
  creative: VastCreativeLinear,
    /**
    * An optional variation of the creative, for Companion and NonLinear Ads
    */
  variation: VastCreativeCompanion
  ) = this()
  def this(
    /**
    * An optional instance of VASTClient that can be updated by the tracker.
    */
  client: Null,
    /**
    * The ad of the selected mediaFile to track
    */
  ad: VastAd,
    /**
    * The creative of the selected mediaFile to track
    */
  creative: VastCreativeLinear,
    /**
    * An optional variation of the creative, for Companion and NonLinear Ads
    */
  variation: VastCreativeNonLinear
  ) = this()
  def this(
    /**
    * An optional instance of VASTClient that can be updated by the tracker.
    */
  client: VASTClient,
    /**
    * The ad of the selected mediaFile to track
    */
  ad: VastAd,
    /**
    * The creative of the selected mediaFile to track
    */
  creative: VastCreativeLinear,
    /**
    * An optional variation of the creative, for Companion and NonLinear Ads
    */
  variation: VastCreativeCompanion
  ) = this()
  def this(
    /**
    * An optional instance of VASTClient that can be updated by the tracker.
    */
  client: VASTClient,
    /**
    * The ad of the selected mediaFile to track
    */
  ad: VastAd,
    /**
    * The creative of the selected mediaFile to track
    */
  creative: VastCreativeLinear,
    /**
    * An optional variation of the creative, for Companion and NonLinear Ads
    */
  variation: VastCreativeNonLinear
  ) = this()
  /**
    * Must be called when the user clicks on the creative. Call the tracking URLs.
    * Emit a clickthrough event with the resolved clickThrough URL when done.
    */
  def click(): Unit = js.native
  /**
    * Must be called when the player or the window is closed during the ad. Call the closeLinear (in VAST 3.0) and close tracking URLs.
    * Emit a closeLinear or a close event when done.
    */
  def close(): Unit = js.native
  /**
    * Must be called when the user watched the linear creative until its end. Call the complete tracking URLs.
    * Emit a complete events when done.
    */
  def complete(): Unit = js.native
  /**
    * Send a request to the URI provided by the VAST <Error> element. If an [ERRORCODE] macro is included, it will be substitute with code.
    */
  def errorWithCode(
    /**
    * Replaces [ERRORCODE] macro. [ERRORCODE] values are liste in the VAST specification.
    */
  errorCode: String
  ): Unit = js.native
  /**
    * Sets the duration of the ad and updates the quartiles based on that.
    */
  def setDuration(duration: Double): Unit = js.native
  /**
    * Update the expand state and call the expand/collapse tracking URLs. Emit a expand or collapse event
    */
  def setExpand(/**
    * Indicate if the video is expanded or no
    */
  expanded: Boolean): Unit = js.native
  /**
    * Update the fullscreen state and call the fullscreen tracking URLs. Emit a fullscreen or exitFullscreen event.
    */
  def setFullscreen(/**
    * Indicate the fullscreen mode.
    */
  fullscreen: Boolean): Unit = js.native
  /**
    * Update the mute state and call the mute/unmute tracking URLs. Emit a mute or unmute event.
    */
  def setMuted(/**
    * Indicate if the video is muted or not.
    */
  muted: Boolean): Unit = js.native
  /**
    * Update the pause state and call the resume/pause tracking URLs. Emit a resume or pause event.
    */
  def setPaused(/**
    * Indicate if the video is paused or not.
    */
  paused: Boolean): Unit = js.native
  /**
    * Update the current time value.
    * This is required for tracking time related events such as start, firstQuartile, midpoint, thirdQuartile or rewind.
    */
  def setProgress(/**
    * Current playback time in seconds.
    */
  progress: Double): Unit = js.native
  /**
    * Must be called if you want to overwrite the <Linear> Skipoffset value. This will init the skip countdown duration.
    * Then, every time you call setProgress(), it will decrease the countdown and emit a skip-countdown event with the remaining time.
    * Do not call this method if you want to keep the original Skipoffset value.
    */
  def setSkipDelay(/**
    * The time in seconds until the skip button is displayed.
    */
  duration: Double): Unit = js.native
  /**
    * Must be called when the skip button is clicked. Call the skip tracking URLs. Emit a skip event when done.
    */
  def skip(): Unit = js.native
  /**
    * Report the impression URI. Can only be called once. Will report the following URI:
    *
    * - All <Impression> URI from the <InLine> and <Wrapper> tracking elements.
    * - The creativeView URI from the <Tracking> events
    *
    * Once done, a creativeView event is emitted.
    */
  def trackImpression(): Unit = js.native
}

