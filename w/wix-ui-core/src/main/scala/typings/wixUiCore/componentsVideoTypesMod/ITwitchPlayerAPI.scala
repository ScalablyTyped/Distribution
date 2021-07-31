package typings.wixUiCore.componentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITwitchPlayerAPI
  extends StObject
     with IPlayerAPI {
  
  def addEventListener(event: String): Unit = js.native
  def addEventListener(event: String, fn: js.Function): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getCurrentTime(): Double = js.native
  
  def getDuration(): Double = js.native
  
  def getMuted(): Boolean = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def setCurrentTime(amount: Double): Unit = js.native
  
  def setMuted(muted: Boolean): Unit = js.native
  
  def setVolume(fraction: Double): Unit = js.native
}
