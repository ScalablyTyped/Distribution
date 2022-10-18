package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError
import typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports the streaming of audio, video, and images to remote devices. */
object PlayTo {
  
  /** Provides information about the CurrentTimeChangeRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs")
  @js.native
  open class CurrentTimeChangeRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs {
    
    /** Gets the new time that the Play To source audio or video stream has been changed to. */
    /* CompleteClass */
    var time: Double = js.native
  }
  
  /** Provides information about the MuteChangeRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.MuteChangeRequestedEventArgs")
  @js.native
  open class MuteChangeRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.MuteChangeRequestedEventArgs {
    
    /** Gets a value that indicates whether mute or unmute was requested. */
    /* CompleteClass */
    var mute: Boolean = js.native
  }
  
  /** Provides information about a Play To connection. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToConnection")
  @js.native
  open class PlayToConnection ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToConnection
  
  /** Describes an error on a Play To connection. */
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
  @js.native
  object PlayToConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError & Double] = js.native
    
    /* 2 */ val deviceError: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.deviceError & Double = js.native
    
    /* 3 */ val deviceLocked: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.deviceLocked & Double = js.native
    
    /* 1 */ val deviceNotResponding: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.deviceNotResponding & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.none & Double = js.native
    
    /* 4 */ val protectedPlaybackFailed: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionError.protectedPlaybackFailed & Double = js.native
  }
  
  /** Provides information about the Error event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToConnectionErrorEventArgs")
  @js.native
  open class PlayToConnectionErrorEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionErrorEventArgs {
    
    /** Gets the error code for a Play To connection error. */
    /* CompleteClass */
    var code: PlayToConnectionError = js.native
    
    /** Gets the error message for a Play To connection error. */
    /* CompleteClass */
    var message: String = js.native
  }
  
  /** Describes the status of a Play To connection. */
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
  @js.native
  object PlayToConnectionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState & Double] = js.native
    
    /* 1 */ val connected: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState.connected & Double = js.native
    
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState.disconnected & Double = js.native
    
    /* 2 */ val rendering: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionState.rendering & Double = js.native
  }
  
  /** Provides information about the StateChanged event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs")
  @js.native
  open class PlayToConnectionStateChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs {
    
    /** Gets the current state after the Play To connection state has changed. */
    /* CompleteClass */
    var currentState: PlayToConnectionState = js.native
    
    /** Gets the previous state before the Play To connection state was changed. */
    /* CompleteClass */
    var previousState: PlayToConnectionState = js.native
  }
  
  /** Provides information about the Transferred event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs")
  @js.native
  open class PlayToConnectionTransferredEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs {
    
    /** Gets the current Play To source that a connection was transferred to. */
    /* CompleteClass */
    var currentSource: typings.winrtUwp.Windows.Media.PlayTo.PlayToSource = js.native
    
    /** Gets the previous Play To source that a connection was transferred from. */
    /* CompleteClass */
    var previousSource: typings.winrtUwp.Windows.Media.PlayTo.PlayToSource = js.native
  }
  
  /** Provides access to Play To capabilities. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToManager")
  @js.native
  open class PlayToManager ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToManager
  object PlayToManager {
    
    @JSGlobal("Windows.Media.PlayTo.PlayToManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the Play To manager for the current view.
      * @return The Play To manager for the current view.
      */
    /* static member */
    inline def getForCurrentView(): typings.winrtUwp.Windows.Media.PlayTo.PlayToManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.Media.PlayTo.PlayToManager]
    
    /** Displays the Play To UI. */
    /* static member */
    inline def showPlayToUI(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showPlayToUI")().asInstanceOf[Unit]
  }
  
  /** Represents a Play To target. */
  @JSGlobal("Windows.Media.PlayTo.PlayToReceiver")
  @js.native
  /** Creates a new instance of a Play To receiver. */
  open class PlayToReceiver ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToReceiver
  
  /** Represents a media element to connect to a Play To target. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToSource")
  @js.native
  open class PlayToSource ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToSource {
    
    /** Gets the connection to the Play To target. */
    /* CompleteClass */
    var connection: typings.winrtUwp.Windows.Media.PlayTo.PlayToConnection = js.native
    
    /** Gets or sets the next Play To source element. */
    /* CompleteClass */
    var next: typings.winrtUwp.Windows.Media.PlayTo.PlayToSource = js.native
    
    /** Connects the next Play To source element to the Play To target. */
    /* CompleteClass */
    override def playNext(): Unit = js.native
    
    /** Specifies a preferred Uniform Resource Identifier (URI) for the media stream, such as a cloud based media server, used is used for Play To by reference. */
    /* CompleteClass */
    var preferredSourceUri: Uri = js.native
  }
  
  /** Represents a deferred operation when you're supplying a source media element for Play To. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToSourceDeferral")
  @js.native
  open class PlayToSourceDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceDeferral {
    
    /** Ends the deferral. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Represents a request to connect a media element with a Play To target. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequest")
  @js.native
  open class PlayToSourceRequest ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequest {
    
    /** Gets the time limit to supply the Play To source element. */
    /* CompleteClass */
    var deadline: js.Date = js.native
    
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
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequestedEventArgs")
  @js.native
  open class PlayToSourceRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequestedEventArgs {
    
    /** Gets the media object to connect to a Play To target. */
    /* CompleteClass */
    var sourceRequest: typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceRequest = js.native
  }
  
  /** Provides information about the SourceSelected event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlayToSourceSelectedEventArgs")
  @js.native
  open class PlayToSourceSelectedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlayToSourceSelectedEventArgs {
    
    /** Gets the display name of the selected Play To source. */
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /** Gets the display icon for the selected Play To source. */
    /* CompleteClass */
    var icon: IRandomAccessStreamWithContentType = js.native
    
    /** Gets a value that indicates whether the selected Play To source supports audio. */
    /* CompleteClass */
    var supportsAudio: Boolean = js.native
    
    /** Gets a value that indicates whether the selected Play To source supports displaying images. */
    /* CompleteClass */
    var supportsImage: Boolean = js.native
    
    /** Gets a value that indicates whether the selected Play To source supports video. */
    /* CompleteClass */
    var supportsVideo: Boolean = js.native
  }
  
  /** Provides information about the PlaybackRateChangeRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs")
  @js.native
  open class PlaybackRateChangeRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs {
    
    /** Gets the new playback rate. */
    /* CompleteClass */
    var rate: Double = js.native
  }
  
  /** Provides information about the SourceChangeRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.SourceChangeRequestedEventArgs")
  @js.native
  open class SourceChangeRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.SourceChangeRequestedEventArgs {
    
    /** Gets the name of the album that contains the song in the audio stream. */
    /* CompleteClass */
    var album: String = js.native
    
    /** Gets the author of the content in the media stream. */
    /* CompleteClass */
    var author: String = js.native
    
    /** Gets the date that the content in the media stream was published. */
    /* CompleteClass */
    var date: js.Date = js.native
    
    /** Gets the description of the content in the media stream. */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets the names of the genres that the content in the media stream belongs to. */
    /* CompleteClass */
    var genre: String = js.native
    
    /** Gets custom property names and values for the content in the media stream. */
    /* CompleteClass */
    var properties: IMapView[String, Any] = js.native
    
    /** Gets the rating for the content in the media stream. */
    /* CompleteClass */
    var rating: Double = js.native
    
    /** Gets the media stream for the Play To receiver. */
    /* CompleteClass */
    var stream: IRandomAccessStreamWithContentType = js.native
    
    /** Gets the thumbnail image for the content in the media stream. */
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
    
    /** Gets the title of the content in the media stream. */
    /* CompleteClass */
    var title: String = js.native
  }
  
  /** Provides information about the VolumeChangeRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.PlayTo.VolumeChangeRequestedEventArgs")
  @js.native
  open class VolumeChangeRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.PlayTo.VolumeChangeRequestedEventArgs {
    
    /** Gets the new volume level. */
    /* CompleteClass */
    var volume: Double = js.native
  }
}
