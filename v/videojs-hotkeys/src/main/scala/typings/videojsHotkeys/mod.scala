package typings.videojsHotkeys

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait VideoJsCustomHotkey extends StObject {
    
    def handler(
      player: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ Any,
      options: VideoJsHotkeysOptions,
      event: KeyboardEvent
    ): Unit
    
    def key(
      event: KeyboardEvent,
      player: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ Any
    ): Boolean
  }
  object VideoJsCustomHotkey {
    
    inline def apply(
      handler: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ Any, VideoJsHotkeysOptions, KeyboardEvent) => Unit,
      key: (KeyboardEvent, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ Any) => Boolean
    ): VideoJsCustomHotkey = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction3(handler), key = js.Any.fromFunction2(key))
      __obj.asInstanceOf[VideoJsCustomHotkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoJsCustomHotkey] (val x: Self) extends AnyVal {
      
      inline def setHandler(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ Any, VideoJsHotkeysOptions, KeyboardEvent) => Unit
      ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      inline def setKey(
        value: (KeyboardEvent, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ Any) => Boolean
      ): Self = StObject.set(x, "key", js.Any.fromFunction2(value))
    }
  }
  
  type VideoJsCustomHotkeyOptions = StringDictionary[VideoJsCustomHotkey]
  
  trait VideoJsHotkeysOptions extends StObject {
    
    var alwaysCaptureHotkeys: js.UndefOr[Boolean] = js.undefined
    
    var captureDocumentHotkeys: js.UndefOr[Boolean] = js.undefined
    
    var customKeys: js.UndefOr[VideoJsCustomHotkeyOptions] = js.undefined
    
    var documentHotkeysFocusElementFilter: js.UndefOr[js.Function1[/* element */ HTMLElement, Boolean]] = js.undefined
    
    var enableFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var enableHoverScroll: js.UndefOr[Boolean] = js.undefined
    
    var enableInactiveFocus: js.UndefOr[Boolean] = js.undefined
    
    var enableJogStyle: js.UndefOr[Boolean] = js.undefined
    
    var enableModifiersForNumbers: js.UndefOr[Boolean] = js.undefined
    
    var enableMute: js.UndefOr[Boolean] = js.undefined
    
    var enableNumbers: js.UndefOr[Boolean] = js.undefined
    
    var enableVolumeScroll: js.UndefOr[Boolean] = js.undefined
    
    var forwardKey: js.UndefOr[
        js.Function2[
          /* event */ KeyboardEvent, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any, 
          Boolean
        ]
      ] = js.undefined
    
    var fullscreenKey: js.UndefOr[
        js.Function2[
          /* event */ KeyboardEvent, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any, 
          Boolean
        ]
      ] = js.undefined
    
    var muteKey: js.UndefOr[
        js.Function2[
          /* event */ KeyboardEvent, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any, 
          Boolean
        ]
      ] = js.undefined
    
    var playPauseKey: js.UndefOr[
        js.Function2[
          /* event */ KeyboardEvent, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any, 
          Boolean
        ]
      ] = js.undefined
    
    var rewindKey: js.UndefOr[
        js.Function2[
          /* event */ KeyboardEvent, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any, 
          Boolean
        ]
      ] = js.undefined
    
    var seekStep: js.UndefOr[Double] = js.undefined
    
    var skipInitialFocus: js.UndefOr[Boolean] = js.undefined
    
    var volumeDownKey: js.UndefOr[
        js.Function2[
          /* event */ KeyboardEvent, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any, 
          Boolean
        ]
      ] = js.undefined
    
    var volumeStep: js.UndefOr[Double] = js.undefined
    
    var volumeUpKey: js.UndefOr[
        js.Function2[
          /* event */ KeyboardEvent, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any, 
          Boolean
        ]
      ] = js.undefined
  }
  object VideoJsHotkeysOptions {
    
    inline def apply(): VideoJsHotkeysOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoJsHotkeysOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoJsHotkeysOptions] (val x: Self) extends AnyVal {
      
      inline def setAlwaysCaptureHotkeys(value: Boolean): Self = StObject.set(x, "alwaysCaptureHotkeys", value.asInstanceOf[js.Any])
      
      inline def setAlwaysCaptureHotkeysUndefined: Self = StObject.set(x, "alwaysCaptureHotkeys", js.undefined)
      
      inline def setCaptureDocumentHotkeys(value: Boolean): Self = StObject.set(x, "captureDocumentHotkeys", value.asInstanceOf[js.Any])
      
      inline def setCaptureDocumentHotkeysUndefined: Self = StObject.set(x, "captureDocumentHotkeys", js.undefined)
      
      inline def setCustomKeys(value: VideoJsCustomHotkeyOptions): Self = StObject.set(x, "customKeys", value.asInstanceOf[js.Any])
      
      inline def setCustomKeysUndefined: Self = StObject.set(x, "customKeys", js.undefined)
      
      inline def setDocumentHotkeysFocusElementFilter(value: /* element */ HTMLElement => Boolean): Self = StObject.set(x, "documentHotkeysFocusElementFilter", js.Any.fromFunction1(value))
      
      inline def setDocumentHotkeysFocusElementFilterUndefined: Self = StObject.set(x, "documentHotkeysFocusElementFilter", js.undefined)
      
      inline def setEnableFullscreen(value: Boolean): Self = StObject.set(x, "enableFullscreen", value.asInstanceOf[js.Any])
      
      inline def setEnableFullscreenUndefined: Self = StObject.set(x, "enableFullscreen", js.undefined)
      
      inline def setEnableHoverScroll(value: Boolean): Self = StObject.set(x, "enableHoverScroll", value.asInstanceOf[js.Any])
      
      inline def setEnableHoverScrollUndefined: Self = StObject.set(x, "enableHoverScroll", js.undefined)
      
      inline def setEnableInactiveFocus(value: Boolean): Self = StObject.set(x, "enableInactiveFocus", value.asInstanceOf[js.Any])
      
      inline def setEnableInactiveFocusUndefined: Self = StObject.set(x, "enableInactiveFocus", js.undefined)
      
      inline def setEnableJogStyle(value: Boolean): Self = StObject.set(x, "enableJogStyle", value.asInstanceOf[js.Any])
      
      inline def setEnableJogStyleUndefined: Self = StObject.set(x, "enableJogStyle", js.undefined)
      
      inline def setEnableModifiersForNumbers(value: Boolean): Self = StObject.set(x, "enableModifiersForNumbers", value.asInstanceOf[js.Any])
      
      inline def setEnableModifiersForNumbersUndefined: Self = StObject.set(x, "enableModifiersForNumbers", js.undefined)
      
      inline def setEnableMute(value: Boolean): Self = StObject.set(x, "enableMute", value.asInstanceOf[js.Any])
      
      inline def setEnableMuteUndefined: Self = StObject.set(x, "enableMute", js.undefined)
      
      inline def setEnableNumbers(value: Boolean): Self = StObject.set(x, "enableNumbers", value.asInstanceOf[js.Any])
      
      inline def setEnableNumbersUndefined: Self = StObject.set(x, "enableNumbers", js.undefined)
      
      inline def setEnableVolumeScroll(value: Boolean): Self = StObject.set(x, "enableVolumeScroll", value.asInstanceOf[js.Any])
      
      inline def setEnableVolumeScrollUndefined: Self = StObject.set(x, "enableVolumeScroll", js.undefined)
      
      inline def setForwardKey(
        value: (/* event */ KeyboardEvent, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any) => Boolean
      ): Self = StObject.set(x, "forwardKey", js.Any.fromFunction2(value))
      
      inline def setForwardKeyUndefined: Self = StObject.set(x, "forwardKey", js.undefined)
      
      inline def setFullscreenKey(
        value: (/* event */ KeyboardEvent, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any) => Boolean
      ): Self = StObject.set(x, "fullscreenKey", js.Any.fromFunction2(value))
      
      inline def setFullscreenKeyUndefined: Self = StObject.set(x, "fullscreenKey", js.undefined)
      
      inline def setMuteKey(
        value: (/* event */ KeyboardEvent, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any) => Boolean
      ): Self = StObject.set(x, "muteKey", js.Any.fromFunction2(value))
      
      inline def setMuteKeyUndefined: Self = StObject.set(x, "muteKey", js.undefined)
      
      inline def setPlayPauseKey(
        value: (/* event */ KeyboardEvent, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any) => Boolean
      ): Self = StObject.set(x, "playPauseKey", js.Any.fromFunction2(value))
      
      inline def setPlayPauseKeyUndefined: Self = StObject.set(x, "playPauseKey", js.undefined)
      
      inline def setRewindKey(
        value: (/* event */ KeyboardEvent, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any) => Boolean
      ): Self = StObject.set(x, "rewindKey", js.Any.fromFunction2(value))
      
      inline def setRewindKeyUndefined: Self = StObject.set(x, "rewindKey", js.undefined)
      
      inline def setSeekStep(value: Double): Self = StObject.set(x, "seekStep", value.asInstanceOf[js.Any])
      
      inline def setSeekStepUndefined: Self = StObject.set(x, "seekStep", js.undefined)
      
      inline def setSkipInitialFocus(value: Boolean): Self = StObject.set(x, "skipInitialFocus", value.asInstanceOf[js.Any])
      
      inline def setSkipInitialFocusUndefined: Self = StObject.set(x, "skipInitialFocus", js.undefined)
      
      inline def setVolumeDownKey(
        value: (/* event */ KeyboardEvent, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any) => Boolean
      ): Self = StObject.set(x, "volumeDownKey", js.Any.fromFunction2(value))
      
      inline def setVolumeDownKeyUndefined: Self = StObject.set(x, "volumeDownKey", js.undefined)
      
      inline def setVolumeStep(value: Double): Self = StObject.set(x, "volumeStep", value.asInstanceOf[js.Any])
      
      inline def setVolumeStepUndefined: Self = StObject.set(x, "volumeStep", js.undefined)
      
      inline def setVolumeUpKey(
        value: (/* event */ KeyboardEvent, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VideoJsPlayer */ /* player */ Any) => Boolean
      ): Self = StObject.set(x, "volumeUpKey", js.Any.fromFunction2(value))
      
      inline def setVolumeUpKeyUndefined: Self = StObject.set(x, "volumeUpKey", js.undefined)
    }
  }
  
  /* augmented module */
  object videoJsAugmentingMod {
    
    @js.native
    trait VideoJsPlayer extends StObject {
      
      def hotkeys(): Unit = js.native
      def hotkeys(options: VideoJsHotkeysOptions): Unit = js.native
    }
  }
}
