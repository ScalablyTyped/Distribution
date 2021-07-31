package typings.wixUiCore.videoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVimeoPlayerAPI
  extends StObject
     with IPlayerAPI {
  
  def destroy(): Unit = js.native
  
  def getCurrentTime(): js.Promise[js.Any] = js.native
  
  def getDuration(): js.Promise[js.Any] = js.native
  
  def on(event: String): Unit = js.native
  def on(event: String, fn: js.Function): Unit = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def ready(): js.Promise[js.Any] = js.native
  
  def setCurrentTime(amount: Double): Unit = js.native
  
  def setVolume(fraction: Double): Unit = js.native
  
  def unload(): Unit = js.native
}
