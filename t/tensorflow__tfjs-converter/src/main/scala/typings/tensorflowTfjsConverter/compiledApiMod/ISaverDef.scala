package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.SaverDef.CheckpointFormatVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISaverDef extends js.Object {
  /** SaverDef filenameTensorName */
  var filenameTensorName: js.UndefOr[String | Null] = js.undefined
  /** SaverDef keepCheckpointEveryNHours */
  var keepCheckpointEveryNHours: js.UndefOr[Double | Null] = js.undefined
  /** SaverDef maxToKeep */
  var maxToKeep: js.UndefOr[Double | Null] = js.undefined
  /** SaverDef restoreOpName */
  var restoreOpName: js.UndefOr[String | Null] = js.undefined
  /** SaverDef saveTensorName */
  var saveTensorName: js.UndefOr[String | Null] = js.undefined
  /** SaverDef sharded */
  var sharded: js.UndefOr[Boolean | Null] = js.undefined
  /** SaverDef version */
  var version: js.UndefOr[CheckpointFormatVersion | Null] = js.undefined
}

object ISaverDef {
  @scala.inline
  def apply(
    filenameTensorName: String = null,
    keepCheckpointEveryNHours: Int | Double = null,
    maxToKeep: Int | Double = null,
    restoreOpName: String = null,
    saveTensorName: String = null,
    sharded: js.UndefOr[Boolean] = js.undefined,
    version: CheckpointFormatVersion = null
  ): ISaverDef = {
    val __obj = js.Dynamic.literal()
    if (filenameTensorName != null) __obj.updateDynamic("filenameTensorName")(filenameTensorName.asInstanceOf[js.Any])
    if (keepCheckpointEveryNHours != null) __obj.updateDynamic("keepCheckpointEveryNHours")(keepCheckpointEveryNHours.asInstanceOf[js.Any])
    if (maxToKeep != null) __obj.updateDynamic("maxToKeep")(maxToKeep.asInstanceOf[js.Any])
    if (restoreOpName != null) __obj.updateDynamic("restoreOpName")(restoreOpName.asInstanceOf[js.Any])
    if (saveTensorName != null) __obj.updateDynamic("saveTensorName")(saveTensorName.asInstanceOf[js.Any])
    if (!js.isUndefined(sharded)) __obj.updateDynamic("sharded")(sharded.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISaverDef]
  }
}

