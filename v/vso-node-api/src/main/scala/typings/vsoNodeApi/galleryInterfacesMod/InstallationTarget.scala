package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallationTarget extends js.Object {
  var target: String
  var targetVersion: String
}

object InstallationTarget {
  @scala.inline
  def apply(target: String, targetVersion: String): InstallationTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationTarget]
  }
}

