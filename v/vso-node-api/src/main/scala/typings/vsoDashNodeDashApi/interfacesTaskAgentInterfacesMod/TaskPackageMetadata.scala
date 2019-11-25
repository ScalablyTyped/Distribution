package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskPackageMetadata extends js.Object {
  /**
    * Gets the name of the package.
    */
  var `type`: String
  /**
    * Gets the url of the package.
    */
  var url: String
  /**
    * Gets the version of the package.
    */
  var version: String
}

object TaskPackageMetadata {
  @scala.inline
  def apply(`type`: String, url: String, version: String): TaskPackageMetadata = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPackageMetadata]
  }
}

