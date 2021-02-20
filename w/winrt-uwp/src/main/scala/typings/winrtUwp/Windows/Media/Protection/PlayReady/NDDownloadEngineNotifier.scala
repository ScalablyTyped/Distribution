package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains methods that a download engine plug-in uses to send notifications to a PlayReady-ND client. */
@js.native
trait NDDownloadEngineNotifier extends StObject {
  
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
object NDDownloadEngineNotifier {
  
  @scala.inline
  def apply(
    onContentIDReceived: INDLicenseFetchDescriptor => Unit,
    onDataReceived: (js.Array[Double], Double) => Unit,
    onEndOfStream: () => Unit,
    onNetworkError: () => Unit,
    onPlayReadyObjectReceived: js.Array[Double] => Unit,
    onStreamOpened: () => Unit
  ): NDDownloadEngineNotifier = {
    val __obj = js.Dynamic.literal(onContentIDReceived = js.Any.fromFunction1(onContentIDReceived), onDataReceived = js.Any.fromFunction2(onDataReceived), onEndOfStream = js.Any.fromFunction0(onEndOfStream), onNetworkError = js.Any.fromFunction0(onNetworkError), onPlayReadyObjectReceived = js.Any.fromFunction1(onPlayReadyObjectReceived), onStreamOpened = js.Any.fromFunction0(onStreamOpened))
    __obj.asInstanceOf[NDDownloadEngineNotifier]
  }
  
  @scala.inline
  implicit class NDDownloadEngineNotifierMutableBuilder[Self <: NDDownloadEngineNotifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnContentIDReceived(value: INDLicenseFetchDescriptor => Unit): Self = StObject.set(x, "onContentIDReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDataReceived(value: (js.Array[Double], Double) => Unit): Self = StObject.set(x, "onDataReceived", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnEndOfStream(value: () => Unit): Self = StObject.set(x, "onEndOfStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNetworkError(value: () => Unit): Self = StObject.set(x, "onNetworkError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPlayReadyObjectReceived(value: js.Array[Double] => Unit): Self = StObject.set(x, "onPlayReadyObjectReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStreamOpened(value: () => Unit): Self = StObject.set(x, "onStreamOpened", js.Any.fromFunction0(value))
  }
}
