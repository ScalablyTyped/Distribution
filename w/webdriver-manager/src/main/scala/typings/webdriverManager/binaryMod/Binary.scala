package typings.webdriverManager.binaryMod

import typings.webdriverManager.configSourceMod.ConfigSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/binaries/binary", "Binary")
@js.native
abstract class Binary () extends js.Object {
  def this(opt_alternativeCdn: String) = this()
  
  var alternativeDownloadUrl: String = js.native
  
  var cdn: String = js.native
  
  var configSource: ConfigSource = js.native
  
  /**
    * @param ostype The operating system.
    * @returns The file name for the executable.
    */
  def executableFilename(): String = js.native
  
  def executableSuffix(): String = js.native
  
  def filename(): String = js.native
  
  /**
    * Gets the url to download the file set by the version. This will use the XML if available.
    * If not, it will download from an existing url.
    *
    * @param {string} version The version we are looking for. This could also be 'latest'.
    */
  def getUrl(): js.Promise[BinaryUrl] = js.native
  def getUrl(version: String): js.Promise[BinaryUrl] = js.native
  
  /**
    * Gets the list of available versions available based on the xml. If no XML exists, return an
    * empty list.
    */
  def getVersionList(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Gets the id of the binary.
    */
  def id(): String = js.native
  
  var name: String = js.native
  
  var osarch: String = js.native
  
  var ostype: String = js.native
  
  def prefix(): String = js.native
  
  /**
    * Delete an instance of this binary from the file system
    */
  def remove(filename: String): Unit = js.native
  
  def suffix(): String = js.native
  
  def version(): String = js.native
  
  var versionCustom: String = js.native
  
  var versionDefault: String = js.native
  
  /**
    * @param ostype The operating system.
    * @returns The file name for the file inside the downloaded zip file
    */
  def zipContentName(): String = js.native
}
/* static members */
@JSImport("webdriver-manager/built/lib/binaries/binary", "Binary")
@js.native
object Binary extends js.Object {
  
  var os: js.Array[OS] = js.native
}
