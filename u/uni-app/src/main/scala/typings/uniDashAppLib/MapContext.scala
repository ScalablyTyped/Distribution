package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContext extends js.Object {
  /**
    * 获取原生地图对象 plus.maps.Map
    */
  @JSName("$getAppMap")
  def $getAppMap(): js.Any = js.native
  /**
    * 获取当前地图中心的经纬度，返回的是 gcj02 坐标系，可以用于 uni.openLocation
    */
  def getCenterLocation(): scala.Unit = js.native
  def getCenterLocation(options: MapContextGetCenterLocationOptions): scala.Unit = js.native
  /**
    * 获取当前地图的视野范围
    */
  def getRegion(): scala.Unit = js.native
  def getRegion(options: MapContextGetRegionOptions): scala.Unit = js.native
  /**
    * 获取当前地图的缩放级别
    */
  def getScale(): scala.Unit = js.native
  def getScale(options: MapContextGetScaleOptions): scala.Unit = js.native
  /**
    * 缩放视野展示所有经纬度
    */
  def includePoints(): scala.Unit = js.native
  def includePoints(options: MapContextIncludePointsOptions): scala.Unit = js.native
  /**
    * 将地图中心移动到当前定位点，需要配合map组件的show-location使用
    */
  def moveToLocation(): scala.Unit = js.native
  /**
    * 平移marker，带动画
    */
  def translateMarker(): scala.Unit = js.native
  def translateMarker(options: MapContextTranslateMarkerOptions): scala.Unit = js.native
}

