package typings.webicon.svgCumulativeIconSetOptionsMod

import typings.webicon.iconSetOptionsMod.IconSetOptions
import typings.webicon.urlConfigMod.UrlConfig
import typings.webicon.webiconBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgCumulativeIconSetOptions extends IconSetOptions {
  @JSName("cumulative")
  var cumulative_SvgCumulativeIconSetOptions: `true`
  /**
    * The amount of miliseconds to wait before downloading the icons.
    */
  var waitDuration: js.UndefOr[Double] = js.undefined
}

object SvgCumulativeIconSetOptions {
  @scala.inline
  def apply(
    cumulative: `true`,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    iconSize: js.UndefOr[Double] = js.undefined,
    size: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null,
    viewBox: String = null,
    waitDuration: js.UndefOr[Double] = js.undefined
  ): SvgCumulativeIconSetOptions = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (!js.isUndefined(waitDuration)) __obj.updateDynamic("waitDuration")(waitDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgCumulativeIconSetOptions]
  }
}

