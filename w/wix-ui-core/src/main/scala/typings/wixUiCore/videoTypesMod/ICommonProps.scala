package typings.wixUiCore.videoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommonProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  /** hook for testing purposes */
  var `data-hook`: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var hideOverlay: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var isResponsiveMode: js.UndefOr[Boolean] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var muted: js.UndefOr[Boolean] = js.undefined
  
  var onDuration: js.UndefOr[js.Function] = js.undefined
  
  var onEnded: js.UndefOr[js.Function] = js.undefined
  
  var onError: js.UndefOr[js.Function] = js.undefined
  
  var onFirstEnded: js.UndefOr[js.Function] = js.undefined
  
  var onFirstPlay: js.UndefOr[js.Function] = js.undefined
  
  var onInit: js.UndefOr[js.Function2[/* player */ js.Any, /* playerName */ PlayerNameType, Unit]] = js.undefined
  
  var onPause: js.UndefOr[js.Function] = js.undefined
  
  var onPlay: js.UndefOr[js.Function] = js.undefined
  
  var onProgress: js.UndefOr[js.Function] = js.undefined
  
  var onReady: js.UndefOr[js.Function] = js.undefined
  
  var playing: js.UndefOr[Boolean] = js.undefined
  
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  var src: String | js.Array[String]
  
  var volume: js.UndefOr[Double] = js.undefined
}
object ICommonProps {
  
  @scala.inline
  def apply(id: String, src: String | js.Array[String]): ICommonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommonProps]
  }
  
  @scala.inline
  implicit class ICommonPropsMutableBuilder[Self <: ICommonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHideOverlay(value: Boolean): Self = StObject.set(x, "hideOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOverlayUndefined: Self = StObject.set(x, "hideOverlay", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResponsiveMode(value: Boolean): Self = StObject.set(x, "isResponsiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResponsiveModeUndefined: Self = StObject.set(x, "isResponsiveMode", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setOnDuration(value: js.Function): Self = StObject.set(x, "onDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDurationUndefined: Self = StObject.set(x, "onDuration", js.undefined)
    
    @scala.inline
    def setOnEnded(value: js.Function): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: js.Function): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFirstEnded(value: js.Function): Self = StObject.set(x, "onFirstEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFirstEndedUndefined: Self = StObject.set(x, "onFirstEnded", js.undefined)
    
    @scala.inline
    def setOnFirstPlay(value: js.Function): Self = StObject.set(x, "onFirstPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFirstPlayUndefined: Self = StObject.set(x, "onFirstPlay", js.undefined)
    
    @scala.inline
    def setOnInit(value: (/* player */ js.Any, /* playerName */ PlayerNameType) => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    @scala.inline
    def setOnPause(value: js.Function): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: js.Function): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnProgress(value: js.Function): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnReady(value: js.Function): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    @scala.inline
    def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
