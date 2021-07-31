package typings.webdriverManager

import typings.webdriverManager.mod.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloaderMod {
  
  @JSImport("webdriver-manager/built/lib/files/downloader", "Downloader")
  @js.native
  class Downloader () extends StObject
  /* static members */
  object Downloader {
    
    @JSImport("webdriver-manager/built/lib/files/downloader", "Downloader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Http get the file. Check the content length of the file before writing the file.
      * If the content length does not match, remove it and download the file.
      *
      * @param binary The binary of interest.
      * @param fileName The file name.
      * @param outputDir The directory where files are downloaded and stored.
      * @param contentLength The content length of the existing file.
      * @param opt_proxy The proxy for downloading files.
      * @param opt_callback Callback method to be executed after the file is downloaded.
      * @returns Promise<boolean> Resolves true = downloaded. Resolves false = not downloaded.
      *          Rejected with an error.
      */
    @scala.inline
    def getFile(binary: Binary, fileUrl: String, fileName: String, outputDir: String, contentLength: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFile")(binary.asInstanceOf[js.Any], fileUrl.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any], contentLength.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def getFile(
      binary: Binary,
      fileUrl: String,
      fileName: String,
      outputDir: String,
      contentLength: Double,
      callback: js.Function
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFile")(binary.asInstanceOf[js.Any], fileUrl.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any], contentLength.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  }
}
