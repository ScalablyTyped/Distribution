package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.SaverDef.CheckpointFormatVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISaverDef extends js.Object {
  /** SaverDef filenameTensorName */
  var filenameTensorName: js.UndefOr[String | Null] = js.native
  /** SaverDef keepCheckpointEveryNHours */
  var keepCheckpointEveryNHours: js.UndefOr[Double | Null] = js.native
  /** SaverDef maxToKeep */
  var maxToKeep: js.UndefOr[Double | Null] = js.native
  /** SaverDef restoreOpName */
  var restoreOpName: js.UndefOr[String | Null] = js.native
  /** SaverDef saveTensorName */
  var saveTensorName: js.UndefOr[String | Null] = js.native
  /** SaverDef sharded */
  var sharded: js.UndefOr[Boolean | Null] = js.native
  /** SaverDef version */
  var version: js.UndefOr[CheckpointFormatVersion | Null] = js.native
}

object ISaverDef {
  @scala.inline
  def apply(): ISaverDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISaverDef]
  }
  @scala.inline
  implicit class ISaverDefOps[Self <: ISaverDef] (val x: Self) extends AnyVal {
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
    def setFilenameTensorName(value: String): Self = this.set("filenameTensorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenameTensorName: Self = this.set("filenameTensorName", js.undefined)
    @scala.inline
    def setFilenameTensorNameNull: Self = this.set("filenameTensorName", null)
    @scala.inline
    def setKeepCheckpointEveryNHours(value: Double): Self = this.set("keepCheckpointEveryNHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepCheckpointEveryNHours: Self = this.set("keepCheckpointEveryNHours", js.undefined)
    @scala.inline
    def setKeepCheckpointEveryNHoursNull: Self = this.set("keepCheckpointEveryNHours", null)
    @scala.inline
    def setMaxToKeep(value: Double): Self = this.set("maxToKeep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxToKeep: Self = this.set("maxToKeep", js.undefined)
    @scala.inline
    def setMaxToKeepNull: Self = this.set("maxToKeep", null)
    @scala.inline
    def setRestoreOpName(value: String): Self = this.set("restoreOpName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreOpName: Self = this.set("restoreOpName", js.undefined)
    @scala.inline
    def setRestoreOpNameNull: Self = this.set("restoreOpName", null)
    @scala.inline
    def setSaveTensorName(value: String): Self = this.set("saveTensorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveTensorName: Self = this.set("saveTensorName", js.undefined)
    @scala.inline
    def setSaveTensorNameNull: Self = this.set("saveTensorName", null)
    @scala.inline
    def setSharded(value: Boolean): Self = this.set("sharded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharded: Self = this.set("sharded", js.undefined)
    @scala.inline
    def setShardedNull: Self = this.set("sharded", null)
    @scala.inline
    def setVersion(value: CheckpointFormatVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
  
}

