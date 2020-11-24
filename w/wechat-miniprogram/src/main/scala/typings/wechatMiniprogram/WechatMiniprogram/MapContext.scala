package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContext extends js.Object {
  
  /** [MapContext.addMarkers(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.addMarkers.html)
    *
    * 添加 marker。
    *
    * 最低基础库： `2.13.0` */
  def addMarkers(option: AddMarkersOption): Unit = js.native
  
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
  
  /** [MapContext.initMarkerCluster(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.initMarkerCluster.html)
    *
    * 初始化点聚合的配置，未调用时采用默认配置。
    *
    * 最低基础库： `2.13.0` */
  def initMarkerCluster(option: InitMarkerClusterOption): Unit = js.native
  
  /** [MapContext.moveAlong(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.moveAlong.html)
    *
    * 沿指定路径移动 `marker`，用于轨迹回放等场景。动画完成时触发回调事件，若动画进行中，对同一 `marker` 再次调用 `moveAlong` 方法，前一次的动画将被打断。
    *
    * 最低基础库： `2.13.0` */
  def moveAlong(option: MoveAlongOption): Unit = js.native
  
  /** [MapContext.moveToLocation(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.moveToLocation.html)
    *
    * 将地图中心移置当前定位点，此时需设置地图组件 show-location 为true。[2.8.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起支持将地图中心移动到指定位置。
    *
    * 最低基础库： `1.2.0` */
  def moveToLocation(): Unit = js.native
  def moveToLocation(option: MoveToLocationOption): Unit = js.native
  
  /** [MapContext.on()](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.on.html)
  *
  * 监听地图事件。
  *
  * ### markerClusterCreate
  *
  * 缩放或拖动导致新的聚合簇产生时触发，仅返回新创建的聚合簇信息。
  *
  * #### 返回参数
  *
  * | 参数      | 类型   | 说明      |
  * | --------- | ------ | --------- |
  * | clusters | `Array&lt;ClusterInfo&gt;` | 聚合簇数据 |
  *
  * ### markerClusterClick
  *
  * 聚合簇的点击事件。
  *
  * #### 返回参数
  *
  * | 参数      | 类型          | 说明      |
  * | --------- | ------------- | --------- |
  * | cluster   | ClusterInfo   | 聚合簇    |
  *
  *
  * #### ClusterInfo 结构
  *
  * | 参数       | 类型                 | 说明                       |
  * | ---------- | -------------------- | -------------------------- |
  * | clusterId  | Number               | 聚合簇的 id               |
  * | center     | LatLng               | 聚合簇的坐标             |
  * | markerIds | `Array&lt;Number&gt;` | 该聚合簇内的点标记数据数组 |
  *
  * **示例代码**
  *
  *
  *
  * ```js
    MapContext.on('markerClusterCreate', (res) => {})
    MapContext.on('markerClusterClick', (res) => {})
  ```
  *
  * 最低基础库： `2.13.0` */
  def on(): Unit = js.native
  
  /** [MapContext.removeMarkers(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.removeMarkers.html)
    *
    * 移除 marker。
    *
    * 最低基础库： `2.13.0` */
  def removeMarkers(option: RemoveMarkersOption): Unit = js.native
  
  /** [MapContext.setCenterOffset(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.setCenterOffset.html)
    *
    * 设置地图中心点偏移，向后向下为增长，屏幕比例范围(0.25~0.75)，默认偏移为[0.5, 0.5]
    *
    * 最低基础库： `2.10.0` */
  def setCenterOffset(option: SetCenterOffsetOption): Unit = js.native
  
  /** [MapContext.translateMarker(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/map/MapContext.translateMarker.html)
    *
    * 平移marker，带动画。
    *
    * 最低基础库： `1.2.0` */
  def translateMarker(option: TranslateMarkerOption): Unit = js.native
}
