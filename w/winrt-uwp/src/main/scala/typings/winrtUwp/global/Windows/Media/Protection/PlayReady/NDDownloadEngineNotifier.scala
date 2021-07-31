package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Protection.PlayReady.INDLicenseFetchDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains methods that a download engine plug-in uses to send notifications to a PlayReady-ND client. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDDownloadEngineNotifier")
@js.native
/** Creates a new instance of the NDDownloadEngineNotifier class. */
class NDDownloadEngineNotifier ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.NDDownloadEngineNotifier {
  
  /**
    * Called by the download engine when a content identifier is received.
    * @param licenseFetchDescriptor The license from which the download engine receives the content identifier.
    */
  /* CompleteClass */
  override def onContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor): Unit = js.native
  
  /**
    * Called by the download engine when it receives data.
    * @param dataBytes The byte array that holds the data.
    * @param bytesReceived The number of bytes received from the data stream.
    */
  /* CompleteClass */
  override def onDataReceived(dataBytes: js.Array[Double], bytesReceived: Double): Unit = js.native
  
  /** Called by the download engine when it reaches the end of a PlayReady-ND media stream. */
  /* CompleteClass */
  override def onEndOfStream(): Unit = js.native
  
  /** Called by the download engine if an error occurs during downloading. */
  /* CompleteClass */
  override def onNetworkError(): Unit = js.native
  
  /**
    * Called by the download engine once a PlayReady object is received.
    * @param dataBytes The byte array that holds the PlayReady object.
    */
  /* CompleteClass */
  override def onPlayReadyObjectReceived(dataBytes: js.Array[Double]): Unit = js.native
  
  /** Called by the download engine when a stream is opened. */
  /* CompleteClass */
  override def onStreamOpened(): Unit = js.native
}
