package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAudioContext extends StObject {
  
  /**
    * 暂停
    */
  def pause(): Unit
  
  /**
    * 播放
    */
  def play(): Unit
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): Unit
  
  /**
    * 音频的地址
    */
  def setSrc(): Unit
}
object CreateAudioContext {
  
  inline def apply(pause: () => Unit, play: () => Unit, seek: () => Unit, setSrc: () => Unit): CreateAudioContext = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction0(seek), setSrc = js.Any.fromFunction0(setSrc))
    __obj.asInstanceOf[CreateAudioContext]
  }
  
  extension [Self <: CreateAudioContext](x: Self) {
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setSeek(value: () => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction0(value))
    
    inline def setSetSrc(value: () => Unit): Self = StObject.set(x, "setSrc", js.Any.fromFunction0(value))
  }
}
