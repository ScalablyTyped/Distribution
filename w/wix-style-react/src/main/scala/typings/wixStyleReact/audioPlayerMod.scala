package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixStyleReact.wixStyleReactStrings.auto
import typings.wixStyleReact.wixStyleReactStrings.metadata
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioPlayerMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/AudioPlayer", JSImport.Default)
  @js.native
  val default: FC[AudioPlayerProps] = js.native
  
  trait AudioPlayerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoadError: js.UndefOr[js.Function1[/* errorMsg */ String, Unit]] = js.undefined
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSeek: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preload: js.UndefOr[metadata | auto | none_] = js.undefined
    
    var src: String
    
    var webAudioAPI: js.UndefOr[Boolean] = js.undefined
  }
  object AudioPlayerProps {
    
    inline def apply(src: String): AudioPlayerProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioPlayerProps]
    }
    
    extension [Self <: AudioPlayerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadError(value: /* errorMsg */ String => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
      
      inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: () => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnSeek(value: () => Unit): Self = StObject.set(x, "onSeek", js.Any.fromFunction0(value))
      
      inline def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
      
      inline def setPreload(value: metadata | auto | none_): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWebAudioAPI(value: Boolean): Self = StObject.set(x, "webAudioAPI", value.asInstanceOf[js.Any])
      
      inline def setWebAudioAPIUndefined: Self = StObject.set(x, "webAudioAPI", js.undefined)
    }
  }
  
  type _To = FC[AudioPlayerProps]
  
  /* This means you don't have to write `default`, but can instead just say `audioPlayerMod.foo` */
  override def _to: FC[AudioPlayerProps] = default
}
