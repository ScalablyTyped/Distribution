package typings.webdriverManager

import typings.webdriverManager.anon.TypeofBinary
import typings.webdriverManager.binaryMod.BinaryMap
import typings.webdriverManager.downloadedBinaryMod.DownloadedBinary
import typings.webdriverManager.mod.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileManagerMod {
  
  @JSImport("webdriver-manager/built/lib/files/file_manager", "FileManager")
  @js.native
  class FileManager () extends StObject
  /* static members */
  object FileManager {
    
    @JSImport("webdriver-manager/built/lib/files/file_manager", "FileManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * For the operating system, check against the list of operating systems that the
      * binary is available for.
      * @param osType The operating system.
      * @param binary The class type to have access to the static properties.
      * @returns If the binary is available for the operating system.
      */
    @scala.inline
    def checkOS_(osType: String, binary: TypeofBinary): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkOS_")(osType.asInstanceOf[js.Any], binary.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * For the operating system, create a list that includes the binaries
      * for selenium standalone, chrome, and internet explorer.
      * @param osType The operating system.
      * @param alternateCDN URL of the alternative CDN to be used instead of the default ones.
      * @returns A binary map that are available for the operating system.
      */
    @scala.inline
    def compileBinaries_(osType: String): BinaryMap[Binary] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileBinaries_")(osType.asInstanceOf[js.Any]).asInstanceOf[BinaryMap[Binary]]
    @scala.inline
    def compileBinaries_(osType: String, alternateCDN: String): BinaryMap[Binary] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileBinaries_")(osType.asInstanceOf[js.Any], alternateCDN.asInstanceOf[js.Any])).asInstanceOf[BinaryMap[Binary]]
    
    /**
      * Try to download the binary version.
      * @param binary The binary of interest.
      * @param outputDir The directory where files are downloaded and stored.
      * @returns Promise resolved to true for files downloaded, resolved to false for files not
      *          downloaded because they exist, rejected if there is an error.
      */
    @scala.inline
    def downloadFile[T /* <: Binary */](binary: T, outputDir: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(binary.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def downloadFile[T /* <: Binary */](binary: T, outputDir: String, callback: js.Function): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(binary.asInstanceOf[js.Any], outputDir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Finds all the downloaded binary versions stored in the output directory.
      * @param outputDir The directory where files are downloaded and stored.
      * @returns An dictionary map of all the downloaded binaries found in the output folder.
      */
    @scala.inline
    def downloadedBinaries(outputDir: String): BinaryMap[DownloadedBinary] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadedBinaries")(outputDir.asInstanceOf[js.Any]).asInstanceOf[BinaryMap[DownloadedBinary]]
    
    /**
      * For the binary, operating system, and system architecture, look through
      * the existing files and the downloaded binary
      * @param binary The binary of interest
      * @param osType The operating system.
      * @param existingFiles A list of existing files.
      * @returns The downloaded binary with all the versions found.
      */
    @scala.inline
    def downloadedVersions_[T /* <: Binary */](binary: T, osType: String, arch: String, existingFiles: js.Array[String]): DownloadedBinary = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadedVersions_")(binary.asInstanceOf[js.Any], osType.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], existingFiles.asInstanceOf[js.Any])).asInstanceOf[DownloadedBinary]
    
    /**
      * Get the list of existing files from the output directory
      * @param outputDir The directory where binaries are saved
      * @returns A list of existing files.
      */
    @scala.inline
    def getExistingFiles(outputDir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExistingFiles")(outputDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Create a directory if it does not exist.
      * @param outputDir The directory to create.
      */
    @scala.inline
    def makeOutputDirectory(outputDir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOutputDirectory")(outputDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Removes the existing files found in the output directory that match the
      * binary prefix names.
      * @param outputDir The directory where files are downloaded and stored.
      */
    @scala.inline
    def removeExistingFiles(outputDir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExistingFiles")(outputDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Look up the operating system and compile a list of binaries that are available
      * for the system.
      * @param alternateCDN URL of the alternative CDN to be used instead of the default ones.
      * @returns A binary map that is available for the operating system.
      */
    @scala.inline
    def setupBinaries(): BinaryMap[Binary] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupBinaries")().asInstanceOf[BinaryMap[Binary]]
    @scala.inline
    def setupBinaries(alternateCDN: String): BinaryMap[Binary] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupBinaries")(alternateCDN.asInstanceOf[js.Any]).asInstanceOf[BinaryMap[Binary]]
  }
}
