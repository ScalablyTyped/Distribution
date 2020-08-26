package typings.winrtUwp.Windows.Gaming.XboxLive.Storage

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait GameSaveContainerInfo extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var displayName: String = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var lastModifiedTime: Date = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var name: String = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var needsSync: Boolean = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var totalSize: Double = js.native
}

object GameSaveContainerInfo {
  @scala.inline
  def apply(displayName: String, lastModifiedTime: Date, name: String, needsSync: Boolean, totalSize: Double): GameSaveContainerInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsSync = needsSync.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveContainerInfo]
  }
  @scala.inline
  implicit class GameSaveContainerInfoOps[Self <: GameSaveContainerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedTime(value: Date): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedsSync(value: Boolean): Self = this.set("needsSync", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
  }
  
}

