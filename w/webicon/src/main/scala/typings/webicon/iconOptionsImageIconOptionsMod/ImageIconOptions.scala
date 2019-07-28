package typings.webicon.iconOptionsImageIconOptionsMod

import typings.webicon.iconOptionsStoreableMod.Storeable
import typings.webicon.webUrlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageIconOptions extends Storeable

object ImageIconOptions {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    iconIdResolver: /* id */ String => String = null,
    preloadable: js.UndefOr[Boolean] = js.undefined,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null
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

