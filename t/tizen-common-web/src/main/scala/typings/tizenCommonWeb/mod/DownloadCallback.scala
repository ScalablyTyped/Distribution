package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadCallback extends StObject {
  
  /**
    * Called when the download operation is canceled by the _cancel()_ method.
    *
    * @param downloadId The ID of the corresponding download operation.
    */
  def oncanceled(downloadId: Double): Unit
  
  /**
    * Called when the download operation is completed with the final full path or virtual path.
    * If the same file name already exists in the destination, it is changed according to the platform policy and delivered in this callback.
    *
    * @param downloadId The ID of the corresponding download operation.
    * @param path The final full path or virtual path for the downloaded file.
    */
  def oncompleted(downloadId: Double, path: String): Unit
  
  /**
    * Called when the download operation fails.
    *
    * @param downloadId The ID of the corresponding download operation.
    * @param error The reason for download failure.
    */
  def onfailed(downloadId: Double, error: WebAPIError): Unit
  
  /**
    * Called when the download operation is paused by the _pause()_ method.
    *
    * @param downloadId The ID of the corresponding download operation.
    */
  def onpaused(downloadId: Double): Unit
  
  /**
    * Called when a download is successful and it is called multiple times as the download progresses.
    * The interval between the _onprogress()_ callback is platform-dependent. When the download is started, the _receivedSize_ can be 0.
    *
    * @param downloadId The ID of the corresponding download operation.
    * @param receivedSize The size of data received in bytes.
    * @param totalSize The total size of data to receive in bytes.
    */
  def onprogress(downloadId: Double, receivedSize: Double, totalSize: Double): Unit
}
object DownloadCallback {
  
  inline def apply(
    oncanceled: Double => Unit,
    oncompleted: (Double, String) => Unit,
    onfailed: (Double, WebAPIError) => Unit,
    onpaused: Double => Unit,
    onprogress: (Double, Double, Double) => Unit
  ): DownloadCallback = {
    val __obj = js.Dynamic.literal(oncanceled = js.Any.fromFunction1(oncanceled), oncompleted = js.Any.fromFunction2(oncompleted), onfailed = js.Any.fromFunction2(onfailed), onpaused = js.Any.fromFunction1(onpaused), onprogress = js.Any.fromFunction3(onprogress))
    __obj.asInstanceOf[DownloadCallback]
  }
  
  extension [Self <: DownloadCallback](x: Self) {
    
    inline def setOncanceled(value: Double => Unit): Self = StObject.set(x, "oncanceled", js.Any.fromFunction1(value))
    
    inline def setOncompleted(value: (Double, String) => Unit): Self = StObject.set(x, "oncompleted", js.Any.fromFunction2(value))
    
    inline def setOnfailed(value: (Double, WebAPIError) => Unit): Self = StObject.set(x, "onfailed", js.Any.fromFunction2(value))
    
    inline def setOnpaused(value: Double => Unit): Self = StObject.set(x, "onpaused", js.Any.fromFunction1(value))
    
    inline def setOnprogress(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction3(value))
  }
}
