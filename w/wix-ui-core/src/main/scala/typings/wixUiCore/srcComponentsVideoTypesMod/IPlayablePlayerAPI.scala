package typings.wixUiCore.srcComponentsVideoTypesMod

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayablePlayerAPI
  extends StObject
     with IPlayerAPI {
  
  var attachToElement: js.UndefOr[js.Function1[/* el */ HTMLDivElement, Unit]] = js.undefined
  
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var getCurrentTime: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var getDuration: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var getElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  
  var hideFullScreenControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hidePictureInPictureControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hidePlayControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hideProgressControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hideTimeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hideTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hideVolumeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var isMuted: js.UndefOr[Boolean] = js.undefined
  
  var mute: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var on: js.UndefOr[js.Function2[/* event */ String, /* fn */ js.UndefOr[js.Function], Unit]] = js.undefined
  
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var seekTo: js.UndefOr[js.Function1[/* amount */ Double, Unit]] = js.undefined
  
  var setAlwaysShowLogo: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.undefined
  
  var setLogo: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
  
  var setLogoClickCallback: js.UndefOr[js.Function1[/* cb */ js.Function, Unit]] = js.undefined
  
  var setVolume: js.UndefOr[js.Function1[/* fraction */ Double, Unit]] = js.undefined
  
  var showFullScreenControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showPictureInPictureControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showPlayControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showProgressControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showTimeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var showVolumeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var unmute: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IPlayablePlayerAPI {
  
  @scala.inline
  def apply(): IPlayablePlayerAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlayablePlayerAPI]
  }
  
  @scala.inline
  implicit class IPlayablePlayerAPIMutableBuilder[Self <: IPlayablePlayerAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachToElement(value: /* el */ HTMLDivElement => Unit): Self = StObject.set(x, "attachToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttachToElementUndefined: Self = StObject.set(x, "attachToElement", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setGetCurrentTime(value: () => Double): Self = StObject.set(x, "getCurrentTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTimeUndefined: Self = StObject.set(x, "getCurrentTime", js.undefined)
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
    
    @scala.inline
    def setHideFullScreenControl(value: () => Unit): Self = StObject.set(x, "hideFullScreenControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideFullScreenControlUndefined: Self = StObject.set(x, "hideFullScreenControl", js.undefined)
    
    @scala.inline
    def setHidePictureInPictureControl(value: () => Unit): Self = StObject.set(x, "hidePictureInPictureControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHidePictureInPictureControlUndefined: Self = StObject.set(x, "hidePictureInPictureControl", js.undefined)
    
    @scala.inline
    def setHidePlayControl(value: () => Unit): Self = StObject.set(x, "hidePlayControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHidePlayControlUndefined: Self = StObject.set(x, "hidePlayControl", js.undefined)
    
    @scala.inline
    def setHideProgressControl(value: () => Unit): Self = StObject.set(x, "hideProgressControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideProgressControlUndefined: Self = StObject.set(x, "hideProgressControl", js.undefined)
    
    @scala.inline
    def setHideTimeControl(value: () => Unit): Self = StObject.set(x, "hideTimeControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideTimeControlUndefined: Self = StObject.set(x, "hideTimeControl", js.undefined)
    
    @scala.inline
    def setHideTitle(value: () => Unit): Self = StObject.set(x, "hideTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideTitleUndefined: Self = StObject.set(x, "hideTitle", js.undefined)
    
    @scala.inline
    def setHideVolumeControl(value: () => Unit): Self = StObject.set(x, "hideVolumeControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideVolumeControlUndefined: Self = StObject.set(x, "hideVolumeControl", js.undefined)
    
    @scala.inline
    def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMutedUndefined: Self = StObject.set(x, "isMuted", js.undefined)
    
    @scala.inline
    def setMute(value: () => Unit): Self = StObject.set(x, "mute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    @scala.inline
    def setOn(value: (/* event */ String, /* fn */ js.UndefOr[js.Function]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSeekTo(value: /* amount */ Double => Unit): Self = StObject.set(x, "seekTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeekToUndefined: Self = StObject.set(x, "seekTo", js.undefined)
    
    @scala.inline
    def setSetAlwaysShowLogo(value: /* show */ Boolean => Unit): Self = StObject.set(x, "setAlwaysShowLogo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAlwaysShowLogoUndefined: Self = StObject.set(x, "setAlwaysShowLogo", js.undefined)
    
    @scala.inline
    def setSetLogo(value: /* url */ String => Unit): Self = StObject.set(x, "setLogo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLogoClickCallback(value: /* cb */ js.Function => Unit): Self = StObject.set(x, "setLogoClickCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLogoClickCallbackUndefined: Self = StObject.set(x, "setLogoClickCallback", js.undefined)
    
    @scala.inline
    def setSetLogoUndefined: Self = StObject.set(x, "setLogo", js.undefined)
    
    @scala.inline
    def setSetVolume(value: /* fraction */ Double => Unit): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVolumeUndefined: Self = StObject.set(x, "setVolume", js.undefined)
    
    @scala.inline
    def setShowFullScreenControl(value: () => Unit): Self = StObject.set(x, "showFullScreenControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowFullScreenControlUndefined: Self = StObject.set(x, "showFullScreenControl", js.undefined)
    
    @scala.inline
    def setShowPictureInPictureControl(value: () => Unit): Self = StObject.set(x, "showPictureInPictureControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPictureInPictureControlUndefined: Self = StObject.set(x, "showPictureInPictureControl", js.undefined)
    
    @scala.inline
    def setShowPlayControl(value: () => Unit): Self = StObject.set(x, "showPlayControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPlayControlUndefined: Self = StObject.set(x, "showPlayControl", js.undefined)
    
    @scala.inline
    def setShowProgressControl(value: () => Unit): Self = StObject.set(x, "showProgressControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowProgressControlUndefined: Self = StObject.set(x, "showProgressControl", js.undefined)
    
    @scala.inline
    def setShowTimeControl(value: () => Unit): Self = StObject.set(x, "showTimeControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowTimeControlUndefined: Self = StObject.set(x, "showTimeControl", js.undefined)
    
    @scala.inline
    def setShowTitle(value: () => Unit): Self = StObject.set(x, "showTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    @scala.inline
    def setShowVolumeControl(value: () => Unit): Self = StObject.set(x, "showVolumeControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowVolumeControlUndefined: Self = StObject.set(x, "showVolumeControl", js.undefined)
    
    @scala.inline
    def setUnmute(value: () => Unit): Self = StObject.set(x, "unmute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnmuteUndefined: Self = StObject.set(x, "unmute", js.undefined)
  }
}
