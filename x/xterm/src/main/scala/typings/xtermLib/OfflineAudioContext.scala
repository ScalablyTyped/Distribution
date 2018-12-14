package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineAudioContext extends BaseAudioContext {
  val length: scala.Double = js.native
  var oncomplete: (js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: xtermLib.xtermLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: xtermLib.xtermLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: xtermLib.xtermLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: xtermLib.xtermLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: xtermLib.xtermLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: xtermLib.xtermLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def startRendering(): js.Promise[AudioBuffer] = js.native
  def suspend(suspendTime: scala.Double): js.Promise[scala.Unit] = js.native
}

@JSGlobal("OfflineAudioContext")
@js.native
object OfflineAudioContext
  extends org.scalablytyped.runtime.Instantiable1[/* contextOptions */ OfflineAudioContextOptions, OfflineAudioContext]
     with org.scalablytyped.runtime.Instantiable3[
      /* numberOfChannels */ scala.Double, 
      /* length */ scala.Double, 
      /* sampleRate */ scala.Double, 
      OfflineAudioContext
    ]

