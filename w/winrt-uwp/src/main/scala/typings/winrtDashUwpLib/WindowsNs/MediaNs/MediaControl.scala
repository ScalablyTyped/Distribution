package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the object that applications register with, to receive media focus and transport control notifications. */
@JSGlobal("Windows.Media.MediaControl")
@js.native
abstract class MediaControl () extends js.Object

/* static members */
@JSGlobal("Windows.Media.MediaControl")
@js.native
object MediaControl extends js.Object {
  /** Gets or sets the path to the artwork for the album cover. */
  var albumArt: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets or sets the name of the artist. */
  var artistName: java.lang.String = js.native
  /** Gets or sets the state of the Play button. */
  var isPlaying: scala.Boolean = js.native
  /** Event raised when a ChannelDown command is issued to the application. */
  @JSName("onchanneldownpressed")
  var onchanneldownpressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a ChannelUp command is issued to the application. */
  @JSName("onchanneluppressed")
  var onchanneluppressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a FastForward command is issued to the application. */
  @JSName("onfastforwardpressed")
  var onfastforwardpressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a NextTrack command is issued to the application. */
  @JSName("onnexttrackpressed")
  var onnexttrackpressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a Pause command is issued to the application. */
  @JSName("onpausepressed")
  var onpausepressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a PlayPauseToggle command is issued to the application. */
  @JSName("onplaypausetogglepressed")
  var onplaypausetogglepressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a Play command is issued to the application. */
  @JSName("onplaypressed")
  var onplaypressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a PreviousTrack command is issued to the application. */
  @JSName("onprevioustrackpressed")
  var onprevioustrackpressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a Record command is issued to the application. */
  @JSName("onrecordpressed")
  var onrecordpressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a Rewind command is issued to the application. */
  @JSName("onrewindpressed")
  var onrewindpressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when the sound level changes. */
  @JSName("onsoundlevelchanged")
  var onsoundlevelchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event raised when a Stop command is issued to the application. */
  @JSName("onstoppressed")
  var onstoppressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Gets the current sound level. */
  var soundLevel: winrtDashUwpLib.WindowsNs.MediaNs.SoundLevel = js.native
  /** Gets or sets the track name. */
  var trackName: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_channeldownpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.channeldownpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_channeluppressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.channeluppressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fastforwardpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.fastforwardpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nexttrackpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.nexttrackpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pausepressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pausepressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playpausetogglepressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playpausetogglepressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_previoustrackpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.previoustrackpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_recordpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.recordpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rewindpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.rewindpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundlevelchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.soundlevelchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stoppressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stoppressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /** Event raised when a ChannelDown command is issued to the application. */
  def onchanneldownpressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a ChannelUp command is issued to the application. */
  def onchanneluppressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a FastForward command is issued to the application. */
  def onfastforwardpressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a NextTrack command is issued to the application. */
  def onnexttrackpressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a Pause command is issued to the application. */
  def onpausepressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a PlayPauseToggle command is issued to the application. */
  def onplaypausetogglepressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a Play command is issued to the application. */
  def onplaypressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a PreviousTrack command is issued to the application. */
  def onprevioustrackpressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a Record command is issued to the application. */
  def onrecordpressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a Rewind command is issued to the application. */
  def onrewindpressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when the sound level changes. */
  def onsoundlevelchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event raised when a Stop command is issued to the application. */
  def onstoppressed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_channeldownpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.channeldownpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_channeluppressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.channeluppressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fastforwardpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.fastforwardpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nexttrackpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.nexttrackpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pausepressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pausepressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playpausetogglepressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playpausetogglepressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_previoustrackpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.previoustrackpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_recordpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.recordpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rewindpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.rewindpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundlevelchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.soundlevelchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stoppressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stoppressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
}

