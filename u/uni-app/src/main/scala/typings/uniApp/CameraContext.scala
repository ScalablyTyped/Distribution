package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraContext extends StObject {
  
  /**
    * 结束录像，成功则返回封面与视频
    */
  def onCameraFrame(): Unit = js.native
  def onCameraFrame(callback: js.Function1[/* result */ CameraFrame, Unit]): Unit = js.native
  
  /**
    * 开始录像
    */
  def startRecord(): Unit = js.native
  def startRecord(options: CameraContextStartRecordOptions): Unit = js.native
  
  /**
    * 结束录像，成功则返回封面与视频
    */
  def stopRecord(): Unit = js.native
  def stopRecord(options: CameraContextStopRecordOptions): Unit = js.native
  
  /**
    * 拍照，可指定质量，成功则返回图片
    */
  def takePhoto(): Unit = js.native
  def takePhoto(options: CameraContextTakePhotoOptions): Unit = js.native
}
