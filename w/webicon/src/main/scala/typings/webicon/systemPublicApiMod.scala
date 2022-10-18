package typings.webicon

import typings.webicon.iconCssClassConfigMod.CssClassConfig
import typings.webicon.iconCssIconSetMod.CssIconSet
import typings.webicon.iconImageIconMod.ImageIcon
import typings.webicon.iconSvgCumulativeIconSetMod.SvgCumulativeIconSet
import typings.webicon.iconSvgIconMod.SvgIcon
import typings.webicon.iconSvgIconSetMod.SvgIconSet
import typings.webicon.systemIconLoadedEventHandlerMod.IconLoadedEventHandler
import typings.webicon.systemInjectorMod.Injector
import typings.webicon.webUrlConfigMod.UrlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemPublicApiMod {
  
  @js.native
  trait PublicApi extends StObject {
    
    /**
      * An alias of the `defaultSource`-method.
      */
    var default: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultSource'] */ js.Any = js.native
    
    /**
      * Adds a link to the `alias` icon-set.
      *
      * @param id
      * The id which links to the `alias`.
      *
      * @param alias
      * The id of the icon-set to refer to.
      */
    def alias(id: String, alias: String): this.type = js.native
    
    /**
      * Adds a default svg-set.
      *
      * @param url
      * The url to the default svg-set to use.
      *
      * @param options
      * Additional options for the svg-set.
      */
    def defaultIconSetUrl(url: String): this.type = js.native
    def defaultIconSetUrl(url: String, options: SvgCumulativeIconSet): this.type = js.native
    def defaultIconSetUrl(url: String, options: SvgIconSet): this.type = js.native
    
    /**
      * Sets a default icon-set.
      *
      * @param id
      * The id of the default icon-set.
      */
    def defaultSource(id: String): this.type = js.native
    
    /**
      * An alias of the `defaultSvgSetUrl`-method.
      */
    var defaultSvgIconSetUrl: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any = js.native
    
    /**
      * Sets the default icon-size for svg-icons.
      *
      * @param size
      * The default svg icon-size.
      */
    def defaultSvgIconSize(size: Double): this.type = js.native
    
    /**
      * An alias of the `defaultSvgSetUrl`-method.
      */
    var defaultSvgSetUrl: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any = js.native
    
    /**
      * Adds a font icon-set.
      *
      * @param id
      * The id of the icon-set to add.
      *
      * @param cssClassConfig
      * The css-class to add to icons.
      *
      * @param options
      * Additional options for the icon-set.
      */
    def font(id: String, cssClassConfig: CssClassConfig): this.type = js.native
    def font(id: String, cssClassConfig: CssClassConfig, options: CssIconSet): this.type = js.native
    
    /**
      * Adds a new icon.
      *
      * @param id
      * The id of the icon to add.
      *
      * @param urlConfig
      * The url to download the icon from.
      *
      * @param options
      * Additional options for the icon.
      */
    def icon(id: String, urlConfig: UrlConfig[Unit]): this.type = js.native
    def icon(id: String, urlConfig: UrlConfig[Unit], options: ImageIcon): this.type = js.native
    def icon(id: String, urlConfig: UrlConfig[Unit], options: SvgIcon): this.type = js.native
    
    /**
      * An alias of the `svgSet`-method.
      */
    var iconSet: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSet'] */ js.Any = js.native
    
    /**
      * Preloads the icons.
      *
      * @param eventHandler
      * A callback for handling the icon-loader `Promise`.
      */
    def preload(): this.type = js.native
    def preload(eventHandler: IconLoadedEventHandler): this.type = js.native
    /**
      * Preloads the icons.
      *
      * @param names
      * Either a value indicating whether to preload all icons or the names of the icons to preload.
      *
      * @param eventHandler
      * A callback for handling the icon-loader `Promise`.
      */
    def preload(names: String): this.type = js.native
    def preload(names: String, eventHandler: IconLoadedEventHandler): this.type = js.native
    def preload(names: js.Array[String]): this.type = js.native
    def preload(names: js.Array[String], eventHandler: IconLoadedEventHandler): this.type = js.native
    def preload(names: Boolean): this.type = js.native
    def preload(names: Boolean, eventHandler: IconLoadedEventHandler): this.type = js.native
    
    /**
      * Adds an event-handler to the `ready`-event.
      *
      * @param eventHandler
      * THe event-handler for handling the `ready`-event.
      */
    def ready(eventHandler: js.Function1[/* injector */ Injector, Unit]): this.type = js.native
    
    /**
      * An alias of the `alias`-method.
      */
    var sourceAlias: /* import warning: importer.ImportType#apply Failed type conversion: this['alias'] */ js.Any = js.native
    
    /**
      * Adds a sprite icon-set.
      *
      * @param id
      * The id of the icon-set to add.
      *
      * @param cssClassConfig
      * The css-class to add to icons.
      *
      * @param options
      * Additional options for the icon-set.
      */
    def sprite(id: String, cssClassConfig: CssClassConfig): this.type = js.native
    def sprite(id: String, cssClassConfig: CssClassConfig, options: CssIconSet): this.type = js.native
    
    /**
      * Adds an icon-set.
      *
      * @param id
      * The id of the icon-set to add.
      *
      * @param urlConfig
      * The url to download the icon-set from.
      *
      * @param options
      * Additional options for the icon-set.
      */
    def svgSet(id: String, urlConfig: UrlConfig[js.Array[String] | Unit]): this.type = js.native
    def svgSet(id: String, urlConfig: UrlConfig[js.Array[String]], options: SvgCumulativeIconSet): this.type = js.native
    def svgSet(id: String, urlConfig: UrlConfig[Unit], options: SvgIconSet): this.type = js.native
  }
}
