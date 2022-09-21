package typings.winrt.Windows.Media.PlayTo

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToReceiver extends StObject {
  
  var friendlyName: String
  
  def notifyDurationChange(duration: Double): Unit
  
  def notifyEnded(): Unit
  
  def notifyError(): Unit
  
  def notifyLoadedMetadata(): Unit
  
  def notifyPaused(): Unit
  
  def notifyPlaying(): Unit
  
  def notifyRateChange(rate: Double): Unit
  
  def notifySeeked(): Unit
  
  def notifySeeking(): Unit
  
  def notifyStopped(): Unit
  
  def notifyTimeUpdate(currentTime: Double): Unit
  
  def notifyVolumeChange(volume: Double, mute: Boolean): Unit
  
  var oncurrenttimechangerequested: Any
  
  var onmutechangerequested: Any
  
  var onpauserequested: Any
  
  var onplaybackratechangerequested: Any
  
  var onplayrequested: Any
  
  var onsourcechangerequested: Any
  
  var onstoprequested: Any
  
  var ontimeupdaterequested: Any
  
  var onvolumechangerequested: Any
  
  var properties: IPropertySet
  
  def startAsync(): IAsyncAction
  
  def stopAsync(): IAsyncAction
  
  var supportsAudio: Boolean
  
  var supportsImage: Boolean
  
  var supportsVideo: Boolean
}
object IPlayToReceiver {
  
  inline def apply(
    friendlyName: String,
    notifyDurationChange: Double => Unit,
    notifyEnded: () => Unit,
    notifyError: () => Unit,
    notifyLoadedMetadata: () => Unit,
    notifyPaused: () => Unit,
    notifyPlaying: () => Unit,
    notifyRateChange: Double => Unit,
    notifySeeked: () => Unit,
    notifySeeking: () => Unit,
    notifyStopped: () => Unit,
    notifyTimeUpdate: Double => Unit,
    notifyVolumeChange: (Double, Boolean) => Unit,
    oncurrenttimechangerequested: Any,
    onmutechangerequested: Any,
    onpauserequested: Any,
    onplaybackratechangerequested: Any,
    onplayrequested: Any,
    onsourcechangerequested: Any,
    onstoprequested: Any,
    ontimeupdaterequested: Any,
    onvolumechangerequested: Any,
    properties: IPropertySet,
    startAsync: () => IAsyncAction,
    stopAsync: () => IAsyncAction,
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): IPlayToReceiver = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], notifyDurationChange = js.Any.fromFunction1(notifyDurationChange), notifyEnded = js.Any.fromFunction0(notifyEnded), notifyError = js.Any.fromFunction0(notifyError), notifyLoadedMetadata = js.Any.fromFunction0(notifyLoadedMetadata), notifyPaused = js.Any.fromFunction0(notifyPaused), notifyPlaying = js.Any.fromFunction0(notifyPlaying), notifyRateChange = js.Any.fromFunction1(notifyRateChange), notifySeeked = js.Any.fromFunction0(notifySeeked), notifySeeking = js.Any.fromFunction0(notifySeeking), notifyStopped = js.Any.fromFunction0(notifyStopped), notifyTimeUpdate = js.Any.fromFunction1(notifyTimeUpdate), notifyVolumeChange = js.Any.fromFunction2(notifyVolumeChange), oncurrenttimechangerequested = oncurrenttimechangerequested.asInstanceOf[js.Any], onmutechangerequested = onmutechangerequested.asInstanceOf[js.Any], onpauserequested = onpauserequested.asInstanceOf[js.Any], onplaybackratechangerequested = onplaybackratechangerequested.asInstanceOf[js.Any], onplayrequested = onplayrequested.asInstanceOf[js.Any], onsourcechangerequested = onsourcechangerequested.asInstanceOf[js.Any], onstoprequested = onstoprequested.asInstanceOf[js.Any], ontimeupdaterequested = ontimeupdaterequested.asInstanceOf[js.Any], onvolumechangerequested = onvolumechangerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], startAsync = js.Any.fromFunction0(startAsync), stopAsync = js.Any.fromFunction0(stopAsync), supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToReceiver]
  }
  
  extension [Self <: IPlayToReceiver](x: Self) {
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setNotifyDurationChange(value: Double => Unit): Self = StObject.set(x, "notifyDurationChange", js.Any.fromFunction1(value))
    
    inline def setNotifyEnded(value: () => Unit): Self = StObject.set(x, "notifyEnded", js.Any.fromFunction0(value))
    
    inline def setNotifyError(value: () => Unit): Self = StObject.set(x, "notifyError", js.Any.fromFunction0(value))
    
    inline def setNotifyLoadedMetadata(value: () => Unit): Self = StObject.set(x, "notifyLoadedMetadata", js.Any.fromFunction0(value))
    
    inline def setNotifyPaused(value: () => Unit): Self = StObject.set(x, "notifyPaused", js.Any.fromFunction0(value))
    
    inline def setNotifyPlaying(value: () => Unit): Self = StObject.set(x, "notifyPlaying", js.Any.fromFunction0(value))
    
    inline def setNotifyRateChange(value: Double => Unit): Self = StObject.set(x, "notifyRateChange", js.Any.fromFunction1(value))
    
    inline def setNotifySeeked(value: () => Unit): Self = StObject.set(x, "notifySeeked", js.Any.fromFunction0(value))
    
    inline def setNotifySeeking(value: () => Unit): Self = StObject.set(x, "notifySeeking", js.Any.fromFunction0(value))
    
    inline def setNotifyStopped(value: () => Unit): Self = StObject.set(x, "notifyStopped", js.Any.fromFunction0(value))
    
    inline def setNotifyTimeUpdate(value: Double => Unit): Self = StObject.set(x, "notifyTimeUpdate", js.Any.fromFunction1(value))
    
    inline def setNotifyVolumeChange(value: (Double, Boolean) => Unit): Self = StObject.set(x, "notifyVolumeChange", js.Any.fromFunction2(value))
    
    inline def setOncurrenttimechangerequested(value: Any): Self = StObject.set(x, "oncurrenttimechangerequested", value.asInstanceOf[js.Any])
    
    inline def setOnmutechangerequested(value: Any): Self = StObject.set(x, "onmutechangerequested", value.asInstanceOf[js.Any])
    
    inline def setOnpauserequested(value: Any): Self = StObject.set(x, "onpauserequested", value.asInstanceOf[js.Any])
    
    inline def setOnplaybackratechangerequested(value: Any): Self = StObject.set(x, "onplaybackratechangerequested", value.asInstanceOf[js.Any])
    
    inline def setOnplayrequested(value: Any): Self = StObject.set(x, "onplayrequested", value.asInstanceOf[js.Any])
    
    inline def setOnsourcechangerequested(value: Any): Self = StObject.set(x, "onsourcechangerequested", value.asInstanceOf[js.Any])
    
    inline def setOnstoprequested(value: Any): Self = StObject.set(x, "onstoprequested", value.asInstanceOf[js.Any])
    
    inline def setOntimeupdaterequested(value: Any): Self = StObject.set(x, "ontimeupdaterequested", value.asInstanceOf[js.Any])
    
    inline def setOnvolumechangerequested(value: Any): Self = StObject.set(x, "onvolumechangerequested", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setStartAsync(value: () => IAsyncAction): Self = StObject.set(x, "startAsync", js.Any.fromFunction0(value))
    
    inline def setStopAsync(value: () => IAsyncAction): Self = StObject.set(x, "stopAsync", js.Any.fromFunction0(value))
    
    inline def setSupportsAudio(value: Boolean): Self = StObject.set(x, "supportsAudio", value.asInstanceOf[js.Any])
    
    inline def setSupportsImage(value: Boolean): Self = StObject.set(x, "supportsImage", value.asInstanceOf[js.Any])
    
    inline def setSupportsVideo(value: Boolean): Self = StObject.set(x, "supportsVideo", value.asInstanceOf[js.Any])
  }
}
