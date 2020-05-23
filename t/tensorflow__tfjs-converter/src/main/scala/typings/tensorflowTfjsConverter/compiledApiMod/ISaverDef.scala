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
    filenameTensorName: js.UndefOr[Null | String] = js.undefined,
    keepCheckpointEveryNHours: js.UndefOr[Null | Double] = js.undefined,
    maxToKeep: js.UndefOr[Null | Double] = js.undefined,
    restoreOpName: js.UndefOr[Null | String] = js.undefined,
    saveTensorName: js.UndefOr[Null | String] = js.undefined,
    sharded: js.UndefOr[Null | Boolean] = js.undefined,
    version: js.UndefOr[Null | CheckpointFormatVersion] = js.undefined
  ): ISaverDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filenameTensorName)) __obj.updateDynamic("filenameTensorName")(filenameTensorName.asInstanceOf[js.Any])
    if (!js.isUndefined(keepCheckpointEveryNHours)) __obj.updateDynamic("keepCheckpointEveryNHours")(keepCheckpointEveryNHours.asInstanceOf[js.Any])
    if (!js.isUndefined(maxToKeep)) __obj.updateDynamic("maxToKeep")(maxToKeep.asInstanceOf[js.Any])
    if (!js.isUndefined(restoreOpName)) __obj.updateDynamic("restoreOpName")(restoreOpName.asInstanceOf[js.Any])
    if (!js.isUndefined(saveTensorName)) __obj.updateDynamic("saveTensorName")(saveTensorName.asInstanceOf[js.Any])
    if (!js.isUndefined(sharded)) __obj.updateDynamic("sharded")(sharded.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISaverDef]
  }
}

