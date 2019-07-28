package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageMetadata extends js.Object {
  /**
    * The date the package was created
    */
  var createdOn: Date
  /**
    * A direct link to download the package.
    */
  var downloadUrl: String
  /**
    * The UI uses this to display instructions, i.e. "unzip MyAgent.zip"
    */
  var filename: String
  /**
    * MD5 hash as a base64 string
    */
  var hashValue: String
  /**
    * A link to documentation
    */
  var infoUrl: String
  /**
    * The platform (win7, linux, etc.)
    */
  var platform: String
  /**
    * The type of package (e.g. "agent")
    */
  var `type`: String
  /**
    * The package version.
    */
  var version: PackageVersion
}

object PackageMetadata {
  @scala.inline
  def apply(
    createdOn: Date,
    downloadUrl: String,
    filename: String,
    hashValue: String,
    infoUrl: String,
    platform: String,
    `type`: String,
    version: PackageVersion
  ): PackageMetadata = {
    val __obj = js.Dynamic.literal(createdOn = createdOn, downloadUrl = downloadUrl, filename = filename, hashValue = hashValue, infoUrl = infoUrl, platform = platform, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PackageMetadata]
  }
}

