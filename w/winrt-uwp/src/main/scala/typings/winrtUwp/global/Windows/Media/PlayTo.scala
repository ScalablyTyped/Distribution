package typings.winrtUwp.global.Windows.Media

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError
import typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
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
    extends typings.winrtUwp.Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs {
    /** Gets the new time that the Play To source audio or video stream has been changed to. */
    /* CompleteClass */
    override var time: Double = js.native
  }
  
  /** Provides information about the MuteChangeRequested event. */
  @js.native
  abstract class MuteChangeRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.MuteChangeRequestedEventArgs {
    /** Gets a value that indicates whether mute or unmute was requested. */
    /* CompleteClass */
    override var mute: Boolean = js.native
  }
  
  /** Provides information about a Play To connection. */
  @js.native
  abstract class PlayToConnection ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToConnection
  
  /** Provides information about the Error event. */
  @js.native
  abstract class PlayToConnectionErrorEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionErrorEventArgs {
    /** Gets the error code for a Play To connection error. */
    /* CompleteClass */
    override var code: PlayToConnectionError = js.native
    /** Gets the error message for a Play To connection error. */
    /* CompleteClass */
    override var message: String = js.native
  }
  
  /** Provides information about the StateChanged event. */
  @js.native
  abstract class PlayToConnectionStateChangedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs {
    /** Gets the current state after the Play To connection state has changed. */
    /* CompleteClass */
    override var currentState: PlayToConnectionState = js.native
    /** Gets the previous state before the Play To connection state was changed. */
    /* CompleteClass */
    override var previousState: PlayToConnectionState = js.native
  }
  
  /** Provides information about the Transferred event. */
  @js.native
  abstract class PlayToConnectionTransferredEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs {
    /** Gets the current Play To source that a connection was transferred to. */
    /* CompleteClass */
    override var currentSource: typings.winrtUwp.Windows.Media.PlayTo.PlayToSource = js.native
    /** Gets the previous Play To source that a connection was transferred from. */
    /* CompleteClass */
    override var previousSource: typings.winrtUwp.Windows.Media.PlayTo.PlayToSource = js.native
  }
  
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
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSource {
    /** Gets the connection to the Play To target. */
    /* CompleteClass */
    override var connection: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnection = js.native
    /** Gets or sets the next Play To source element. */
    /* CompleteClass */
    override var next: typings.winrtUwp.Windows.Media.PlayTo.PlayToSource = js.native
    /** Specifies a preferred Uniform Resource Identifier (URI) for the media stream, such as a cloud based media server, used is used for Play To by reference. */
    /* CompleteClass */
    override var preferredSourceUri: Uri = js.native
    /** Connects the next Play To source element to the Play To target. */
    /* CompleteClass */
    override def playNext(): Unit = js.native
  }
  
  /** Represents a deferred operation when you're supplying a source media element for Play To. */
  @js.native
  abstract class PlayToSourceDeferral ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceDeferral {
    /** Ends the deferral. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Represents a request to connect a media element with a Play To target. */
  @js.native
  abstract class PlayToSourceRequest ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequest {
    /** Gets the time limit to supply the Play To source element. */
    /* CompleteClass */
    override var deadline: Date = js.native
    /**
      * Displays an error message in the Play To UI.
      * @param errorString The error message to display in the Play To UI.
      */
    /* CompleteClass */
    override def displayErrorString(errorString: String): Unit = js.native
    /**
      * Defers connecting a media source to a Play To target.
      * @return A deferral object that you can use to identify when the deferral is complete.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceDeferral = js.native
    /**
      * Sets the source element to connect to the Play To target.
      * @param value The source element to connect to the Play To target.
      */
    /* CompleteClass */
    override def setSource(value: typings.winrtUwp.Windows.Media.PlayTo.PlayToSource): Unit = js.native
  }
  
  /** Provides information about the SourceRequested event. */
  @js.native
  abstract class PlayToSourceRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequestedEventArgs {
    /** Gets the media object to connect to a Play To target. */
    /* CompleteClass */
    override var sourceRequest: typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequest = js.native
  }
  
  /** Provides information about the SourceSelected event. */
  @js.native
  abstract class PlayToSourceSelectedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceSelectedEventArgs {
    /** Gets the display name of the selected Play To source. */
    /* CompleteClass */
    override var friendlyName: String = js.native
    /** Gets the display icon for the selected Play To source. */
    /* CompleteClass */
    override var icon: IRandomAccessStreamWithContentType = js.native
    /** Gets a value that indicates whether the selected Play To source supports audio. */
    /* CompleteClass */
    override var supportsAudio: Boolean = js.native
    /** Gets a value that indicates whether the selected Play To source supports displaying images. */
    /* CompleteClass */
    override var supportsImage: Boolean = js.native
    /** Gets a value that indicates whether the selected Play To source supports video. */
    /* CompleteClass */
    override var supportsVideo: Boolean = js.native
  }
  
  /** Provides information about the PlaybackRateChangeRequested event. */
  @js.native
  abstract class PlaybackRateChangeRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs {
    /** Gets the new playback rate. */
    /* CompleteClass */
    override var rate: Double = js.native
  }
  
  /** Provides information about the SourceChangeRequested event. */
  @js.native
  abstract class SourceChangeRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.SourceChangeRequestedEventArgs {
    /** Gets the name of the album that contains the song in the audio stream. */
    /* CompleteClass */
    override var album: String = js.native
    /** Gets the author of the content in the media stream. */
    /* CompleteClass */
    override var author: String = js.native
    /** Gets the date that the content in the media stream was published. */
    /* CompleteClass */
    override var date: Date = js.native
    /** Gets the description of the content in the media stream. */
    /* CompleteClass */
    override var description: String = js.native
    /** Gets the names of the genres that the content in the media stream belongs to. */
    /* CompleteClass */
    override var genre: String = js.native
    /** Gets custom property names and values for the content in the media stream. */
    /* CompleteClass */
    override var properties: IMapView[String, _] = js.native
    /** Gets the rating for the content in the media stream. */
    /* CompleteClass */
    override var rating: Double = js.native
    /** Gets the media stream for the Play To receiver. */
    /* CompleteClass */
    override var stream: IRandomAccessStreamWithContentType = js.native
    /** Gets the thumbnail image for the content in the media stream. */
    /* CompleteClass */
    override var thumbnail: IRandomAccessStreamReference = js.native
    /** Gets the title of the content in the media stream. */
    /* CompleteClass */
    override var title: String = js.native
  }
  
  /** Provides information about the VolumeChangeRequested event. */
  @js.native
  abstract class VolumeChangeRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Media.PlayTo.VolumeChangeRequestedEventArgs {
    /** Gets the new volume level. */
    /* CompleteClass */
    override var volume: Double = js.native
  }
  
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

