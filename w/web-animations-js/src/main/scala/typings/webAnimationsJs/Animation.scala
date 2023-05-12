package typings.webAnimationsJs

import typings.std.AnimationEffect
import typings.std.AnimationPlayState
import typings.std.CSSNumberish
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
  
  def addEventListener(`type`: finish | cancel, handler: EventListener): Unit = js.native
  
  def cancel(): Unit = js.native
  
  var currentTime: CSSNumberish | Null = js.native
  
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
  
  def removeEventListener(`type`: finish | cancel, handler: EventListener): Unit = js.native
  
  def reverse(): Unit = js.native
  
  var startTime: CSSNumberish | Null = js.native
  
  var timeline: AnimationTimeline | Null = js.native
}
