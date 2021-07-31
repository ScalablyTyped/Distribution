package typings.wixUiCore.srcComponentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IYoutubePlayerAPI
  extends StObject
     with IPlayerAPI {
  
  def destroy(): Unit = js.native
  
  def getCurrentTime(): Double = js.native
  
  def getDuration(): Double = js.native
  
  def isMuted(): Boolean = js.native
  
  def mute(): Unit = js.native
  
  def on(event: String): Unit = js.native
  def on(event: String, fn: js.Function): Unit = js.native
  
  def pauseVideo(): Unit = js.native
  
  def playVideo(): Unit = js.native
  
  def seekTo(amount: Double): Unit = js.native
  
  def setVolume(fraction: Double): Unit = js.native
  
  def stopVideo(): Unit = js.native
  
  def unMute(): Unit = js.native
}
