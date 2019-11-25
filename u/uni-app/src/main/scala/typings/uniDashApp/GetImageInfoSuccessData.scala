package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageInfoSuccessData extends js.Object {
  /**
    * 图片高度，单位px
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 返回图片的方向
    */
  var orientation: js.UndefOr[String] = js.undefined
  /**
    * 返回图片的本地路径
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * 返回图片的格式
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * 图片宽度，单位px
    */
  var width: js.UndefOr[Double] = js.undefined
}

object GetImageInfoSuccessData {
  @scala.inline
  def apply(
    height: Int | Double = null,
    orientation: String = null,
    path: String = null,
    `type`: String = null,
    width: Int | Double = null
  ): GetImageInfoSuccessData = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageInfoSuccessData]
  }
}

