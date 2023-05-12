package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.downloads.DownloadItem
import typings.thunderbirdWebextBrowser.messenger.downloads.DownloadOptions
import typings.thunderbirdWebextBrowser.messenger.downloads.DownloadQuery
import typings.thunderbirdWebextBrowser.messenger.downloads.GetFileIconOptions
import typings.thunderbirdWebextBrowser.messenger.downloads.OnChangedDownloadDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloads {
  
  @JSGlobal("messenger.downloads")
  @js.native
  val ^ : js.Any = js.native
  
  inline def acceptDanger(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptDanger")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def cancel(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def download(options: DownloadOptions): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  inline def drag(downloadId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drag")(downloadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def erase(query: DownloadQuery): js.Promise[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Double]]]
  
  inline def getFileIcon(downloadId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileIcon")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getFileIcon(downloadId: Double, options: GetFileIconOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileIcon")(downloadId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSGlobal("messenger.downloads.onChanged")
  @js.native
  val onChanged: WebExtEvent[js.Function1[/* downloadDelta */ OnChangedDownloadDelta, Unit]] = js.native
  
  @JSGlobal("messenger.downloads.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* downloadItem */ DownloadItem, Unit]] = js.native
  
  @JSGlobal("messenger.downloads.onErased")
  @js.native
  val onErased: WebExtEvent[js.Function1[/* downloadId */ Double, Unit]] = js.native
  
  inline def open(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def pause(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def removeFile(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def resume(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def search(query: DownloadQuery): js.Promise[js.Array[DownloadItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DownloadItem]]]
  
  inline def setShelfEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShelfEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def show(downloadId: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def showDefaultFolder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showDefaultFolder")().asInstanceOf[Unit]
}
