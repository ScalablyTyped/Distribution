package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskPackageMetadata extends js.Object {
  /**
    * Gets the name of the package.
    */
  var `type`: java.lang.String
  /**
    * Gets the url of the package.
    */
  var url: java.lang.String
  /**
    * Gets the version of the package.
    */
  var version: java.lang.String
}

object TaskPackageMetadata {
  @scala.inline
  def apply(`type`: java.lang.String, url: java.lang.String, version: java.lang.String): TaskPackageMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TaskPackageMetadata]
  }
}

