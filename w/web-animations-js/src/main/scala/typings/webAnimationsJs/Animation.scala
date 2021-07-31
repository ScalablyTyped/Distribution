package typings.webAnimationsJs

import typings.std.AnimationEffect
import typings.std.AnimationPlayState
import typings.std.EventListener
import typings.std.EventTarget
import typings.webAnimationsJs.webAnimationsJsStrings.cancel
import typings.webAnimationsJs.webAnimationsJsStrings.finish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_cancel(`type`: cancel, handler: EventListener): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(`type`: finish, handler: EventListener): Unit = js.native
  
  def cancel(): Unit = js.native
  
  var currentTime: Double | Null = js.native
  
  var effect: AnimationEffect | Null = js.native
  
  def finish(): Unit = js.native
  
  val finished: js.Promise[Animation] = js.native
  
  var id: String = js.native
  
  var oncancel: AnimationEventListener = js.native
  
  var onfinish: AnimationEventListener = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  val playState: AnimationPlayState = js.native
  
  var playbackRate: Double = js.native
  
  val ready: js.Promise[Animation] = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_cancel(`type`: cancel, handler: EventListener): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(`type`: finish, handler: EventListener): Unit = js.native
  
  def reverse(): Unit = js.native
  
  var startTime: Double | Null = js.native
  
  var timeline: AnimationTimeline | Null = js.native
}
