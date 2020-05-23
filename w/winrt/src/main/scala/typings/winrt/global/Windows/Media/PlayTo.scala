package typings.winrt.global.Windows.Media

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionError
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionState
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.PlayTo")
@js.native
object PlayTo extends js.Object {
  @js.native
  class CurrentTimeChangeRequestedEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs {
    /* CompleteClass */
    override var time: Double = js.native
  }
  
  @js.native
  class MuteChangeRequestedEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.MuteChangeRequestedEventArgs {
    /* CompleteClass */
    override var mute: Boolean = js.native
  }
  
  @js.native
  class PlayToConnection ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToConnection {
    /* CompleteClass */
    override var onerror: js.Any = js.native
    /* CompleteClass */
    override var onstatechanged: js.Any = js.native
    /* CompleteClass */
    override var ontransferred: js.Any = js.native
    /* CompleteClass */
    override var state: PlayToConnectionState = js.native
  }
  
  @js.native
  class PlayToConnectionErrorEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToConnectionErrorEventArgs {
    /* CompleteClass */
    override var code: PlayToConnectionError = js.native
    /* CompleteClass */
    override var message: String = js.native
  }
  
  @js.native
  class PlayToConnectionStateChangedEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs {
    /* CompleteClass */
    override var currentState: PlayToConnectionState = js.native
    /* CompleteClass */
    override var previousState: PlayToConnectionState = js.native
  }
  
  @js.native
  class PlayToConnectionTransferredEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs {
    /* CompleteClass */
    override var currentSource: typings.winrt.Windows.Media.PlayTo.PlayToSource = js.native
    /* CompleteClass */
    override var previousSource: typings.winrt.Windows.Media.PlayTo.PlayToSource = js.native
  }
  
  @js.native
  class PlayToManager ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToManager {
    /* CompleteClass */
    override var defaultSourceSelection: Boolean = js.native
    /* CompleteClass */
    override var onsourcerequested: js.Any = js.native
    /* CompleteClass */
    override var onsourceselected: js.Any = js.native
  }
  
  @js.native
  class PlayToReceiver ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToReceiver {
    /* CompleteClass */
    override var friendlyName: String = js.native
    /* CompleteClass */
    override var oncurrenttimechangerequested: js.Any = js.native
    /* CompleteClass */
    override var onmutechangerequested: js.Any = js.native
    /* CompleteClass */
    override var onpauserequested: js.Any = js.native
    /* CompleteClass */
    override var onplaybackratechangerequested: js.Any = js.native
    /* CompleteClass */
    override var onplayrequested: js.Any = js.native
    /* CompleteClass */
    override var onsourcechangerequested: js.Any = js.native
    /* CompleteClass */
    override var onstoprequested: js.Any = js.native
    /* CompleteClass */
    override var ontimeupdaterequested: js.Any = js.native
    /* CompleteClass */
    override var onvolumechangerequested: js.Any = js.native
    /* CompleteClass */
    override var properties: IPropertySet = js.native
    /* CompleteClass */
    override var supportsAudio: Boolean = js.native
    /* CompleteClass */
    override var supportsImage: Boolean = js.native
    /* CompleteClass */
    override var supportsVideo: Boolean = js.native
    /* CompleteClass */
    override def notifyDurationChange(duration: Double): Unit = js.native
    /* CompleteClass */
    override def notifyEnded(): Unit = js.native
    /* CompleteClass */
    override def notifyError(): Unit = js.native
    /* CompleteClass */
    override def notifyLoadedMetadata(): Unit = js.native
    /* CompleteClass */
    override def notifyPaused(): Unit = js.native
    /* CompleteClass */
    override def notifyPlaying(): Unit = js.native
    /* CompleteClass */
    override def notifyRateChange(rate: Double): Unit = js.native
    /* CompleteClass */
    override def notifySeeked(): Unit = js.native
    /* CompleteClass */
    override def notifySeeking(): Unit = js.native
    /* CompleteClass */
    override def notifyStopped(): Unit = js.native
    /* CompleteClass */
    override def notifyTimeUpdate(currentTime: Double): Unit = js.native
    /* CompleteClass */
    override def notifyVolumeChange(volume: Double, mute: Boolean): Unit = js.native
    /* CompleteClass */
    override def startAsync(): IAsyncAction = js.native
    /* CompleteClass */
    override def stopAsync(): IAsyncAction = js.native
  }
  
  @js.native
  class PlayToSource ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToSource {
    /* CompleteClass */
    override var connection: typings.winrt.Windows.Media.PlayTo.PlayToConnection = js.native
    /* CompleteClass */
    override var next: typings.winrt.Windows.Media.PlayTo.PlayToSource = js.native
    /* CompleteClass */
    override def playNext(): Unit = js.native
  }
  
  @js.native
  class PlayToSourceDeferral ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToSourceDeferral {
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @js.native
  class PlayToSourceRequest ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToSourceRequest {
    /* CompleteClass */
    override var deadline: Date = js.native
    /* CompleteClass */
    override def displayErrorString(errorString: String): Unit = js.native
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.Media.PlayTo.PlayToSourceDeferral = js.native
    /* CompleteClass */
    override def setSource(value: typings.winrt.Windows.Media.PlayTo.PlayToSource): Unit = js.native
  }
  
  @js.native
  class PlayToSourceRequestedEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToSourceRequestedEventArgs {
    /* CompleteClass */
    override var sourceRequest: typings.winrt.Windows.Media.PlayTo.PlayToSourceRequest = js.native
  }
  
  @js.native
  class PlayToSourceSelectedEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.PlayToSourceSelectedEventArgs {
    /* CompleteClass */
    override var friendlyName: String = js.native
    /* CompleteClass */
    override var icon: IRandomAccessStreamWithContentType = js.native
    /* CompleteClass */
    override var supportsAudio: Boolean = js.native
    /* CompleteClass */
    override var supportsImage: Boolean = js.native
    /* CompleteClass */
    override var supportsVideo: Boolean = js.native
  }
  
  @js.native
  class PlaybackRateChangeRequestedEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs {
    /* CompleteClass */
    override var rate: Double = js.native
  }
  
  @js.native
  class SourceChangeRequestedEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.SourceChangeRequestedEventArgs {
    /* CompleteClass */
    override var album: String = js.native
    /* CompleteClass */
    override var author: String = js.native
    /* CompleteClass */
    override var date: Date = js.native
    /* CompleteClass */
    override var description: String = js.native
    /* CompleteClass */
    override var genre: String = js.native
    /* CompleteClass */
    override var properties: IMapView[String, _] = js.native
    /* CompleteClass */
    override var rating: Double = js.native
    /* CompleteClass */
    override var stream: IRandomAccessStreamWithContentType = js.native
    /* CompleteClass */
    override var thumbnail: IRandomAccessStreamReference = js.native
    /* CompleteClass */
    override var title: String = js.native
  }
  
  @js.native
  class VolumeChangeRequestedEventArgs ()
    extends typings.winrt.Windows.Media.PlayTo.VolumeChangeRequestedEventArgs {
    /* CompleteClass */
    override var volume: Double = js.native
  }
  
  @js.native
  object PlayToConnectionError extends js.Object {
    /* 2 */ val deviceError: typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceError with Double = js.native
    /* 3 */ val deviceLocked: typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceLocked with Double = js.native
    /* 1 */ val deviceNotResponding: typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceNotResponding with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.PlayTo.PlayToConnectionError with Double] = js.native
  }
  
  @js.native
  object PlayToConnectionState extends js.Object {
    /* 1 */ val connected: typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.connected with Double = js.native
    /* 0 */ val disconnected: typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.disconnected with Double = js.native
    /* 2 */ val rendering: typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.rendering with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.PlayTo.PlayToConnectionState with Double] = js.native
  }
  
  /* static members */
  @js.native
  object PlayToManager extends js.Object {
    def getForCurrentView(): typings.winrt.Windows.Media.PlayTo.PlayToManager = js.native
    def showPlayToUI(): Unit = js.native
  }
  
}

