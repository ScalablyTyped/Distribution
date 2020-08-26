package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCreate extends ResponseEntry {
  /** only exists when a password has been set otherwise it will be undefined */
  var salt: js.UndefOr[String] = js.native
  var snapshot: String = js.native
  var version: Double = js.native
}

object SnapshotCreate {
  @scala.inline
  def apply(snapshot: String, version: Double): SnapshotCreate = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreate]
  }
  @scala.inline
  implicit class SnapshotCreateOps[Self <: SnapshotCreate] (val x: Self) extends AnyVal {
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
    def setSnapshot(value: String): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
  }
  
}

