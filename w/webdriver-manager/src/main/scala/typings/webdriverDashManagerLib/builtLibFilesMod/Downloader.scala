package typings
package webdriverDashManagerLib.builtLibFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/files", "Downloader")
@js.native
class Downloader ()
  extends webdriverDashManagerLib.builtLibFilesDownloaderMod.Downloader

@JSImport("webdriver-manager/built/lib/files", "Downloader")
@js.native
object Downloader extends js.Object {
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
  def getFile(
    binary: webdriverDashManagerLib.builtLibBinariesMod.Binary,
    fileUrl: java.lang.String,
    fileName: java.lang.String,
    outputDir: java.lang.String,
    contentLength: scala.Double
  ): stdLib.Promise[scala.Boolean] = js.native
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
  def getFile(
    binary: webdriverDashManagerLib.builtLibBinariesMod.Binary,
    fileUrl: java.lang.String,
    fileName: java.lang.String,
    outputDir: java.lang.String,
    contentLength: scala.Double,
    callback: js.Function
  ): stdLib.Promise[scala.Boolean] = js.native
}

