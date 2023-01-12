package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoContext extends StObject {
  
  /**
    * 退出全屏
    */
  def exitFullScreen(): Unit
  
  /**
    * 暂停
    */
  def pause(): Unit
  
  /**
    * 播放
    */
  def play(): Unit
  
  /**
    * 设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
    */
  def playbackRate(): Unit
  
  /**
    * 进入全屏，可传入{direction}参数（1.7.0起支持），详见video组件文档
    */
  def requestFullScreen(): Unit
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): Unit
  
  /**
    * 发送弹幕，danmu 包含两个属性 text, color。
    */
  def sendDanmu(): Unit
}
object VideoContext {
  
  inline def apply(
    exitFullScreen: () => Unit,
    pause: () => Unit,
    play: () => Unit,
    playbackRate: () => Unit,
    requestFullScreen: () => Unit,
    seek: () => Unit,
    sendDanmu: () => Unit
  ): VideoContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction0(exitFullScreen), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), playbackRate = js.Any.fromFunction0(playbackRate), requestFullScreen = js.Any.fromFunction0(requestFullScreen), seek = js.Any.fromFunction0(seek), sendDanmu = js.Any.fromFunction0(sendDanmu))
    __obj.asInstanceOf[VideoContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoContext] (val x: Self) extends AnyVal {
    
    inline def setExitFullScreen(value: () => Unit): Self = StObject.set(x, "exitFullScreen", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setPlaybackRate(value: () => Unit): Self = StObject.set(x, "playbackRate", js.Any.fromFunction0(value))
    
    inline def setRequestFullScreen(value: () => Unit): Self = StObject.set(x, "requestFullScreen", js.Any.fromFunction0(value))
    
    inline def setSeek(value: () => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction0(value))
    
    inline def setSendDanmu(value: () => Unit): Self = StObject.set(x, "sendDanmu", js.Any.fromFunction0(value))
  }
}
