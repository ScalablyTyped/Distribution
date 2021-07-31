package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings.audioBitrate
import typings.wechatMiniprogram.wechatMiniprogramStrings.netJitter
import typings.wechatMiniprogram.wechatMiniprogramStrings.netSpeed
import typings.wechatMiniprogram.wechatMiniprogramStrings.videoBitrate
import typings.wechatMiniprogram.wechatMiniprogramStrings.videoFPS
import typings.wechatMiniprogram.wechatMiniprogramStrings.videoGOP
import typings.wechatMiniprogram.wechatMiniprogramStrings.videoHeight
import typings.wechatMiniprogram.wechatMiniprogramStrings.videoWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  /**
    * 网络状态数据
    *
    * -`videoBitrate` 当前视频编/码器输出的比特率，单位 kbps
    * -`audioBitrate` 当前音频编/码器输出的比特率，单位 kbps
    * -`videoFPS` 当前视频帧率
    * -`videoGOP` 当前视频 GOP,也就是每两个关键帧(I帧)间隔时长，单位 s
    * -`netSpeed` 当前的发送/接收速度
    * -`netJitter` 网络抖动情况，抖动越大，网络越不稳定
    * -`videoWidth` 视频画面的宽度
    * -`videoHeight` 视频画面的高度
    */
  var info: videoBitrate | audioBitrate | videoFPS | videoGOP | netSpeed | netJitter | videoWidth | videoHeight
}
object Info {
  
  @scala.inline
  def apply(
    info: videoBitrate | audioBitrate | videoFPS | videoGOP | netSpeed | netJitter | videoWidth | videoHeight
  ): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(
      value: videoBitrate | audioBitrate | videoFPS | videoGOP | netSpeed | netJitter | videoWidth | videoHeight
    ): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
