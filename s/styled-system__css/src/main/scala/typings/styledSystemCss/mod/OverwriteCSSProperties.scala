package typings.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverwriteCSSProperties extends js.Object {
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the
    * element, blur and spread radii, and color.
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  |  **4**  | **5.1** | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-shadow
    */
  var boxShadow: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ js.Any) | Double
  ] = js.native
  /**
    * The **`font-weight`** CSS property specifies the weight (or boldness) of the font. The font weights available to you will depend on the `font-family` you are using. Some fonts are only
    * available in `normal` and `bold`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-weight
    */
  var fontWeight: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ js.Any) | String
  ] = js.native
  /**
    * The **`z-index`** CSS property sets the z-order of a positioned element and its descendants or flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/z-index
    */
  var zIndex: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ js.Any) | String
  ] = js.native
}

object OverwriteCSSProperties {
  @scala.inline
  def apply(): OverwriteCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverwriteCSSProperties]
  }
  @scala.inline
  implicit class OverwriteCSSPropertiesOps[Self <: OverwriteCSSProperties] (val x: Self) extends AnyVal {
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
    def setBoxShadow(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ js.Any) | Double
    ): Self = this.set("boxShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxShadow: Self = this.set("boxShadow", js.undefined)
    @scala.inline
    def setFontWeight(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ js.Any) | String
    ): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setZIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ js.Any) | String
    ): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

