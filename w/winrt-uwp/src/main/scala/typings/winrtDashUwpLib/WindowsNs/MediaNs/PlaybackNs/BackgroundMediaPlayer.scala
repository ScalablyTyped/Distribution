package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the media player while it is running in the background. */
@JSGlobal("Windows.Media.Playback.BackgroundMediaPlayer")
@js.native
abstract class BackgroundMediaPlayer () extends js.Object

/** Provides access to the media player while it is running in the background. */
@JSGlobal("Windows.Media.Playback.BackgroundMediaPlayer")
@js.native
object BackgroundMediaPlayer extends js.Object {
  /** Gets the current instance of the background media player. */
  var current: winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayer = js.native
  /** Occurs when a message is received from the background task. */
  @JSName("onmessagereceivedfrombackground")
  var onmessagereceivedfrombackground_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Occurs when a message is received from the foreground task. */
  @JSName("onmessagereceivedfromforeground")
  var onmessagereceivedfromforeground_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceivedfrombackground(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceivedfrombackground,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceivedfromforeground(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceivedfromforeground,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
                   * Returns a Boolean value indicating if other media is currently playing on the device.
                   * @return Boolean value indicating if other media is currently playing on the device.
                   */
  def isMediaPlaying(): scala.Boolean = js.native
  /** Occurs when a message is received from the background task. */
  def onmessagereceivedfrombackground(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when a message is received from the foreground task. */
  def onmessagereceivedfromforeground(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceivedfrombackground(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceivedfrombackground,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceivedfromforeground(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceivedfromforeground,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
                   * Sends a message to the background media player.
                   * @param value Set of values representing the message.
                   */
  def sendMessageToBackground(value: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet): scala.Unit = js.native
  /**
                   * Sends a message to the foreground task.
                   * @param value Set of values representing the message.
                   */
  def sendMessageToForeground(value: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet): scala.Unit = js.native
  /** Shuts down the current background media player. */
  def shutdown(): scala.Unit = js.native
}

