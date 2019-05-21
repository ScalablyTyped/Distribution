package typings
package webiconLib.iconOptionsSvgCumulativeIconSetOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgCumulativeIconSetOptions
  extends webiconLib.iconOptionsIconSetOptionsMod.IconSetOptions {
  @JSName("cumulative")
  var cumulative_SvgCumulativeIconSetOptions: webiconLib.webiconLibNumbers.`true`
  /**
    * The amount of miliseconds to wait before downloading the icons.
    */
  var waitDuration: js.UndefOr[scala.Double] = js.undefined
}

object SvgCumulativeIconSetOptions {
  @scala.inline
  def apply(
    cumulative: webiconLib.webiconLibNumbers.`true`,
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    size: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: webiconLib.webUrlConfigMod.UrlConfig[scala.Nothing] = null,
    viewBox: java.lang.String = null,
    waitDuration: scala.Int | scala.Double = null
  ): SvgCumulativeIconSetOptions = {
    val __obj = js.Dynamic.literal(cumulative = cumulative)
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (waitDuration != null) __obj.updateDynamic("waitDuration")(waitDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgCumulativeIconSetOptions]
  }
}

