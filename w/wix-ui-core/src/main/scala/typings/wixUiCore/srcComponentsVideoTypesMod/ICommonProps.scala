package typings.wixUiCore.srcComponentsVideoTypesMod

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
  
  inline def apply(id: String, src: String | js.Array[String]): ICommonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommonProps]
  }
  
  extension [Self <: ICommonProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHideOverlay(value: Boolean): Self = StObject.set(x, "hideOverlay", value.asInstanceOf[js.Any])
    
    inline def setHideOverlayUndefined: Self = StObject.set(x, "hideOverlay", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsResponsiveMode(value: Boolean): Self = StObject.set(x, "isResponsiveMode", value.asInstanceOf[js.Any])
    
    inline def setIsResponsiveModeUndefined: Self = StObject.set(x, "isResponsiveMode", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setOnDuration(value: js.Function): Self = StObject.set(x, "onDuration", value.asInstanceOf[js.Any])
    
    inline def setOnDurationUndefined: Self = StObject.set(x, "onDuration", js.undefined)
    
    inline def setOnEnded(value: js.Function): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: js.Function): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFirstEnded(value: js.Function): Self = StObject.set(x, "onFirstEnded", value.asInstanceOf[js.Any])
    
    inline def setOnFirstEndedUndefined: Self = StObject.set(x, "onFirstEnded", js.undefined)
    
    inline def setOnFirstPlay(value: js.Function): Self = StObject.set(x, "onFirstPlay", value.asInstanceOf[js.Any])
    
    inline def setOnFirstPlayUndefined: Self = StObject.set(x, "onFirstPlay", js.undefined)
    
    inline def setOnInit(value: (/* player */ js.Any, /* playerName */ PlayerNameType) => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction2(value))
    
    inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    inline def setOnPause(value: js.Function): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: js.Function): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnProgress(value: js.Function): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnReady(value: js.Function): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    inline def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
