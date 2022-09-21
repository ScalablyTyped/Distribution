package typings.videojsMobileUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A video.js plugin.
    *
    * Adds a mobile UI for player control, and fullscreen orientation control
    */
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("videojs-mobile-ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("videojs-mobile-ui", "VERSION")
  @js.native
  val VERSION: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof videojs.VERSION */ Any = js.native
  
  trait FullscreenOptions extends StObject {
    
    /**
      * Whether to go fullscreen when rotating to landscape
      * @default true
      */
    var enterOnRotate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to leave fullscreen when rotating to portrait (if not locked)
      * @default true
      */
    var exitOnRotate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to disable iOS's native fullscreen so controls can work
      * @default false
      */
    var iOS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to lock orientation when rotating to landscape
      *           Unlocked when exiting fullscreen or on 'ended'
      * @default true
      */
    var lockOnRotate: js.UndefOr[Boolean] = js.undefined
  }
  object FullscreenOptions {
    
    inline def apply(): FullscreenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullscreenOptions]
    }
    
    extension [Self <: FullscreenOptions](x: Self) {
      
      inline def setEnterOnRotate(value: Boolean): Self = StObject.set(x, "enterOnRotate", value.asInstanceOf[js.Any])
      
      inline def setEnterOnRotateUndefined: Self = StObject.set(x, "enterOnRotate", js.undefined)
      
      inline def setExitOnRotate(value: Boolean): Self = StObject.set(x, "exitOnRotate", value.asInstanceOf[js.Any])
      
      inline def setExitOnRotateUndefined: Self = StObject.set(x, "exitOnRotate", js.undefined)
      
      inline def setIOS(value: Boolean): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
      
      inline def setIOSUndefined: Self = StObject.set(x, "iOS", js.undefined)
      
      inline def setLockOnRotate(value: Boolean): Self = StObject.set(x, "lockOnRotate", value.asInstanceOf[js.Any])
      
      inline def setLockOnRotateUndefined: Self = StObject.set(x, "lockOnRotate", js.undefined)
    }
  }
  
  /**
    * Plugin options.
    */
  trait Options extends StObject {
    
    /**
      * Enables the display regardless of user agent, for testing purposes
      * @default false
      */
    var forceForTesting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fullscreen options
      */
    var fullscreen: js.UndefOr[FullscreenOptions] = js.undefined
    
    /**
      * Touch UI options.
      */
    var touchControls: js.UndefOr[TouchControlsOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setForceForTesting(value: Boolean): Self = StObject.set(x, "forceForTesting", value.asInstanceOf[js.Any])
      
      inline def setForceForTestingUndefined: Self = StObject.set(x, "forceForTesting", js.undefined)
      
      inline def setFullscreen(value: FullscreenOptions): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setTouchControls(value: TouchControlsOptions): Self = StObject.set(x, "touchControls", value.asInstanceOf[js.Any])
      
      inline def setTouchControlsUndefined: Self = StObject.set(x, "touchControls", js.undefined)
    }
  }
  
  trait TouchControlsOptions extends StObject {
    
    /**
      * Whether to disable when the video ends (e.g., if there is an endscreen)
      *           Never shows if the endscreen plugin is present
      * @default false
      */
    var disableOnEnd: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of seconds to seek on double-tap
      * @default 10
      */
    var seekSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * Interval in ms to be considered a doubletap
      * @default 300
      */
    var tapTimeout: js.UndefOr[Double] = js.undefined
  }
  object TouchControlsOptions {
    
    inline def apply(): TouchControlsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TouchControlsOptions]
    }
    
    extension [Self <: TouchControlsOptions](x: Self) {
      
      inline def setDisableOnEnd(value: Boolean): Self = StObject.set(x, "disableOnEnd", value.asInstanceOf[js.Any])
      
      inline def setDisableOnEndUndefined: Self = StObject.set(x, "disableOnEnd", js.undefined)
      
      inline def setSeekSeconds(value: Double): Self = StObject.set(x, "seekSeconds", value.asInstanceOf[js.Any])
      
      inline def setSeekSecondsUndefined: Self = StObject.set(x, "seekSeconds", js.undefined)
      
      inline def setTapTimeout(value: Double): Self = StObject.set(x, "tapTimeout", value.asInstanceOf[js.Any])
      
      inline def setTapTimeoutUndefined: Self = StObject.set(x, "tapTimeout", js.undefined)
    }
  }
  
  /* augmented module */
  object videoJsAugmentingMod {
    
    trait VideoJsPlayer extends StObject {
      
      var mobileUi: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof mobileUi */ Any
    }
    object VideoJsPlayer {
      
      inline def apply(mobileUi: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof mobileUi */ Any): VideoJsPlayer = {
        val __obj = js.Dynamic.literal(mobileUi = mobileUi.asInstanceOf[js.Any])
        __obj.asInstanceOf[VideoJsPlayer]
      }
      
      extension [Self <: VideoJsPlayer](x: Self) {
        
        inline def setMobileUi(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof mobileUi */ Any): Self = StObject.set(x, "mobileUi", value.asInstanceOf[js.Any])
      }
    }
  }
}
