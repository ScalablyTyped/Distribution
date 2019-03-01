package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageMetadata extends js.Object {
  /**
    * The date the package was created
    */
  var createdOn: stdLib.Date
  /**
    * A direct link to download the package.
    */
  var downloadUrl: java.lang.String
  /**
    * The UI uses this to display instructions, i.e. "unzip MyAgent.zip"
    */
  var filename: java.lang.String
  /**
    * MD5 hash as a base64 string
    */
  var hashValue: java.lang.String
  /**
    * A link to documentation
    */
  var infoUrl: java.lang.String
  /**
    * The platform (win7, linux, etc.)
    */
  var platform: java.lang.String
  /**
    * The type of package (e.g. "agent")
    */
  var `type`: java.lang.String
  /**
    * The package version.
    */
  var version: PackageVersion
}

object PackageMetadata {
  @scala.inline
  def apply(
    createdOn: stdLib.Date,
    downloadUrl: java.lang.String,
    filename: java.lang.String,
    hashValue: java.lang.String,
    infoUrl: java.lang.String,
    platform: java.lang.String,
    `type`: java.lang.String,
    version: PackageVersion
  ): PackageMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("createdOn")(createdOn)
    __obj.updateDynamic("downloadUrl")(downloadUrl)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("hashValue")(hashValue)
    __obj.updateDynamic("infoUrl")(infoUrl)
    __obj.updateDynamic("platform")(platform)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PackageMetadata]
  }
}

