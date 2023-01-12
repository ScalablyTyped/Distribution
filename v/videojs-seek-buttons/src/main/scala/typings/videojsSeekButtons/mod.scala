package typings.videojsSeekButtons

import typings.videojsSeekButtons.videojsSeekButtonsStrings.back
import typings.videojsSeekButtons.videojsSeekButtonsStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A video.js plugin.
    *
    * In the plugin function, the value of `this` is a video.js `Player`
    * instance. You cannot rely on the player being in a "ready" state here,
    * depending on how the plugin is invoked. This may or may not be important
    * to you; if not, remove the wait for "ready"!
    *
    * @param     [options={}]
    *           An object of options left to the plugin author to define.
    */
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("videojs-seek-buttons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.Button * / any */ @JSImport("videojs-seek-buttons", "SeekButton")
  @js.native
  open class SeekButton protected () extends StObject {
    /**
      * Constructor for class
      *
      * @param player The player
      * @param options Button options
      */
    def this(player: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.Player */ Any) = this()
    def this(
      player: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.Player */ Any,
      options: SeekButtonOptions
    ) = this()
    
    /**
      * Return button class names which include the seek amount.
      *
      * @return css class string
      */
    def buildCSSClass(): String = js.native
    
    /**
      * Seek with the button's configured offset
      */
    def handleClick(): Unit = js.native
  }
  
  @JSImport("videojs-seek-buttons", "VERSION")
  @js.native
  val VERSION: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof videojs.VERSION */ Any = js.native
  
  trait Options extends StObject {
    
    /**
      * if a number greater than 0, a seek back button will be added which seeks that number of seconds
      */
    var back: js.UndefOr[Double] = js.undefined
    
    /**
      * the position in the control bar to insert the button
      * @default 1
      */
    var backIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * if a number greater than 0, a seek forward button will be added which seeks that number of seconds
      */
    var forward: js.UndefOr[Double] = js.undefined
    
    /**
      * the position in the control bar to insert the button.
      * @default 1
      */
    var forwardIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBack(value: Double): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      inline def setBackIndex(value: Double): Self = StObject.set(x, "backIndex", value.asInstanceOf[js.Any])
      
      inline def setBackIndexUndefined: Self = StObject.set(x, "backIndex", js.undefined)
      
      inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
      
      inline def setForward(value: Double): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      inline def setForwardIndex(value: Double): Self = StObject.set(x, "forwardIndex", value.asInstanceOf[js.Any])
      
      inline def setForwardIndexUndefined: Self = StObject.set(x, "forwardIndex", js.undefined)
      
      inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    }
  }
  
  trait SeekButtonOptions extends StObject {
    
    var direction: forward | back
    
    var seconds: Double
  }
  object SeekButtonOptions {
    
    inline def apply(direction: forward | back, seconds: Double): SeekButtonOptions = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeekButtonOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeekButtonOptions] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: forward | back): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object videoJsAugmentingMod {
    
    trait VideoJsPlayer extends StObject {
      
      var seekButtons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof seekButtons */ Any
    }
    object VideoJsPlayer {
      
      inline def apply(
        seekButtons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof seekButtons */ Any
      ): VideoJsPlayer = {
        val __obj = js.Dynamic.literal(seekButtons = seekButtons.asInstanceOf[js.Any])
        __obj.asInstanceOf[VideoJsPlayer]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: VideoJsPlayer] (val x: Self) extends AnyVal {
        
        inline def setSeekButtons(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof seekButtons */ Any): Self = StObject.set(x, "seekButtons", value.asInstanceOf[js.Any])
      }
    }
    
    trait VideoJsPlayerPluginOptions extends StObject {
      
      var seekButtons: js.UndefOr[Options] = js.undefined
    }
    object VideoJsPlayerPluginOptions {
      
      inline def apply(): VideoJsPlayerPluginOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoJsPlayerPluginOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: VideoJsPlayerPluginOptions] (val x: Self) extends AnyVal {
        
        inline def setSeekButtons(value: Options): Self = StObject.set(x, "seekButtons", value.asInstanceOf[js.Any])
        
        inline def setSeekButtonsUndefined: Self = StObject.set(x, "seekButtons", js.undefined)
      }
    }
  }
}
