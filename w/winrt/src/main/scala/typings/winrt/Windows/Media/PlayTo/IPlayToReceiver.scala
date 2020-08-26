package typings.winrt.Windows.Media.PlayTo

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToReceiver extends js.Object {
  var friendlyName: String = js.native
  var oncurrenttimechangerequested: js.Any = js.native
  var onmutechangerequested: js.Any = js.native
  var onpauserequested: js.Any = js.native
  var onplaybackratechangerequested: js.Any = js.native
  var onplayrequested: js.Any = js.native
  var onsourcechangerequested: js.Any = js.native
  var onstoprequested: js.Any = js.native
  var ontimeupdaterequested: js.Any = js.native
  var onvolumechangerequested: js.Any = js.native
  var properties: IPropertySet = js.native
  var supportsAudio: Boolean = js.native
  var supportsImage: Boolean = js.native
  var supportsVideo: Boolean = js.native
  def notifyDurationChange(duration: Double): Unit = js.native
  def notifyEnded(): Unit = js.native
  def notifyError(): Unit = js.native
  def notifyLoadedMetadata(): Unit = js.native
  def notifyPaused(): Unit = js.native
  def notifyPlaying(): Unit = js.native
  def notifyRateChange(rate: Double): Unit = js.native
  def notifySeeked(): Unit = js.native
  def notifySeeking(): Unit = js.native
  def notifyStopped(): Unit = js.native
  def notifyTimeUpdate(currentTime: Double): Unit = js.native
  def notifyVolumeChange(volume: Double, mute: Boolean): Unit = js.native
  def startAsync(): IAsyncAction = js.native
  def stopAsync(): IAsyncAction = js.native
}

object IPlayToReceiver {
  @scala.inline
  def apply(
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
    oncurrenttimechangerequested: js.Any,
    onmutechangerequested: js.Any,
    onpauserequested: js.Any,
    onplaybackratechangerequested: js.Any,
    onplayrequested: js.Any,
    onsourcechangerequested: js.Any,
    onstoprequested: js.Any,
    ontimeupdaterequested: js.Any,
    onvolumechangerequested: js.Any,
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
  @scala.inline
  implicit class IPlayToReceiverOps[Self <: IPlayToReceiver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyDurationChange(value: Double => Unit): Self = this.set("notifyDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyEnded(value: () => Unit): Self = this.set("notifyEnded", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyError(value: () => Unit): Self = this.set("notifyError", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyLoadedMetadata(value: () => Unit): Self = this.set("notifyLoadedMetadata", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyPaused(value: () => Unit): Self = this.set("notifyPaused", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyPlaying(value: () => Unit): Self = this.set("notifyPlaying", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyRateChange(value: Double => Unit): Self = this.set("notifyRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifySeeked(value: () => Unit): Self = this.set("notifySeeked", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifySeeking(value: () => Unit): Self = this.set("notifySeeking", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyStopped(value: () => Unit): Self = this.set("notifyStopped", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyTimeUpdate(value: Double => Unit): Self = this.set("notifyTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyVolumeChange(value: (Double, Boolean) => Unit): Self = this.set("notifyVolumeChange", js.Any.fromFunction2(value))
    @scala.inline
    def setOncurrenttimechangerequested(value: js.Any): Self = this.set("oncurrenttimechangerequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmutechangerequested(value: js.Any): Self = this.set("onmutechangerequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpauserequested(value: js.Any): Self = this.set("onpauserequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnplaybackratechangerequested(value: js.Any): Self = this.set("onplaybackratechangerequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnplayrequested(value: js.Any): Self = this.set("onplayrequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsourcechangerequested(value: js.Any): Self = this.set("onsourcechangerequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnstoprequested(value: js.Any): Self = this.set("onstoprequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOntimeupdaterequested(value: js.Any): Self = this.set("ontimeupdaterequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnvolumechangerequested(value: js.Any): Self = this.set("onvolumechangerequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAsync(value: () => IAsyncAction): Self = this.set("startAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setStopAsync(value: () => IAsyncAction): Self = this.set("stopAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setSupportsAudio(value: Boolean): Self = this.set("supportsAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsImage(value: Boolean): Self = this.set("supportsImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsVideo(value: Boolean): Self = this.set("supportsVideo", value.asInstanceOf[js.Any])
  }
  
}

