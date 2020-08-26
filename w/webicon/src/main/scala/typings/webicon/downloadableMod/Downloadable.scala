package typings.webicon.downloadableMod

import typings.webicon.iconMod.Icon
import typings.webicon.urlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Downloadable[TUriParam] extends Icon {
  /**
    * An alias of the `url`-property.
    */
  var uri: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
  ] = js.native
  /**
    * The url to load the source from.
    */
  var url: js.UndefOr[UrlConfig[TUriParam]] = js.native
}

object Downloadable {
  @scala.inline
  def apply[TUriParam](): Downloadable[TUriParam] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Downloadable[TUriParam]]
  }
  @scala.inline
  implicit class DownloadableOps[Self <: Downloadable[_], TUriParam] (val x: Self with Downloadable[TUriParam]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUri(value: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setUrl(value: UrlConfig[TUriParam]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

