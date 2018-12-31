package typings
package webdriverDashManagerLib.builtLibBinariesBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/binaries/binary", "Binary")
@js.native
abstract class Binary () extends js.Object {
  def this(opt_alternativeCdn: java.lang.String) = this()
  var alternativeDownloadUrl: java.lang.String = js.native
  var cdn: java.lang.String = js.native
  var configSource: webdriverDashManagerLib.builtLibBinariesConfigUnderscoreSourceMod.ConfigSource = js.native
  var name: java.lang.String = js.native
  var osarch: java.lang.String = js.native
  var ostype: java.lang.String = js.native
  var versionCustom: java.lang.String = js.native
  var versionDefault: java.lang.String = js.native
  /**
    * @param ostype The operating system.
    * @returns The file name for the executable.
    */
  def executableFilename(): java.lang.String = js.native
  def executableSuffix(): java.lang.String = js.native
  def filename(): java.lang.String = js.native
  /**
    * Gets the url to download the file set by the version. This will use the XML if available.
    * If not, it will download from an existing url.
    *
    * @param {string} version The version we are looking for. This could also be 'latest'.
    */
  def getUrl(): js.Promise[BinaryUrl] = js.native
  def getUrl(version: java.lang.String): js.Promise[BinaryUrl] = js.native
  /**
    * Gets the list of available versions available based on the xml. If no XML exists, return an
    * empty list.
    */
  def getVersionList(): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Gets the id of the binary.
    */
  def id(): java.lang.String = js.native
  def prefix(): java.lang.String = js.native
  /**
    * Delete an instance of this binary from the file system
    */
  def remove(filename: java.lang.String): scala.Unit = js.native
  def suffix(): java.lang.String = js.native
  def version(): java.lang.String = js.native
  /**
    * @param ostype The operating system.
    * @returns The file name for the file inside the downloaded zip file
    */
  def zipContentName(): java.lang.String = js.native
}

@JSImport("webdriver-manager/built/lib/binaries/binary", "Binary")
@js.native
object Binary extends js.Object {
  var os: js.Array[webdriverDashManagerLib.builtLibBinariesBinaryMod.OS] = js.native
}

