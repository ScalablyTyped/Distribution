package typings.webdriverManager

import typings.webdriverManager.anon.TypeofBinary
import typings.webdriverManager.binaryMod.BinaryMap
import typings.webdriverManager.downloadedBinaryMod.DownloadedBinary
import typings.webdriverManager.mod.Binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/files/file_manager", JSImport.Namespace)
@js.native
object fileManagerMod extends js.Object {
  
  @js.native
  class FileManager () extends js.Object
  /* static members */
  @js.native
  object FileManager extends js.Object {
    
    /**
      * For the operating system, check against the list of operating systems that the
      * binary is available for.
      * @param osType The operating system.
      * @param binary The class type to have access to the static properties.
      * @returns If the binary is available for the operating system.
      */
    def checkOS_(osType: String, binary: TypeofBinary): Boolean = js.native
    
    /**
      * For the operating system, create a list that includes the binaries
      * for selenium standalone, chrome, and internet explorer.
      * @param osType The operating system.
      * @param alternateCDN URL of the alternative CDN to be used instead of the default ones.
      * @returns A binary map that are available for the operating system.
      */
    def compileBinaries_(osType: String): BinaryMap[Binary] = js.native
    def compileBinaries_(osType: String, alternateCDN: String): BinaryMap[Binary] = js.native
    
    /**
      * Try to download the binary version.
      * @param binary The binary of interest.
      * @param outputDir The directory where files are downloaded and stored.
      * @returns Promise resolved to true for files downloaded, resolved to false for files not
      *          downloaded because they exist, rejected if there is an error.
      */
    def downloadFile[T /* <: Binary */](binary: T, outputDir: String): js.Promise[Boolean] = js.native
    def downloadFile[T /* <: Binary */](binary: T, outputDir: String, callback: js.Function): js.Promise[Boolean] = js.native
    
    /**
      * Finds all the downloaded binary versions stored in the output directory.
      * @param outputDir The directory where files are downloaded and stored.
      * @returns An dictionary map of all the downloaded binaries found in the output folder.
      */
    def downloadedBinaries(outputDir: String): BinaryMap[DownloadedBinary] = js.native
    
    /**
      * For the binary, operating system, and system architecture, look through
      * the existing files and the downloaded binary
      * @param binary The binary of interest
      * @param osType The operating system.
      * @param existingFiles A list of existing files.
      * @returns The downloaded binary with all the versions found.
      */
    def downloadedVersions_[T /* <: Binary */](binary: T, osType: String, arch: String, existingFiles: js.Array[String]): DownloadedBinary = js.native
    
    /**
      * Get the list of existing files from the output directory
      * @param outputDir The directory where binaries are saved
      * @returns A list of existing files.
      */
    def getExistingFiles(outputDir: String): js.Array[String] = js.native
    
    /**
      * Create a directory if it does not exist.
      * @param outputDir The directory to create.
      */
    def makeOutputDirectory(outputDir: String): Unit = js.native
    
    /**
      * Removes the existing files found in the output directory that match the
      * binary prefix names.
      * @param outputDir The directory where files are downloaded and stored.
      */
    def removeExistingFiles(outputDir: String): Unit = js.native
    
    /**
      * Look up the operating system and compile a list of binaries that are available
      * for the system.
      * @param alternateCDN URL of the alternative CDN to be used instead of the default ones.
      * @returns A binary map that is available for the operating system.
      */
    def setupBinaries(): BinaryMap[Binary] = js.native
    def setupBinaries(alternateCDN: String): BinaryMap[Binary] = js.native
  }
}
