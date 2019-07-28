package typings.webicon.iconOptionsStoreableMod

import typings.webicon.iconOptionsDownloadableMod.Downloadable
import typings.webicon.webUrlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storeable
  extends Downloadable[scala.Nothing] {
  /**
    * Resolves the id of the underlying source.
    *
    * @param id
    * The underlying id of the source.
    *
    * @return
    * The resolved id of the source.
    */
  var iconIdResolver: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  /**
    * A value indicating whether the source is preloadable.
    */
  var preloadable: js.UndefOr[Boolean] = js.undefined
}

object Storeable {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    iconIdResolver: /* id */ String => String = null,
    preloadable: js.UndefOr[Boolean] = js.undefined,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null
  ): Storeable = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconIdResolver != null) __obj.updateDynamic("iconIdResolver")(js.Any.fromFunction1(iconIdResolver))
    if (!js.isUndefined(preloadable)) __obj.updateDynamic("preloadable")(preloadable)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Storeable]
  }
}

