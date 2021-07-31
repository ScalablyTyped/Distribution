package typings.winrt.global.Windows.Media

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionError
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionState
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlayTo {
  
  @JSGlobal("Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs")
  @js.native
  class CurrentTimeChangeRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs {
    
    /* CompleteClass */
    var time: Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.MuteChangeRequestedEventArgs")
  @js.native
  class MuteChangeRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.MuteChangeRequestedEventArgs {
    
    /* CompleteClass */
    var mute: Boolean = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnection")
  @js.native
  class PlayToConnection ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToConnection {
    
    /* CompleteClass */
    var onerror: js.Any = js.native
    
    /* CompleteClass */
    var onstatechanged: js.Any = js.native
    
    /* CompleteClass */
    var ontransferred: js.Any = js.native
    
    /* CompleteClass */
    var state: PlayToConnectionState = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
  @js.native
  object PlayToConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.PlayTo.PlayToConnectionError & Double] = js.native
    
    /* 2 */ val deviceError: typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceError & Double = js.native
    
    /* 3 */ val deviceLocked: typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceLocked & Double = js.native
    
    /* 1 */ val deviceNotResponding: typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceNotResponding & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.none & Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionErrorEventArgs")
  @js.native
  class PlayToConnectionErrorEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToConnectionErrorEventArgs {
    
    /* CompleteClass */
    var code: PlayToConnectionError = js.native
    
    /* CompleteClass */
    var message: String = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
  @js.native
  object PlayToConnectionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.PlayTo.PlayToConnectionState & Double] = js.native
    
    /* 1 */ val connected: typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.connected & Double = js.native
    
    /* 0 */ val disconnected: typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.disconnected & Double = js.native
    
    /* 2 */ val rendering: typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.rendering & Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs")
  @js.native
  class PlayToConnectionStateChangedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs {
    
    /* CompleteClass */
    var currentState: PlayToConnectionState = js.native
    
    /* CompleteClass */
    var previousState: PlayToConnectionState = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs")
  @js.native
  class PlayToConnectionTransferredEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs {
    
    /* CompleteClass */
    var currentSource: typings.winrt.Windows.Media.PlayTo.PlayToSource = js.native
    
    /* CompleteClass */
    var previousSource: typings.winrt.Windows.Media.PlayTo.PlayToSource = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToManager")
  @js.native
  class PlayToManager ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToManager {
    
    /* CompleteClass */
    var defaultSourceSelection: Boolean = js.native
    
    /* CompleteClass */
    var onsourcerequested: js.Any = js.native
    
    /* CompleteClass */
    var onsourceselected: js.Any = js.native
  }
  /* static members */
  object PlayToManager {
    
    @JSGlobal("Windows.Media.PlayTo.PlayToManager")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getForCurrentView(): typings.winrt.Windows.Media.PlayTo.PlayToManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.Media.PlayTo.PlayToManager]
    
    @scala.inline
    def showPlayToUI(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showPlayToUI")().asInstanceOf[Unit]
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToReceiver")
  @js.native
  class PlayToReceiver ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToReceiver {
    
    /* CompleteClass */
    var friendlyName: String = js.native
    
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
    var oncurrenttimechangerequested: js.Any = js.native
    
    /* CompleteClass */
    var onmutechangerequested: js.Any = js.native
    
    /* CompleteClass */
    var onpauserequested: js.Any = js.native
    
    /* CompleteClass */
    var onplaybackratechangerequested: js.Any = js.native
    
    /* CompleteClass */
    var onplayrequested: js.Any = js.native
    
    /* CompleteClass */
    var onsourcechangerequested: js.Any = js.native
    
    /* CompleteClass */
    var onstoprequested: js.Any = js.native
    
    /* CompleteClass */
    var ontimeupdaterequested: js.Any = js.native
    
    /* CompleteClass */
    var onvolumechangerequested: js.Any = js.native
    
    /* CompleteClass */
    var properties: IPropertySet = js.native
    
    /* CompleteClass */
    override def startAsync(): IAsyncAction = js.native
    
    /* CompleteClass */
    override def stopAsync(): IAsyncAction = js.native
    
    /* CompleteClass */
    var supportsAudio: Boolean = js.native
    
    /* CompleteClass */
    var supportsImage: Boolean = js.native
    
    /* CompleteClass */
    var supportsVideo: Boolean = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSource")
  @js.native
  class PlayToSource ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToSource {
    
    /* CompleteClass */
    var connection: typings.winrt.Windows.Media.PlayTo.PlayToConnection = js.native
    
    /* CompleteClass */
    var next: typings.winrt.Windows.Media.PlayTo.PlayToSource = js.native
    
    /* CompleteClass */
    override def playNext(): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceDeferral")
  @js.native
  class PlayToSourceDeferral ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToSourceDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequest")
  @js.native
  class PlayToSourceRequest ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToSourceRequest {
    
    /* CompleteClass */
    var deadline: Date = js.native
    
    /* CompleteClass */
    override def displayErrorString(errorString: String): Unit = js.native
    
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.Media.PlayTo.PlayToSourceDeferral = js.native
    
    /* CompleteClass */
    override def setSource(value: typings.winrt.Windows.Media.PlayTo.PlayToSource): Unit = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceRequestedEventArgs")
  @js.native
  class PlayToSourceRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToSourceRequestedEventArgs {
    
    /* CompleteClass */
    var sourceRequest: typings.winrt.Windows.Media.PlayTo.PlayToSourceRequest = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlayToSourceSelectedEventArgs")
  @js.native
  class PlayToSourceSelectedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlayToSourceSelectedEventArgs {
    
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /* CompleteClass */
    var icon: IRandomAccessStreamWithContentType = js.native
    
    /* CompleteClass */
    var supportsAudio: Boolean = js.native
    
    /* CompleteClass */
    var supportsImage: Boolean = js.native
    
    /* CompleteClass */
    var supportsVideo: Boolean = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs")
  @js.native
  class PlaybackRateChangeRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.PlaybackRateChangeRequestedEventArgs {
    
    /* CompleteClass */
    var rate: Double = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.SourceChangeRequestedEventArgs")
  @js.native
  class SourceChangeRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.SourceChangeRequestedEventArgs {
    
    /* CompleteClass */
    var album: String = js.native
    
    /* CompleteClass */
    var author: String = js.native
    
    /* CompleteClass */
    var date: Date = js.native
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var genre: String = js.native
    
    /* CompleteClass */
    var properties: IMapView[String, js.Any] = js.native
    
    /* CompleteClass */
    var rating: Double = js.native
    
    /* CompleteClass */
    var stream: IRandomAccessStreamWithContentType = js.native
    
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.Media.PlayTo.VolumeChangeRequestedEventArgs")
  @js.native
  class VolumeChangeRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Media.PlayTo.VolumeChangeRequestedEventArgs {
    
    /* CompleteClass */
    var volume: Double = js.native
  }
}
