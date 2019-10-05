package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains methods that a download engine plug-in uses to send notifications to a PlayReady-ND client. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDDownloadEngineNotifier")
@js.native
/** Creates a new instance of the NDDownloadEngineNotifier class. */
class NDDownloadEngineNotifier () extends js.Object {
  /**
    * Called by the download engine when a content identifier is received.
    * @param licenseFetchDescriptor The license from which the download engine receives the content identifier.
    */
  def onContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor): Unit = js.native
  /**
    * Called by the download engine when it receives data.
    * @param dataBytes The byte array that holds the data.
    * @param bytesReceived The number of bytes received from the data stream.
    */
  def onDataReceived(dataBytes: js.Array[Double], bytesReceived: Double): Unit = js.native
  /** Called by the download engine when it reaches the end of a PlayReady-ND media stream. */
  def onEndOfStream(): Unit = js.native
  /** Called by the download engine if an error occurs during downloading. */
  def onNetworkError(): Unit = js.native
  /**
    * Called by the download engine once a PlayReady object is received.
    * @param dataBytes The byte array that holds the PlayReady object.
    */
  def onPlayReadyObjectReceived(dataBytes: js.Array[Double]): Unit = js.native
  /** Called by the download engine when a stream is opened. */
  def onStreamOpened(): Unit = js.native
}

