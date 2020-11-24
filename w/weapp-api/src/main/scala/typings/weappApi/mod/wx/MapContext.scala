package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContext extends js.Object {
  
  //  获取当前地图中心的经纬度。返回的是 gcj02 坐标系，可以用于 wx.openLocation()
  def getCenterLocation(options: GetCenterLocationSuccCbOptions): Unit = js.native
  
  //  获取当前地图的视野范围
  def getRegion(options: GetReginOptions): Unit = js.native
  
  //  获取当前地图的缩放级别
  def getScale(options: GetScaleOptions): Unit = js.native
  
  //  缩放视野展示所有经纬度
  def includePoints(options: zoomPointsOptions): Unit = js.native
  
  //  将地图中心移动到当前定位点。需要配合map组件的show-location使用
  def moveToLocation(): Unit = js.native
  
  //  平移marker，带动画
  def translateMarker(options: translateMarkerOptions): Unit = js.native
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
  
  @scala.inline
  implicit class MapContextOps[Self <: MapContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCenterLocation(value: GetCenterLocationSuccCbOptions => Unit): Self = this.set("getCenterLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRegion(value: GetReginOptions => Unit): Self = this.set("getRegion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScale(value: GetScaleOptions => Unit): Self = this.set("getScale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludePoints(value: zoomPointsOptions => Unit): Self = this.set("includePoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveToLocation(value: () => Unit): Self = this.set("moveToLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTranslateMarker(value: translateMarkerOptions => Unit): Self = this.set("translateMarker", js.Any.fromFunction1(value))
  }
}
