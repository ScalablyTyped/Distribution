package typings.wegameDashApi

import typings.wegameDashApi.wegameDashApiStrings.auto
import typings.wegameDashApi.wegameDashApiStrings.back
import typings.wegameDashApi.wegameDashApiStrings.front
import typings.wegameDashApi.wegameDashApiStrings.high
import typings.wegameDashApi.wegameDashApiStrings.large
import typings.wegameDashApi.wegameDashApiStrings.low
import typings.wegameDashApi.wegameDashApiStrings.medium
import typings.wegameDashApi.wegameDashApiStrings.normal
import typings.wegameDashApi.wegameDashApiStrings.off
import typings.wegameDashApi.wegameDashApiStrings.on
import typings.wegameDashApi.wegameDashApiStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 相机对象
  */
@JSGlobal("Camera")
@js.native
class Camera () extends js.Object {
  /**
    * 摄像头朝向
    */
  var devicePosition: front | back = js.native
  /**
    * 闪光灯状态
    */
  var flash: auto | on | off = js.native
  /**
    * 相机的高度
    */
  var height: Double = js.native
  /**
    * 帧数据图像尺寸
    */
  var size: small | medium | large = js.native
  /**
    * 相机的宽度
    */
  var width: Double = js.native
  /**
    * 相机的左上角横坐标
    */
  var x: Double = js.native
  /**
    * 相机的左上角纵坐标
    */
  var y: Double = js.native
  /**
    * 关闭监听帧数据
    */
  def closeFrameChange(): Unit = js.native
  /**
    * 销毁相机
    */
  def destroy(): Unit = js.native
  /**
    * 开启监听帧数据
    */
  def listenFrameChange(): Unit = js.native
  /**
    * 监听用户不允许授权使用摄像头的情况
    * @param callback 回调函数
    */
  def onAuthCancel(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听摄像头实时帧数据
    */
  def onCameraFrame(callback: js.Function1[/* res */ Anon_Data, Unit]): Unit = js.native
  /**
    * 监听摄像头非正常终止事件，如退出后台等情况
    * @param callback 回调函数
    */
  def onStop(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 开始录像
    */
  def startRecord(): js.Promise[Unit] = js.native
  /**
    * 结束录像，成功则返回封面与视频
    * @param compressed 是否压缩录制视频
    */
  def stopRecord(compressed: Boolean): js.Promise[Anon_TempThumbPath] = js.native
  /**
    * 拍照，可指定质量，成功则返回图片
    * @param quality 图片质量
    */
  def takePhoto(): js.Promise[Anon_Height] = js.native
  @JSName("takePhoto")
  def takePhoto_high(quality: high): js.Promise[Anon_Height] = js.native
  @JSName("takePhoto")
  def takePhoto_low(quality: low): js.Promise[Anon_Height] = js.native
  @JSName("takePhoto")
  def takePhoto_normal(quality: normal): js.Promise[Anon_Height] = js.native
}

