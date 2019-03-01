package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallationTarget extends js.Object {
  var target: java.lang.String
  var targetVersion: java.lang.String
}

object InstallationTarget {
  @scala.inline
  def apply(target: java.lang.String, targetVersion: java.lang.String): InstallationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("targetVersion")(targetVersion)
    __obj.asInstanceOf[InstallationTarget]
  }
}

