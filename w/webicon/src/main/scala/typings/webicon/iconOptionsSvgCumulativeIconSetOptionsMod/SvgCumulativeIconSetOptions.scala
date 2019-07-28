package typings.webicon.iconOptionsSvgCumulativeIconSetOptionsMod

import typings.webicon.iconOptionsIconSetOptionsMod.IconSetOptions
import typings.webicon.webUrlConfigMod.UrlConfig
import typings.webicon.webiconNumbers.`true`
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
    iconSize: Int | Double = null,
    size: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: ImportType.apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null,
    viewBox: String = null,
    waitDuration: Int | Double = null
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

