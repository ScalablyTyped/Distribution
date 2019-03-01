package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenLocationConfig extends WxBaseRequestConfig {
  /**
    * 地址详情说明
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 在查看位置界面底部显示的超链接, 可点击跳转
    */
  var infoUrl: js.UndefOr[java.lang.String] = js.undefined
  var latitude: js.UndefOr[scala.Double] = js.undefined
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * 位置名
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 地图缩放级别,整形值,范围从1~28。默认为最大
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
}

object OpenLocationConfig {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    infoUrl: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    scale: scala.Int | scala.Double = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null
  ): OpenLocationConfig = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (infoUrl != null) __obj.updateDynamic("infoUrl")(infoUrl)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[OpenLocationConfig]
  }
}

