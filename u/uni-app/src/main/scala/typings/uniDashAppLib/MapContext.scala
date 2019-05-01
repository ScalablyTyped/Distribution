package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContext extends js.Object {
  /**
    * 获取原生地图对象
    */
  @JSName("$getAppMap")
  def $getAppMap(): js.Object
  /**
    * 获取当前地图中心的经纬度，返回的是 gcj02 坐标系，可以用于 uni.openLocation
    */
  def getCenterLocation(options: MapContextGetCenterLocationOptions): scala.Unit
  /**
    * 获取当前地图的视野范围
    */
  def getRegion(options: MapContextGetRegionOptions): scala.Unit
  /**
    * 获取当前地图的缩放级别
    */
  def getScale(options: MapContextGetScaleOptions): scala.Unit
  /**
    * 缩放视野展示所有经纬度
    */
  def includePoints(options: MapContextIncludePointsOptions): scala.Unit
  /**
    * 将地图中心移动到当前定位点，需要配合map组件的show-location使用
    */
  def moveToLocation(): scala.Unit
  /**
    * 平移marker，带动画
    */
  def translateMarker(options: MapContextTranslateMarkerOptions): scala.Unit
}

object MapContext {
  @scala.inline
  def apply(
    $getAppMap: () => js.Object,
    getCenterLocation: MapContextGetCenterLocationOptions => scala.Unit,
    getRegion: MapContextGetRegionOptions => scala.Unit,
    getScale: MapContextGetScaleOptions => scala.Unit,
    includePoints: MapContextIncludePointsOptions => scala.Unit,
    moveToLocation: () => scala.Unit,
    translateMarker: MapContextTranslateMarkerOptions => scala.Unit
  ): MapContext = {
    val __obj = js.Dynamic.literal($getAppMap = js.Any.fromFunction0($getAppMap), getCenterLocation = js.Any.fromFunction1(getCenterLocation), getRegion = js.Any.fromFunction1(getRegion), getScale = js.Any.fromFunction1(getScale), includePoints = js.Any.fromFunction1(includePoints), moveToLocation = js.Any.fromFunction0(moveToLocation), translateMarker = js.Any.fromFunction1(translateMarker))
  
    __obj.asInstanceOf[MapContext]
  }
}

