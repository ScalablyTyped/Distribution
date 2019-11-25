package typings.uniDashApp

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
    duration: Int | Double = null,
    height: Int | Double = null,
    size: Int | Double = null,
    tempFilePath: String = null,
    width: Int | Double = null
  ): ChooseVideoSuccess = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseVideoSuccess]
  }
}

