package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContext extends js.Object {
  /** [MapContext.getCenterLocation(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.getCenterLocation.html)
    *
    * 获取当前地图中心的经纬度。返回的是 gcj02 坐标系，可以用于 [wx.openLocation()](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.openLocation.html) */
  def getCenterLocation(): Unit = js.native
  def getCenterLocation(option: GetCenterLocationOption): Unit = js.native
  /** [MapContext.getRegion(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.getRegion.html)
    *
    * 获取当前地图的视野范围
    *
    * 最低基础库： `1.4.0` */
  def getRegion(): Unit = js.native
  def getRegion(option: GetRegionOption): Unit = js.native
  /** [MapContext.getRotate(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.getRotate.html)
    *
    * 获取当前地图的旋转角
    *
    * 最低基础库： `2.8.0` */
  def getRotate(): Unit = js.native
  def getRotate(option: GetRotateOption): Unit = js.native
  /** [MapContext.getScale(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.getScale.html)
    *
    * 获取当前地图的缩放级别
    *
    * 最低基础库： `1.4.0` */
  def getScale(): Unit = js.native
  def getScale(option: GetScaleOption): Unit = js.native
  /** [MapContext.getSkew(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.getSkew.html)
    *
    * 获取当前地图的倾斜角
    *
    * 最低基础库： `2.8.0` */
  def getSkew(): Unit = js.native
  def getSkew(option: GetSkewOption): Unit = js.native
  /** [MapContext.includePoints(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.includePoints.html)
    *
    * 缩放视野展示所有经纬度
    *
    * 最低基础库： `1.2.0` */
  def includePoints(option: IncludePointsOption): Unit = js.native
  /** [MapContext.moveToLocation(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.moveToLocation.html)
    *
    * 将地图中心移置当前定位点，此时需设置地图组件 show-location 为true。[2.8.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起支持将地图中心移动到指定位置。
    *
    * 最低基础库： `1.2.0` */
  def moveToLocation(option: MoveToLocationOption): Unit = js.native
  /** [MapContext.setCenterOffset(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.setCenterOffset.html)
    *
    * 设置地图中心点偏移，向后向下为增长，屏幕比例范围(0.25~0.75)，默认偏移为[0.5, 0.5]
    *
    * 最低基础库： `2.10.0` */
  def setCenterOffset(option: SetCenterOffsetOption): Unit = js.native
  /** [MapContext.translateMarker(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.translateMarker.html)
    *
    * 平移marker，带动画
    *
    * 最低基础库： `1.2.0` */
  def translateMarker(option: TranslateMarkerOption): Unit = js.native
}

