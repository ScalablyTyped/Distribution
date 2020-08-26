package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * mapContext 通过 mapId 跟一个 <map/> 组件绑定，通过它可以操作对应的 <map/> 组件。
  */
@js.native
trait MapContext extends js.Object {
  /**
    * 获取当前地图中心的经纬度，返回的是 gcj02 坐标系，可以用于 wx.openLocation
    */
  def getCenterLocation(options: GetCenterLocationOptions): OpenLocationOptions = js.native
  /**
    * 将地图中心移动到当前定位点，需要配合map组件的show-location使用
    */
  def moveToLocation(): Unit = js.native
}

object MapContext {
  @scala.inline
  def apply(getCenterLocation: GetCenterLocationOptions => OpenLocationOptions, moveToLocation: () => Unit): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), moveToLocation = js.Any.fromFunction0(moveToLocation))
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
    def setGetCenterLocation(value: GetCenterLocationOptions => OpenLocationOptions): Self = this.set("getCenterLocation", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveToLocation(value: () => Unit): Self = this.set("moveToLocation", js.Any.fromFunction0(value))
  }
  
}

