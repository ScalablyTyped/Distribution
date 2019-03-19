package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageInfoSuccessData extends js.Object {
  /**
    * 图片高度，单位px
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * 返回图片的方向
    */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 返回图片的本地路径
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 返回图片的格式
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 图片宽度，单位px
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object GetImageInfoSuccessData {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    orientation: java.lang.String = null,
    path: java.lang.String = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): GetImageInfoSuccessData = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageInfoSuccessData]
  }
}

