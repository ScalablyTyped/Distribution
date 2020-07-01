package typings.systemLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConfiguration extends js.Object {
  var fileRotateMaxSize: js.UndefOr[Double] = js.undefined
  var fileRotateType: js.UndefOr[typings.systemLogger.mod.fileRotateType] = js.undefined
  var isFileRotate: js.UndefOr[Boolean] = js.undefined
  var saveToFileName: js.UndefOr[String] = js.undefined
}

object FileConfiguration {
  @scala.inline
  def apply(
    fileRotateMaxSize: js.UndefOr[Double] = js.undefined,
    fileRotateType: fileRotateType = null,
    isFileRotate: js.UndefOr[Boolean] = js.undefined,
    saveToFileName: String = null
  ): FileConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileRotateMaxSize)) __obj.updateDynamic("fileRotateMaxSize")(fileRotateMaxSize.get.asInstanceOf[js.Any])
    if (fileRotateType != null) __obj.updateDynamic("fileRotateType")(fileRotateType.asInstanceOf[js.Any])
    if (!js.isUndefined(isFileRotate)) __obj.updateDynamic("isFileRotate")(isFileRotate.get.asInstanceOf[js.Any])
    if (saveToFileName != null) __obj.updateDynamic("saveToFileName")(saveToFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfiguration]
  }
}

