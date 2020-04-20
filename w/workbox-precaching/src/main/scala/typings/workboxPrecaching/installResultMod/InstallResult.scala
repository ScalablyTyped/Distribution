package typings.workboxPrecaching.installResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallResult extends js.Object {
  var notUpdatedURLs: js.Array[String]
  var updatedURLs: js.Array[String]
}

object InstallResult {
  @scala.inline
  def apply(notUpdatedURLs: js.Array[String], updatedURLs: js.Array[String]): InstallResult = {
    val __obj = js.Dynamic.literal(notUpdatedURLs = notUpdatedURLs.asInstanceOf[js.Any], updatedURLs = updatedURLs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallResult]
  }
}

