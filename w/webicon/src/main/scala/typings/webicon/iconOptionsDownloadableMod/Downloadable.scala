package typings.webicon.iconOptionsDownloadableMod

import typings.webicon.iconIconMod.Icon
import typings.webicon.webUrlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Downloadable[TUriParam] extends Icon {
  /**
    * An alias of the `url`-property.
    */
  var uri: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any
  ] = js.undefined
  /**
    * The url to load the source from.
    */
  var url: js.UndefOr[UrlConfig[TUriParam]] = js.undefined
}

object Downloadable {
  @scala.inline
  def apply[TUriParam](
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[TUriParam] = null
  ): Downloadable[TUriParam] = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadable[TUriParam]]
  }
}

