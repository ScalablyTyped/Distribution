package typings.webdriverManager

import typings.webdriverManager.anon.TypeofBinary
import typings.webdriverManager.binaryMod.BinaryMap
import typings.webdriverManager.mod.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesMod {
  
  @JSImport("webdriver-manager/built/lib/files", "DownloadedBinary")
  @js.native
  open class DownloadedBinary protected ()
    extends typings.webdriverManager.downloadedBinaryMod.DownloadedBinary {
    def this(binary: Binary) = this()
  }
  
  @JSImport("webdriver-manager/built/lib/files", "Downloader")
  @js.native
  open class Downloader ()
    extends typings.webdriverManager.downloaderMod.Downloader
  /* static members */
  object Downloader {
    
    @JSImport("webdriver-manager/built/lib/files", "Downloader")
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
    inline def getFile(binary: Binary, fileUrl: String, fileName: String, outputDir: String, contentLength: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFile")(binary.asInstanceOf[js.Any], fileUrl.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any], contentLength.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def getFile(
      binary: Binary,
      fileUrl: String,
      fileName: String,
      outputDir: String,
      contentLength: Double,
      callback: js.Function
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFile")(binary.asInstanceOf[js.Any], fileUrl.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any], contentLength.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  }
  
  @JSImport("webdriver-manager/built/lib/files", "FileManager")
  @js.native
  open class FileManager ()
    extends typings.webdriverManager.fileManagerMod.FileManager
  /* static members */
  object FileManager {
    
    @JSImport("webdriver-manager/built/lib/files", "FileManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * For the operating system, check against the list of operating systems that the
      * binary is available for.
      * @param osType The operating system.
      * @param binary The class type to have access to the static properties.
      * @returns If the binary is available for the operating system.
      */
    inline def checkOS_(osType: String, binary: TypeofBinary): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkOS_")(osType.asInstanceOf[js.Any], binary.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * For the operating system, create a list that includes the binaries
      * for selenium standalone, chrome, and internet explorer.
      * @param osType The operating system.
      * @param alternateCDN URL of the alternative CDN to be used instead of the default ones.
      * @returns A binary map that are available for the operating system.
      */
    inline def compileBinaries_(osType: String): BinaryMap[Binary] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileBinaries_")(osType.asInstanceOf[js.Any]).asInstanceOf[BinaryMap[Binary]]
    inline def compileBinaries_(osType: String, alternateCDN: String): BinaryMap[Binary] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileBinaries_")(osType.asInstanceOf[js.Any], alternateCDN.asInstanceOf[js.Any])).asInstanceOf[BinaryMap[Binary]]
    
    /**
      * Try to download the binary version.
      * @param binary The binary of interest.
      * @param outputDir The directory where files are downloaded and stored.
      * @returns Promise resolved to true for files downloaded, resolved to false for files not
      *          downloaded because they exist, rejected if there is an error.
      */
    inline def downloadFile[T /* <: Binary */](binary: T, outputDir: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(binary.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def downloadFile[T /* <: Binary */](binary: T, outputDir: String, callback: js.Function): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(binary.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Finds all the downloaded binary versions stored in the output directory.
      * @param outputDir The directory where files are downloaded and stored.
      * @returns An dictionary map of all the downloaded binaries found in the output folder.
      */
    inline def downloadedBinaries(outputDir: String): BinaryMap[typings.webdriverManager.downloadedBinaryMod.DownloadedBinary] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadedBinaries")(outputDir.asInstanceOf[js.Any]).asInstanceOf[BinaryMap[typings.webdriverManager.downloadedBinaryMod.DownloadedBinary]]
    
    /**
      * For the binary, operating system, and system architecture, look through
      * the existing files and the downloaded binary
      * @param binary The binary of interest
      * @param osType The operating system.
      * @param existingFiles A list of existing files.
      * @returns The downloaded binary with all the versions found.
      */
    inline def downloadedVersions_[T /* <: Binary */](binary: T, osType: String, arch: String, existingFiles: js.Array[String]): typings.webdriverManager.downloadedBinaryMod.DownloadedBinary = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadedVersions_")(binary.asInstanceOf[js.Any], osType.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], existingFiles.asInstanceOf[js.Any])).asInstanceOf[typings.webdriverManager.downloadedBinaryMod.DownloadedBinary]
    
    /**
      * Get the list of existing files from the output directory
      * @param outputDir The directory where binaries are saved
      * @returns A list of existing files.
      */
    inline def getExistingFiles(outputDir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExistingFiles")(outputDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Create a directory if it does not exist.
      * @param outputDir The directory to create.
      */
    inline def makeOutputDirectory(outputDir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOutputDirectory")(outputDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Removes the existing files found in the output directory that match the
      * binary prefix names.
      * @param outputDir The directory where files are downloaded and stored.
      */
    inline def removeExistingFiles(outputDir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExistingFiles")(outputDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Look up the operating system and compile a list of binaries that are available
      * for the system.
      * @param alternateCDN URL of the alternative CDN to be used instead of the default ones.
      * @returns A binary map that is available for the operating system.
      */
    inline def setupBinaries(): BinaryMap[Binary] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupBinaries")().asInstanceOf[BinaryMap[Binary]]
    inline def setupBinaries(alternateCDN: String): BinaryMap[Binary] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupBinaries")(alternateCDN.asInstanceOf[js.Any]).asInstanceOf[BinaryMap[Binary]]
  }
}
