package typings
package webiconLib.iconOptionsDownloadableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Downloadable[TUriParam]
  extends webiconLib.iconIconMod.Icon {
  /**
    * An alias of the `url`-property.
    */
  var uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any
  ] = js.undefined
  /**
    * The url to load the source from.
    */
  var url: js.UndefOr[webiconLib.webUrlConfigMod.UrlConfig[TUriParam]] = js.undefined
}

object Downloadable {
  @scala.inline
  def apply[TUriParam](
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null,
    uri: /* import warning: ImportType.apply Failed type conversion: this['url'] */ js.Any = null,
    url: webiconLib.webUrlConfigMod.UrlConfig[TUriParam] = null
  ): Downloadable[TUriParam] = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadable[TUriParam]]
  }
}

