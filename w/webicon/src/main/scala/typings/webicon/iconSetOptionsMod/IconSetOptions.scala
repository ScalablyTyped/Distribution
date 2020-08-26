package typings.webicon.iconSetOptionsMod

import typings.webicon.svgIconMod.SvgIcon
import typings.webicon.urlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.webicon.iconMod.Icon because Already inherited
- typings.webicon.sizeableMod.Sizeable because Already inherited
- typings.webicon.downloadableMod.Downloadable because var conflicts: iconIdParser. Inlined url, uri
- typings.webicon.sizeableOptionsMod.SizeableOptions because var conflicts: iconSize. Inlined size, svgIconSize */ @js.native
trait IconSetOptions extends SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  /**
    * An alias of the `iconSize`-property.
    */
  var size: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.native
  /**
    * An alias of the `iconSize`-property.
    */
  var svgIconSize: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.native
  /**
    * An alias of the `url`-property.
    */
  var uri: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
  ] = js.native
  /**
    * The url to load the source from.
    */
  var url: js.UndefOr[UrlConfig[scala.Nothing]] = js.native
}

object IconSetOptions {
  @scala.inline
  def apply(): IconSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSetOptions]
  }
  @scala.inline
  implicit class IconSetOptionsOps[Self <: IconSetOptions] (val x: Self) extends AnyVal {
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
    def setCumulative(value: Boolean): Self = this.set("cumulative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCumulative: Self = this.set("cumulative", js.undefined)
    @scala.inline
    def setSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSvgIconSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
    ): Self = this.set("svgIconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgIconSize: Self = this.set("svgIconSize", js.undefined)
    @scala.inline
    def setUri(value: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setUrl(value: UrlConfig[scala.Nothing]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

