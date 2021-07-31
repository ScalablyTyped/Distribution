package typings.wixUiCore.videoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFacebookPlayerAPI
  extends StObject
     with IPlayerAPI {
  
  def getCurrentPosition(): Double = js.native
  
  def getDuration(): Double = js.native
  
  def isMuted(): Boolean = js.native
  
  def mute(): Unit = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def seek(amount: Double): Unit = js.native
  
  def setVolume(fraction: Double): Unit = js.native
  
  def subscribe(event: String): Unit = js.native
  def subscribe(event: String, fn: js.Function): Unit = js.native
  
  def unmute(): Unit = js.native
}
