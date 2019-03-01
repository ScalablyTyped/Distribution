package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the PlayReady-ND download engine used to stream protected media content from a transmitter. */
trait INDDownloadEngine extends js.Object {
  /** Gets the maximum threshold of the sample buffer. */
  var bufferFullMaxThresholdInSamples: scala.Double
  /** Gets the minimum number of samples a sample buffer can hold before a download engine resumes downloading. */
  var bufferFullMinThresholdInSamples: scala.Double
  /** Gets whether the download engine supports seeking. */
  var canSeek: scala.Boolean
  /** Gets the download engine notifier that will provide notification of download stream events from the transmitter. */
  var notifier: NDDownloadEngineNotifier
  /** Notifies the download engine to stop downloading and disconnect from the remote server. */
  def close(): scala.Unit
  /**
    * Notifies the download engine to open the content specified by a URL.
    * @param uri The URI from which the download engine gets content.
    * @param sessionIDBytes The session identifier used to identify the session. The session identifier must be 16 bytes.
    */
  def open(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, sessionIDBytes: js.Array[scala.Double]): scala.Unit
  /** Notifies the download engine to pause downloading. */
  def pause(): scala.Unit
  /** Notifies the download engine to resume a paused download. */
  def resume(): scala.Unit
  /**
    * Notifies the download engine to go to a specified time position in the media stream.
    * @param startPosition The position within the media stream to which to seek.
    */
  def seek(startPosition: scala.Double): scala.Unit
}

object INDDownloadEngine {
  @scala.inline
  def apply(
    bufferFullMaxThresholdInSamples: scala.Double,
    bufferFullMinThresholdInSamples: scala.Double,
    canSeek: scala.Boolean,
    close: js.Function0[scala.Unit],
    notifier: NDDownloadEngineNotifier,
    open: js.Function2[winrtDashUwpLib.WindowsNs.FoundationNs.Uri, js.Array[scala.Double], scala.Unit],
    pause: js.Function0[scala.Unit],
    resume: js.Function0[scala.Unit],
    seek: js.Function1[scala.Double, scala.Unit]
  ): INDDownloadEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bufferFullMaxThresholdInSamples")(bufferFullMaxThresholdInSamples)
    __obj.updateDynamic("bufferFullMinThresholdInSamples")(bufferFullMinThresholdInSamples)
    __obj.updateDynamic("canSeek")(canSeek)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("notifier")(notifier)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("resume")(resume)
    __obj.updateDynamic("seek")(seek)
    __obj.asInstanceOf[INDDownloadEngine]
  }
}

