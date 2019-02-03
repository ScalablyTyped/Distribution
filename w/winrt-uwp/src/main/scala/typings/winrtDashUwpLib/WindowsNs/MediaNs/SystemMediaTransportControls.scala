package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object that enables integrate with the system media transport controls and support for media commands. */
@JSGlobal("Windows.Media.SystemMediaTransportControls")
@js.native
abstract class SystemMediaTransportControls () extends js.Object {
  /** Gets or sets a value representing the current auto-repeat mode of the SystemMediaTransportControls . */
  var autoRepeatMode: MediaPlaybackAutoRepeatMode = js.native
  /** Gets the display updater for the SystemMediaTransportControls which enable updating the information displayed about the currently playing song. */
  var displayUpdater: SystemMediaTransportControlsDisplayUpdater = js.native
  /** Gets or sets a value that specifies if the channel down button is supported. */
  var isChannelDownEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if the channel up button is supported. */
  var isChannelUpEnabled: scala.Boolean = js.native
  /** Enables and disables the system media transport controls for the app. */
  var isEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if the fast forward button is supported. */
  var isFastForwardEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if the next button is supported. */
  var isNextEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if the pause button is supported. true if the pause button is supported; otherwise, false. */
  var isPauseEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if the play button is supported. */
  var isPlayEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if the previous button is supported. */
  var isPreviousEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if the record button is supported. true if the record button is supported; otherwise, false. */
  var isRecordEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if the rewind button is supported. */
  var isRewindEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if the stop button is supported. */
  var isStopEnabled: scala.Boolean = js.native
  /** Occurs when the user modifies the SystemMediaTransportControls auto-repeat mode. */
  @JSName("onautorepeatmodechangerequested")
  var onautorepeatmodechangerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, AutoRepeatModeChangeRequestedEventArgs] = js.native
  /** Occurs when a button is pressed on the SystemMediaTransportControls . */
  @JSName("onbuttonpressed")
  var onbuttonpressed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsButtonPressedEventArgs] = js.native
  /** Occurs when the user modifies the playback position of the SystemMediaTransportControls . */
  @JSName("onplaybackpositionchangerequested")
  var onplaybackpositionchangerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, PlaybackPositionChangeRequestedEventArgs] = js.native
  /** Occurs when the user modifies the SystemMediaTransportControls playback rate. */
  @JSName("onplaybackratechangerequested")
  var onplaybackratechangerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, _] = js.native
  /** Occurs when a property on the SystemMediaTransportControls has changed. */
  @JSName("onpropertychanged")
  var onpropertychanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsPropertyChangedEventArgs] = js.native
  /** Occurs when the user modifies the SystemMediaTransportControls shuffle state. */
  @JSName("onshuffleenabledchangerequested")
  var onshuffleenabledchangerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, ShuffleEnabledChangeRequestedEventArgs] = js.native
  /** Gets or sets the playback rate of the SystemMediaTransportControls . */
  var playbackRate: scala.Double = js.native
  /** Gets the playback status of the media. */
  var playbackStatus: MediaPlaybackStatus = js.native
  /** Gets or sets a value representing the current shuffle state of the SystemMediaTransportControls . */
  var shuffleEnabled: scala.Boolean = js.native
  /** Gets the sound level of the media for the capture and render streams. */
  var soundLevel: SoundLevel = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autorepeatmodechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.autorepeatmodechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, AutoRepeatModeChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_buttonpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.buttonpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsButtonPressedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackpositionchangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackpositionchangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, PlaybackPositionChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackratechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackratechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_propertychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.propertychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsPropertyChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shuffleenabledchangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.shuffleenabledchangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, ShuffleEnabledChangeRequestedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when the user modifies the SystemMediaTransportControls auto-repeat mode. */
  def onautorepeatmodechangerequested(
    ev: AutoRepeatModeChangeRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SystemMediaTransportControls]
  ): scala.Unit = js.native
  /** Occurs when a button is pressed on the SystemMediaTransportControls . */
  def onbuttonpressed(
    ev: SystemMediaTransportControlsButtonPressedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SystemMediaTransportControls]
  ): scala.Unit = js.native
  /** Occurs when the user modifies the playback position of the SystemMediaTransportControls . */
  def onplaybackpositionchangerequested(
    ev: PlaybackPositionChangeRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SystemMediaTransportControls]
  ): scala.Unit = js.native
  /** Occurs when the user modifies the SystemMediaTransportControls playback rate. */
  def onplaybackratechangerequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[SystemMediaTransportControls]): scala.Unit = js.native
  /** Occurs when a property on the SystemMediaTransportControls has changed. */
  def onpropertychanged(
    ev: SystemMediaTransportControlsPropertyChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SystemMediaTransportControls]
  ): scala.Unit = js.native
  /** Occurs when the user modifies the SystemMediaTransportControls shuffle state. */
  def onshuffleenabledchangerequested(
    ev: ShuffleEnabledChangeRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SystemMediaTransportControls]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_autorepeatmodechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.autorepeatmodechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, AutoRepeatModeChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_buttonpressed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.buttonpressed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsButtonPressedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackpositionchangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackpositionchangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, PlaybackPositionChangeRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackratechangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.playbackratechangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_propertychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.propertychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, SystemMediaTransportControlsPropertyChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shuffleenabledchangerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.shuffleenabledchangerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SystemMediaTransportControls, ShuffleEnabledChangeRequestedEventArgs]
  ): scala.Unit = js.native
  /**
    * Updates the SystemMediaTransportControls timeline properties with the values in the provided object.
    * @param timelineProperties The object representing the new timeline property values.
    */
  def updateTimelineProperties(timelineProperties: SystemMediaTransportControlsTimelineProperties): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Media.SystemMediaTransportControls")
@js.native
object SystemMediaTransportControls extends js.Object {
  /**
    * The system transport controls for the current view.
    * @return The system transport controls for the current view.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControls = js.native
}

