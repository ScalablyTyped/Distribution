package typings.videojsHlsQualitySelector

import typings.videojsHlsQualitySelector.srcConcreteMenuItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Adds a quality selector menu for HLS sources played in videojs.
    */
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("videojs-hls-quality-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("videojs-hls-quality-selector", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  /**
    * VideoJS HLS Quality Selector Plugin class.
    */
  trait HlsQualitySelectorPlugin extends StObject {
    
    /**
      * Binds listener for quality level changes.
      */
    def bindPlayerEvents(): Unit
    
    /**
      * Adds the quality menu button to the player control bar.
      */
    def createQualityButton(): Unit
    
    /**
      * Return the current set quality or 'auto'
      */
    def getCurrentQuality(): String
    
    /**
      * Returns HLS Plugin
      *
      * @return - videojs-hls-contrib plugin.
      */
    def getHls(): Any
    
    /**
      * Builds individual quality menu items.
      *
      * @param  item - Individual quality menu item.
      * @return - Menu item
      */
    def getQualityMenuItem(item: Item): default
    
    /**
      * Executed when a quality level is added from HLS playlist.
      */
    def onAddQualityLevel(): Unit
    
    /**
      * Set inner button text.
      *
      * @param text - the text to display in the button.
      */
    def setButtonInnerText(text: String): Unit
  }
  object HlsQualitySelectorPlugin {
    
    inline def apply(
      bindPlayerEvents: () => Unit,
      createQualityButton: () => Unit,
      getCurrentQuality: () => String,
      getHls: () => Any,
      getQualityMenuItem: Item => default,
      onAddQualityLevel: () => Unit,
      setButtonInnerText: String => Unit
    ): HlsQualitySelectorPlugin = {
      val __obj = js.Dynamic.literal(bindPlayerEvents = js.Any.fromFunction0(bindPlayerEvents), createQualityButton = js.Any.fromFunction0(createQualityButton), getCurrentQuality = js.Any.fromFunction0(getCurrentQuality), getHls = js.Any.fromFunction0(getHls), getQualityMenuItem = js.Any.fromFunction1(getQualityMenuItem), onAddQualityLevel = js.Any.fromFunction0(onAddQualityLevel), setButtonInnerText = js.Any.fromFunction1(setButtonInnerText))
      __obj.asInstanceOf[HlsQualitySelectorPlugin]
    }
    
    extension [Self <: HlsQualitySelectorPlugin](x: Self) {
      
      inline def setBindPlayerEvents(value: () => Unit): Self = StObject.set(x, "bindPlayerEvents", js.Any.fromFunction0(value))
      
      inline def setCreateQualityButton(value: () => Unit): Self = StObject.set(x, "createQualityButton", js.Any.fromFunction0(value))
      
      inline def setGetCurrentQuality(value: () => String): Self = StObject.set(x, "getCurrentQuality", js.Any.fromFunction0(value))
      
      inline def setGetHls(value: () => Any): Self = StObject.set(x, "getHls", js.Any.fromFunction0(value))
      
      inline def setGetQualityMenuItem(value: Item => default): Self = StObject.set(x, "getQualityMenuItem", js.Any.fromFunction1(value))
      
      inline def setOnAddQualityLevel(value: () => Unit): Self = StObject.set(x, "onAddQualityLevel", js.Any.fromFunction0(value))
      
      inline def setSetButtonInnerText(value: String => Unit): Self = StObject.set(x, "setButtonInnerText", js.Any.fromFunction1(value))
    }
  }
  
  trait Item extends StObject {
    
    var label: String
    
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object Item {
    
    inline def apply(label: String): Item = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var displayCurrentQuality: js.UndefOr[Boolean] = js.undefined
    
    var placementIndex: js.UndefOr[Double] = js.undefined
    
    var vjsIconClass: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisplayCurrentQuality(value: Boolean): Self = StObject.set(x, "displayCurrentQuality", value.asInstanceOf[js.Any])
      
      inline def setDisplayCurrentQualityUndefined: Self = StObject.set(x, "displayCurrentQuality", js.undefined)
      
      inline def setPlacementIndex(value: Double): Self = StObject.set(x, "placementIndex", value.asInstanceOf[js.Any])
      
      inline def setPlacementIndexUndefined: Self = StObject.set(x, "placementIndex", js.undefined)
      
      inline def setVjsIconClass(value: String): Self = StObject.set(x, "vjsIconClass", value.asInstanceOf[js.Any])
      
      inline def setVjsIconClassUndefined: Self = StObject.set(x, "vjsIconClass", js.undefined)
    }
  }
  
  /* augmented module */
  object videoJsAugmentingMod {
    
    trait VideoJsPlayer extends StObject {
      
      var hlsQualitySelector: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof hlsQualitySelector */ Any
    }
    object VideoJsPlayer {
      
      inline def apply(
        hlsQualitySelector: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof hlsQualitySelector */ Any
      ): VideoJsPlayer = {
        val __obj = js.Dynamic.literal(hlsQualitySelector = hlsQualitySelector.asInstanceOf[js.Any])
        __obj.asInstanceOf[VideoJsPlayer]
      }
      
      extension [Self <: VideoJsPlayer](x: Self) {
        
        inline def setHlsQualitySelector(
          value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof hlsQualitySelector */ Any
        ): Self = StObject.set(x, "hlsQualitySelector", value.asInstanceOf[js.Any])
      }
    }
  }
}
