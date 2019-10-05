package typings.winrtDashUwp.Windows.Media.Playback

import typings.winrtDashUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.messagereceivedfrombackground
import typings.winrtDashUwp.winrtDashUwpStrings.messagereceivedfromforeground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the media player while it is running in the background. */
@JSGlobal("Windows.Media.Playback.BackgroundMediaPlayer")
@js.native
abstract class BackgroundMediaPlayer () extends js.Object

/* static members */
@JSGlobal("Windows.Media.Playback.BackgroundMediaPlayer")
@js.native
object BackgroundMediaPlayer extends js.Object {
  /** Gets the current instance of the background media player. */
  var current: MediaPlayer = js.native
  /** Occurs when a message is received from the background task. */
  @JSName("onmessagereceivedfrombackground")
  var onmessagereceivedfrombackground_Original: EventHandler[_] = js.native
  /** Occurs when a message is received from the foreground task. */
  @JSName("onmessagereceivedfromforeground")
  var onmessagereceivedfromforeground_Original: EventHandler[_] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceivedfrombackground(`type`: messagereceivedfrombackground, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceivedfromforeground(`type`: messagereceivedfromforeground, listener: EventHandler[_]): Unit = js.native
  /**
    * Returns a Boolean value indicating if other media is currently playing on the device.
    * @return Boolean value indicating if other media is currently playing on the device.
    */
  def isMediaPlaying(): Boolean = js.native
  /** Occurs when a message is received from the background task. */
  def onmessagereceivedfrombackground(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Occurs when a message is received from the foreground task. */
  def onmessagereceivedfromforeground(ev: js.Any with WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceivedfrombackground(`type`: messagereceivedfrombackground, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceivedfromforeground(`type`: messagereceivedfromforeground, listener: EventHandler[_]): Unit = js.native
  /**
    * Sends a message to the background media player.
    * @param value Set of values representing the message.
    */
  def sendMessageToBackground(value: ValueSet): Unit = js.native
  /**
    * Sends a message to the foreground task.
    * @param value Set of values representing the message.
    */
  def sendMessageToForeground(value: ValueSet): Unit = js.native
  /** Shuts down the current background media player. */
  def shutdown(): Unit = js.native
}

