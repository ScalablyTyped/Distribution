package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the PlayReady-ND download engine used to stream protected media content from a transmitter. */
@js.native
trait INDDownloadEngine extends js.Object {
  /** Gets the maximum threshold of the sample buffer. */
  var bufferFullMaxThresholdInSamples: Double = js.native
  /** Gets the minimum number of samples a sample buffer can hold before a download engine resumes downloading. */
  var bufferFullMinThresholdInSamples: Double = js.native
  /** Gets whether the download engine supports seeking. */
  var canSeek: Boolean = js.native
  /** Gets the download engine notifier that will provide notification of download stream events from the transmitter. */
  var notifier: NDDownloadEngineNotifier = js.native
  /** Notifies the download engine to stop downloading and disconnect from the remote server. */
  def close(): Unit = js.native
  /**
    * Notifies the download engine to open the content specified by a URL.
    * @param uri The URI from which the download engine gets content.
    * @param sessionIDBytes The session identifier used to identify the session. The session identifier must be 16 bytes.
    */
  def open(uri: Uri, sessionIDBytes: js.Array[Double]): Unit = js.native
  /** Notifies the download engine to pause downloading. */
  def pause(): Unit = js.native
  /** Notifies the download engine to resume a paused download. */
  def resume(): Unit = js.native
  /**
    * Notifies the download engine to go to a specified time position in the media stream.
    * @param startPosition The position within the media stream to which to seek.
    */
  def seek(startPosition: Double): Unit = js.native
}

object INDDownloadEngine {
  @scala.inline
  def apply(
    bufferFullMaxThresholdInSamples: Double,
    bufferFullMinThresholdInSamples: Double,
    canSeek: Boolean,
    close: () => Unit,
    notifier: NDDownloadEngineNotifier,
    open: (Uri, js.Array[Double]) => Unit,
    pause: () => Unit,
    resume: () => Unit,
    seek: Double => Unit
  ): INDDownloadEngine = {
    val __obj = js.Dynamic.literal(bufferFullMaxThresholdInSamples = bufferFullMaxThresholdInSamples.asInstanceOf[js.Any], bufferFullMinThresholdInSamples = bufferFullMinThresholdInSamples.asInstanceOf[js.Any], canSeek = canSeek.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), notifier = notifier.asInstanceOf[js.Any], open = js.Any.fromFunction2(open), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[INDDownloadEngine]
  }
  @scala.inline
  implicit class INDDownloadEngineOps[Self <: INDDownloadEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBufferFullMaxThresholdInSamples(value: Double): Self = this.set("bufferFullMaxThresholdInSamples", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferFullMinThresholdInSamples(value: Double): Self = this.set("bufferFullMinThresholdInSamples", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanSeek(value: Boolean): Self = this.set("canSeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifier(value: NDDownloadEngineNotifier): Self = this.set("notifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: (Uri, js.Array[Double]) => Unit): Self = this.set("open", js.Any.fromFunction2(value))
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
  }
  
}

