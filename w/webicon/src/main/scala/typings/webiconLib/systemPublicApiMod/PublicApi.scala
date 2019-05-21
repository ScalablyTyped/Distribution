package typings
package webiconLib.systemPublicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicApi extends js.Object {
  /**
    * An alias of the `defaultSource`-method.
    */
  var default: /* import warning: ImportType.apply Failed type conversion: this['defaultSource'] */ js.Any = js.native
  /**
    * An alias of the `defaultSvgSetUrl`-method.
    */
  var defaultSvgIconSetUrl: /* import warning: ImportType.apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any = js.native
  /**
    * An alias of the `defaultSvgSetUrl`-method.
    */
  var defaultSvgSetUrl: /* import warning: ImportType.apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any = js.native
  /**
    * An alias of the `svgSet`-method.
    */
  var iconSet: /* import warning: ImportType.apply Failed type conversion: this['svgSet'] */ js.Any = js.native
  /**
    * An alias of the `alias`-method.
    */
  var sourceAlias: /* import warning: ImportType.apply Failed type conversion: this['alias'] */ js.Any = js.native
  /**
    * Adds a link to the `alias` icon-set.
    *
    * @param id
    * The id which links to the `alias`.
    *
    * @param alias
    * The id of the icon-set to refer to.
    */
  def alias(id: java.lang.String, alias: java.lang.String): this.type = js.native
  /**
    * Adds a default svg-set.
    *
    * @param url
    * The url to the default svg-set to use.
    *
    * @param options
    * Additional options for the svg-set.
    */
  def defaultIconSetUrl(url: java.lang.String): this.type = js.native
  def defaultIconSetUrl(url: java.lang.String, options: webiconLib.iconSvgCumulativeIconSetMod.SvgCumulativeIconSet): this.type = js.native
  def defaultIconSetUrl(url: java.lang.String, options: webiconLib.iconSvgIconSetMod.SvgIconSet): this.type = js.native
  /**
    * Sets a default icon-set.
    *
    * @param id
    * The id of the default icon-set.
    */
  def defaultSource(id: java.lang.String): this.type = js.native
  /**
    * Sets the default icon-size for svg-icons.
    *
    * @param size
    * The default svg icon-size.
    */
  def defaultSvgIconSize(size: scala.Double): this.type = js.native
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
  def font(id: java.lang.String, cssClassConfig: webiconLib.iconCssClassConfigMod.CssClassConfig): this.type = js.native
  def font(
    id: java.lang.String,
    cssClassConfig: webiconLib.iconCssClassConfigMod.CssClassConfig,
    options: webiconLib.iconCssIconSetMod.CssIconSet
  ): this.type = js.native
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
  def icon(id: java.lang.String, urlConfig: webiconLib.webUrlConfigMod.UrlConfig[js.UndefOr[scala.Nothing]]): this.type = js.native
  def icon(
    id: java.lang.String,
    urlConfig: webiconLib.webUrlConfigMod.UrlConfig[js.UndefOr[scala.Nothing]],
    options: webiconLib.iconImageIconMod.ImageIcon
  ): this.type = js.native
  def icon(
    id: java.lang.String,
    urlConfig: webiconLib.webUrlConfigMod.UrlConfig[js.UndefOr[scala.Nothing]],
    options: webiconLib.iconSvgIconMod.SvgIcon
  ): this.type = js.native
  /**
    * Preloads the icons.
    *
    * @param eventHandler
    * A callback for handling the icon-loader `Promise`.
    */
  def preload(): this.type = js.native
  def preload(eventHandler: webiconLib.systemIconLoadedEventHandlerMod.IconLoadedEventHandler): this.type = js.native
  /**
    * Preloads the icons.
    *
    * @param names
    * Either a value indicating whether to preload all icons or the names of the icons to preload.
    *
    * @param eventHandler
    * A callback for handling the icon-loader `Promise`.
    */
  def preload(names: java.lang.String): this.type = js.native
  def preload(
    names: java.lang.String,
    eventHandler: webiconLib.systemIconLoadedEventHandlerMod.IconLoadedEventHandler
  ): this.type = js.native
  def preload(names: js.Array[java.lang.String]): this.type = js.native
  def preload(
    names: js.Array[java.lang.String],
    eventHandler: webiconLib.systemIconLoadedEventHandlerMod.IconLoadedEventHandler
  ): this.type = js.native
  def preload(names: scala.Boolean): this.type = js.native
  def preload(
    names: scala.Boolean,
    eventHandler: webiconLib.systemIconLoadedEventHandlerMod.IconLoadedEventHandler
  ): this.type = js.native
  /**
    * Adds an event-handler to the `ready`-event.
    *
    * @param eventHandler
    * THe event-handler for handling the `ready`-event.
    */
  def ready(eventHandler: js.Function1[/* injector */ webiconLib.systemInjectorMod.Injector, scala.Unit]): this.type = js.native
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
  def sprite(id: java.lang.String, cssClassConfig: webiconLib.iconCssClassConfigMod.CssClassConfig): this.type = js.native
  def sprite(
    id: java.lang.String,
    cssClassConfig: webiconLib.iconCssClassConfigMod.CssClassConfig,
    options: webiconLib.iconCssIconSetMod.CssIconSet
  ): this.type = js.native
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
  def svgSet(
    id: java.lang.String,
    urlConfig: webiconLib.webUrlConfigMod.UrlConfig[js.Array[java.lang.String] | js.UndefOr[scala.Nothing]]
  ): this.type = js.native
  def svgSet(
    id: java.lang.String,
    urlConfig: webiconLib.webUrlConfigMod.UrlConfig[js.Array[java.lang.String]],
    options: webiconLib.iconSvgCumulativeIconSetMod.SvgCumulativeIconSet
  ): this.type = js.native
  def svgSet(
    id: java.lang.String,
    urlConfig: webiconLib.webUrlConfigMod.UrlConfig[js.UndefOr[scala.Nothing]],
    options: webiconLib.iconSvgIconSetMod.SvgIconSet
  ): this.type = js.native
}

