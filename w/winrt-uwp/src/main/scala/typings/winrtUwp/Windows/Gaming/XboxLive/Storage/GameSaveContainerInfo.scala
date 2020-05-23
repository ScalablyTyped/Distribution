package typings.winrtUwp.Windows.Gaming.XboxLive.Storage

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait GameSaveContainerInfo extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var displayName: String
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var lastModifiedTime: Date
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var name: String
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var needsSync: Boolean
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var totalSize: Double
}

object GameSaveContainerInfo {
  @scala.inline
  def apply(displayName: String, lastModifiedTime: Date, name: String, needsSync: Boolean, totalSize: Double): GameSaveContainerInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsSync = needsSync.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveContainerInfo]
  }
}

