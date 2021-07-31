package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraContext extends StObject {
  
  /** [[CameraFrameListener](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraFrameListener.html) CameraContext.onCameraFrame(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.onCameraFrame.html)
  *
  * 获取 Camera 实时帧数据
  *
  * ****
  *
  * 注： 使用该接口需同时在 [camera](https://developers.weixin.qq.com/miniprogram/dev/component/camera.html) 组件属性中指定 frame-size。
  *
  * **示例代码**
  *
  *
  * ```js
  const context = wx.createCameraContext()
  const listener = context.onCameraFrame((frame) => {
    console.log(frame.data instanceof ArrayBuffer, frame.width, frame.height)
  })
  listener.start()
  ```
  *
  * 最低基础库： `2.7.0` */
  def onCameraFrame(/** 回调函数 */
  callback: OnCameraFrameCallback): CameraFrameListener
  
  /** [CameraContext.setZoom(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.setZoom.html)
    *
    * 设置缩放级别
    *
    * 最低基础库： `2.10.0` */
  def setZoom(option: SetZoomOption): Unit
  
  /** [CameraContext.startRecord(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.startRecord.html)
    *
    * 开始录像 */
  def startRecord(option: CameraContextStartRecordOption): Unit
  
  /** [CameraContext.stopRecord(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.stopRecord.html)
    *
    * 结束录像 */
  def stopRecord(option: CameraContextStopRecordOption): Unit
  
  /** [CameraContext.takePhoto(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.takePhoto.html)
    *
    * 拍摄照片 */
  def takePhoto(option: TakePhotoOption): Unit
}
object CameraContext {
  
  @scala.inline
  def apply(
    onCameraFrame: OnCameraFrameCallback => CameraFrameListener,
    setZoom: SetZoomOption => Unit,
    startRecord: CameraContextStartRecordOption => Unit,
    stopRecord: CameraContextStopRecordOption => Unit,
    takePhoto: TakePhotoOption => Unit
  ): CameraContext = {
    val __obj = js.Dynamic.literal(onCameraFrame = js.Any.fromFunction1(onCameraFrame), setZoom = js.Any.fromFunction1(setZoom), startRecord = js.Any.fromFunction1(startRecord), stopRecord = js.Any.fromFunction1(stopRecord), takePhoto = js.Any.fromFunction1(takePhoto))
    __obj.asInstanceOf[CameraContext]
  }
  
  @scala.inline
  implicit class CameraContextMutableBuilder[Self <: CameraContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnCameraFrame(value: OnCameraFrameCallback => CameraFrameListener): Self = StObject.set(x, "onCameraFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetZoom(value: SetZoomOption => Unit): Self = StObject.set(x, "setZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartRecord(value: CameraContextStartRecordOption => Unit): Self = StObject.set(x, "startRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopRecord(value: CameraContextStopRecordOption => Unit): Self = StObject.set(x, "stopRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTakePhoto(value: TakePhotoOption => Unit): Self = StObject.set(x, "takePhoto", js.Any.fromFunction1(value))
  }
}
