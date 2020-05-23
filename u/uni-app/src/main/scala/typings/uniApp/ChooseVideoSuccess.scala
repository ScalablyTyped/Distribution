package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseVideoSuccess extends js.Object {
  /**
    * 选定视频的时间长度
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 返回选定视频的长
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 选定视频的数据量大小
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * 临时文件路径，下载后的文件会存储到一个临时文件
    */
  var tempFilePath: js.UndefOr[String] = js.undefined
  /**
    * 返回选定视频的宽
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChooseVideoSuccess {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    tempFilePath: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ChooseVideoSuccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseVideoSuccess]
  }
}

