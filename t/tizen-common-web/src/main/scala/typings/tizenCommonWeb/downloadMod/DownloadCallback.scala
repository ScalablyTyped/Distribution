package typings.tizenCommonWeb.downloadMod

import typings.tizenCommonWeb.tizenMod.WebAPIError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadCallback extends js.Object {
  
  /**
    * Called when the download operation is canceled by the `cancel()` method.
    *
    *
    * @param downloadId The ID of the corresponding download operation.
    */
  var oncanceled: js.UndefOr[js.Function1[/* downloadId */ Double, Unit]] = js.native
  
  /**
    * Called when the download operation is completed with the final full path or virtual path.
    * If the same file name already exists in the destination, it is changed according to the platform policy and delivered in this callback.
    *
    *
    * @param downloadId The ID of the corresponding download operation.
    * @param path The final full path or virtual path for the downloaded file.
    */
  var oncompleted: js.UndefOr[js.Function2[/* downloadId */ Double, /* path */ String, Unit]] = js.native
  
  /**
    * Called when the download operation fails.
    *
    *
    * @param downloadId The ID of the corresponding download operation.
    * @param error The reason for download failure.
    */
  var onfailed: js.UndefOr[js.Function2[/* downloadId */ Double, /* error */ WebAPIError, Unit]] = js.native
  
  /**
    * Called when the download operation is paused by the `pause()` method.
    *
    *
    * @param downloadId The ID of the corresponding download operation.
    */
  var onpaused: js.UndefOr[js.Function1[/* downloadId */ Double, Unit]] = js.native
  
  /**
    * Called when a download is successful and it is called multiple times as the download progresses.
    * The interval between the `onprogress()` callback is platform-dependent. When the download is started, the `receivedSize` can be ***0***.
    *
    *
    * @param downloadId The ID of the corresponding download operation.
    * @param receivedSize The size of data received in bytes.
    * @param totalSize The total size of data to receive in bytes.
    */
  var onprogress: js.UndefOr[
    js.Function3[/* downloadId */ Double, /* receivedSize */ Double, /* totalSize */ Double, Unit]
  ] = js.native
}
object DownloadCallback {
  
  @scala.inline
  def apply(): DownloadCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadCallback]
  }
  
  @scala.inline
  implicit class DownloadCallbackOps[Self <: DownloadCallback] (val x: Self) extends AnyVal {
    
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
    def setOncanceled(value: /* downloadId */ Double => Unit): Self = this.set("oncanceled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOncanceled: Self = this.set("oncanceled", js.undefined)
    
    @scala.inline
    def setOncompleted(value: (/* downloadId */ Double, /* path */ String) => Unit): Self = this.set("oncompleted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOncompleted: Self = this.set("oncompleted", js.undefined)
    
    @scala.inline
    def setOnfailed(value: (/* downloadId */ Double, /* error */ WebAPIError) => Unit): Self = this.set("onfailed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnfailed: Self = this.set("onfailed", js.undefined)
    
    @scala.inline
    def setOnpaused(value: /* downloadId */ Double => Unit): Self = this.set("onpaused", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnpaused: Self = this.set("onpaused", js.undefined)
    
    @scala.inline
    def setOnprogress(value: (/* downloadId */ Double, /* receivedSize */ Double, /* totalSize */ Double) => Unit): Self = this.set("onprogress", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
  }
}
