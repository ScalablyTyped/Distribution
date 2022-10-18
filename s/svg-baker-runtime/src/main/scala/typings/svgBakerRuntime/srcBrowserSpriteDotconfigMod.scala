package typings.svgBakerRuntime

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserSpriteDotconfigMod extends Shortcut {
  
  @JSImport("svg-baker-runtime/src/browser-sprite.config", JSImport.Default)
  @js.native
  val default: BrowserSpriteConfig = js.native
  
  trait BrowserSpriteConfig extends StObject {
    
    /**
      * Should following options be automatically configured:
      * - `syncUrlsWithBaseTag`
      * - `locationChangeAngularEmitter`
      * - `moveGradientsOutsideSymbol`
      * @default true
      */
    var autoConfigure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should sprite listen custom location change event
      * @default true
      */
    var listenLocationChangeEvent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Emit location change event in Angular automatically
      * @default {false}
      */
    var locationChangeAngularEmitter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom window event name which should be emitted to update sprite urls
      * @default 'locationChange'
      */
    var locationChangeEvent: js.UndefOr[String] = js.undefined
    
    /**
      * Mounting selector
      * @default 'body'
      */
    var mountTo: js.UndefOr[String] = js.undefined
    
    /**
      * Fix Firefox bug when gradients and patterns don't work if they are within a symbol.
      * Executes when sprite is rendered, but not mounted.
      * @see https://bugzilla.mozilla.org/show_bug.cgi?id=306674
      * @see https://bugzilla.mozilla.org/show_bug.cgi?id=353575
      * @see https://bugzilla.mozilla.org/show_bug.cgi?id=1235364
      * @default false
      */
    var moveGradientsOutsideSymbol: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fix disappearing SVG elements when <base href> exists.
      * Executes when sprite mounted.
      * @see http://stackoverflow.com/a/18265336/796152
      * @see https://github.com/everdimension/angular-svg-base-fix
      * @see https://github.com/angular/angular.js/issues/8934#issuecomment-56568466
      * @default false
      */
    var syncUrlsWithBaseTag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Selector to find symbols usages when updating sprite urls
      * @default 'use[*|href]'
      */
    var usagesToUpdate: js.UndefOr[String] = js.undefined
  }
  object BrowserSpriteConfig {
    
    inline def apply(): BrowserSpriteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserSpriteConfig]
    }
    
    extension [Self <: BrowserSpriteConfig](x: Self) {
      
      inline def setAutoConfigure(value: Boolean): Self = StObject.set(x, "autoConfigure", value.asInstanceOf[js.Any])
      
      inline def setAutoConfigureUndefined: Self = StObject.set(x, "autoConfigure", js.undefined)
      
      inline def setListenLocationChangeEvent(value: Boolean): Self = StObject.set(x, "listenLocationChangeEvent", value.asInstanceOf[js.Any])
      
      inline def setListenLocationChangeEventUndefined: Self = StObject.set(x, "listenLocationChangeEvent", js.undefined)
      
      inline def setLocationChangeAngularEmitter(value: Boolean): Self = StObject.set(x, "locationChangeAngularEmitter", value.asInstanceOf[js.Any])
      
      inline def setLocationChangeAngularEmitterUndefined: Self = StObject.set(x, "locationChangeAngularEmitter", js.undefined)
      
      inline def setLocationChangeEvent(value: String): Self = StObject.set(x, "locationChangeEvent", value.asInstanceOf[js.Any])
      
      inline def setLocationChangeEventUndefined: Self = StObject.set(x, "locationChangeEvent", js.undefined)
      
      inline def setMountTo(value: String): Self = StObject.set(x, "mountTo", value.asInstanceOf[js.Any])
      
      inline def setMountToUndefined: Self = StObject.set(x, "mountTo", js.undefined)
      
      inline def setMoveGradientsOutsideSymbol(value: Boolean): Self = StObject.set(x, "moveGradientsOutsideSymbol", value.asInstanceOf[js.Any])
      
      inline def setMoveGradientsOutsideSymbolUndefined: Self = StObject.set(x, "moveGradientsOutsideSymbol", js.undefined)
      
      inline def setSyncUrlsWithBaseTag(value: Boolean): Self = StObject.set(x, "syncUrlsWithBaseTag", value.asInstanceOf[js.Any])
      
      inline def setSyncUrlsWithBaseTagUndefined: Self = StObject.set(x, "syncUrlsWithBaseTag", js.undefined)
      
      inline def setUsagesToUpdate(value: String): Self = StObject.set(x, "usagesToUpdate", value.asInstanceOf[js.Any])
      
      inline def setUsagesToUpdateUndefined: Self = StObject.set(x, "usagesToUpdate", js.undefined)
    }
  }
  
  type _To = BrowserSpriteConfig
  
  /* This means you don't have to write `default`, but can instead just say `srcBrowserSpriteDotconfigMod.foo` */
  override def _to: BrowserSpriteConfig = default
}
