package typings
package webiconLib.iconOptionsImageIconOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageIconOptions
  extends webiconLib.iconOptionsStoreableMod.Storeable

object ImageIconOptions {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null,
    iconIdResolver: /* id */ java.lang.String => java.lang.String = null,
    preloadable: js.UndefOr[scala.Boolean] = js.undefined,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: webiconLib.webUrlConfigMod.UrlConfig[scala.Nothing] = null
  ): ImageIconOptions = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconIdResolver != null) __obj.updateDynamic("iconIdResolver")(js.Any.fromFunction1(iconIdResolver))
    if (!js.isUndefined(preloadable)) __obj.updateDynamic("preloadable")(preloadable)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageIconOptions]
  }
}

