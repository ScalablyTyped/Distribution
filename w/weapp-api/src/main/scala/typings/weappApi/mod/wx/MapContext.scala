package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContext extends js.Object {
  //  获取当前地图中心的经纬度。返回的是 gcj02 坐标系，可以用于 wx.openLocation()
  def getCenterLocation(options: GetCenterLocationSuccCbOptions): Unit
  //  获取当前地图的视野范围
  def getRegion(options: GetReginOptions): Unit
  //  获取当前地图的缩放级别
  def getScale(options: GetScaleOptions): Unit
  //  缩放视野展示所有经纬度
  def includePoints(options: zoomPointsOptions): Unit
  //  将地图中心移动到当前定位点。需要配合map组件的show-location使用
  def moveToLocation(): Unit
  //  平移marker，带动画
  def translateMarker(options: translateMarkerOptions): Unit
}

object MapContext {
  @scala.inline
  def apply(
    getCenterLocation: GetCenterLocationSuccCbOptions => Unit,
    getRegion: GetReginOptions => Unit,
    getScale: GetScaleOptions => Unit,
    includePoints: zoomPointsOptions => Unit,
    moveToLocation: () => Unit,
    translateMarker: translateMarkerOptions => Unit
  ): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), getRegion = js.Any.fromFunction1(getRegion), getScale = js.Any.fromFunction1(getScale), includePoints = js.Any.fromFunction1(includePoints), moveToLocation = js.Any.fromFunction0(moveToLocation), translateMarker = js.Any.fromFunction1(translateMarker))
  
    __obj.asInstanceOf[MapContext]
  }
}

