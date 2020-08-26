package typings.winrtUwp.global.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the streaming of audio, video, and images to remote devices. */
@JSGlobal("Windows.Media.PlayTo")
@js.native
object PlayTo extends js.Object {
  /** Provides information about the CurrentTimeChangeRequested event. */
  @js.native
  abstract class CurrentTimeChangeRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs
  
  /** Provides information about the MuteChangeRequested event. */
  @js.native
  abstract class MuteChangeRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.MuteChangeRequestedEventArgs
  
  /** Provides information about a Play To connection. */
  @js.native
  abstract class PlayToConnection ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToConnection
  
  /** Provides information about the Error event. */
  @js.native
  abstract class PlayToConnectionErrorEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionErrorEventArgs
  
  /** Provides information about the StateChanged event. */
  @js.native
  abstract class PlayToConnectionStateChangedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs
  
  /** Provides information about the Transferred event. */
  @js.native
  abstract class PlayToConnectionTransferredEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs
  
  /** Provides access to Play To capabilities. */
  @js.native
  abstract class PlayToManager ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToManager
  
  /** Represents a Play To target. */
  @js.native
  /** Creates a new instance of a Play To receiver. */
  class PlayToReceiver ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToReceiver
  
  /** Represents a media element to connect to a Play To target. */
  @js.native
  abstract class PlayToSource ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSource
  
  /** Represents a deferred operation when you're supplying a source media element for Play To. */
  @js.native
  abstract class PlayToSourceDeferral ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceDeferral
  
  /** Represents a request to connect a media element with a Play To target. */
  @js.native
  abstract class PlayToSourceRequest ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequest
  
  /** Provides information about the SourceRequested event. */
  @js.native
  abstract class PlayToSourceRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequestedEventArgs
  
  /** Provides information about the SourceSelected event. */
  @js.native
  abstract class PlayToSourceSelectedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceSelectedEventArgs
  
  /** Provides information about the PlaybackRateChangeRequested event. */
  @js.native
  abstract class PlaybackRateChangeRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs
  
  /** Provides information about the SourceChangeRequested event. */
  @js.native
  abstract class SourceChangeRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.SourceChangeRequestedEventArgs
  
  /** Provides information about the VolumeChangeRequested event. */
  @js.native
  abstract class VolumeChangeRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.VolumeChangeRequestedEventArgs
  
  /** Describes an error on a Play To connection. */
  @js.native
  object PlayToConnectionError extends js.Object {
    /* 2 */ val deviceError: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.deviceError with Double = js.native
    /* 3 */ val deviceLocked: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.deviceLocked with Double = js.native
    /* 1 */ val deviceNotResponding: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.deviceNotResponding with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.none with Double = js.native
    /* 4 */ val protectedPlaybackFailed: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.protectedPlaybackFailed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError with Double] = js.native
  }
  
  /** Describes the status of a Play To connection. */
  @js.native
  object PlayToConnectionState extends js.Object {
    /* 1 */ val connected: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState.connected with Double = js.native
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState.disconnected with Double = js.native
    /* 2 */ val rendering: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState.rendering with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState with Double] = js.native
  }
  
  /* static members */
  @js.native
  object PlayToManager extends js.Object {
    /**
      * Gets the Play To manager for the current view.
      * @return The Play To manager for the current view.
      */
    def getForCurrentView(): typings.winrtUwp.Windows.Media.PlayTo.PlayToManager = js.native
    /** Displays the Play To UI. */
    def showPlayToUI(): Unit = js.native
  }
  
}

