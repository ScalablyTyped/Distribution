package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContext extends js.Object {
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
  callback: OnCameraFrameCallback): CameraFrameListener = js.native
  /** [CameraContext.setZoom(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.setZoom.html)
    *
    * 设置缩放级别
    *
    * 最低基础库： `2.10.0` */
  def setZoom(option: SetZoomOption): Unit = js.native
  /** [CameraContext.startRecord(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.startRecord.html)
    *
    * 开始录像 */
  def startRecord(option: CameraContextStartRecordOption): Unit = js.native
  /** [CameraContext.stopRecord(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.stopRecord.html)
    *
    * 结束录像 */
  def stopRecord(option: CameraContextStopRecordOption): Unit = js.native
  /** [CameraContext.takePhoto(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.takePhoto.html)
    *
    * 拍摄照片 */
  def takePhoto(option: TakePhotoOption): Unit = js.native
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
  implicit class CameraContextOps[Self <: CameraContext] (val x: Self) extends AnyVal {
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
    def setOnCameraFrame(value: OnCameraFrameCallback => CameraFrameListener): Self = this.set("onCameraFrame", js.Any.fromFunction1(value))
    @scala.inline
    def setSetZoom(value: SetZoomOption => Unit): Self = this.set("setZoom", js.Any.fromFunction1(value))
    @scala.inline
    def setStartRecord(value: CameraContextStartRecordOption => Unit): Self = this.set("startRecord", js.Any.fromFunction1(value))
    @scala.inline
    def setStopRecord(value: CameraContextStopRecordOption => Unit): Self = this.set("stopRecord", js.Any.fromFunction1(value))
    @scala.inline
    def setTakePhoto(value: TakePhotoOption => Unit): Self = this.set("takePhoto", js.Any.fromFunction1(value))
  }
  
}

