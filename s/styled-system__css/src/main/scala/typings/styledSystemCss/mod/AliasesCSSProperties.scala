package typings.styledSystemCss.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Margin
import typings.csstype.mod.Property.MarginBottom
import typings.csstype.mod.Property.MarginLeft
import typings.csstype.mod.Property.MarginRight
import typings.csstype.mod.Property.MarginTop
import typings.csstype.mod.Property.Padding
import typings.csstype.mod.Property.PaddingBottom
import typings.csstype.mod.Property.PaddingLeft
import typings.csstype.mod.Property.PaddingRight
import typings.csstype.mod.Property.PaddingTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasesCSSProperties extends js.Object {
  /**
    * The **`background-color`** CSS property sets the background color of an element.
    *
    * **Initial value**: `transparent`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-color
    */
  var bg: js.UndefOr[BackgroundColor | js.Array[js.UndefOr[BackgroundColor]]] = js.native
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var m: js.UndefOr[(Margin[Double | String]) | (js.Array[js.UndefOr[Margin[Double | String]]])] = js.native
  /**
    * The **`marginX`** is shorthand for using both **`margin-left`** and **`margin-right`** CSS properties. They set the margin area on the left and right side of an element. A positive value
    * places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://styled-system.com/#margin-props
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var marginX: js.UndefOr[
    (MarginLeft[Double | String]) | (js.Array[js.UndefOr[MarginLeft[Double | String]]])
  ] = js.native
  /**
    * The **`marginY`** is shorthard for using both **`margin-top`** and **`margin-bottom`** CSS properties. They set the margin area on the top and bottom of an element. A positive value places
    * it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://styled-system.com/#margin-props
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var marginY: js.UndefOr[
    (MarginTop[Double | String]) | (js.Array[js.UndefOr[MarginTop[Double | String]]])
  ] = js.native
  /**
    * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var mb: js.UndefOr[
    (MarginBottom[Double | String]) | (js.Array[js.UndefOr[MarginBottom[Double | String]]])
  ] = js.native
  /**
    * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    */
  var ml: js.UndefOr[
    (MarginLeft[Double | String]) | (js.Array[js.UndefOr[MarginLeft[Double | String]]])
  ] = js.native
  /**
    * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var mr: js.UndefOr[
    (MarginRight[Double | String]) | (js.Array[js.UndefOr[MarginRight[Double | String]]])
  ] = js.native
  /**
    * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    */
  var mt: js.UndefOr[
    (MarginTop[Double | String]) | (js.Array[js.UndefOr[MarginTop[Double | String]]])
  ] = js.native
  /**
    * The **`mx`** is shorthand for using both **`margin-left`** and **`margin-right`** CSS properties. They set the margin area on the left and right side of an element. A positive value placesit
    * farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://styled-system.com/#margin-props
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var mx: js.UndefOr[
    (MarginLeft[Double | String]) | (js.Array[js.UndefOr[MarginLeft[Double | String]]])
  ] = js.native
  /**
    * The **`my`** is shorthard for using both **`margin-top`** and **`margin-bottom`** CSS properties. They set the margin area on the top and bottom of an element. A positive value places it
    * farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://styled-system.com/#margin-props
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var my: js.UndefOr[
    (MarginTop[Double | String]) | (js.Array[js.UndefOr[MarginTop[Double | String]]])
  ] = js.native
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var p: js.UndefOr[(Padding[Double | String]) | (js.Array[js.UndefOr[Padding[Double | String]]])] = js.native
  /**
    * The **`paddingX`** is shorthand property for CSS properties **`padding-left`** and **`padding-right`**. They set the width of the padding area on the left and right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://styled-system.com/#padding-props
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var paddingX: js.UndefOr[
    (PaddingLeft[Double | String]) | (js.Array[js.UndefOr[PaddingLeft[Double | String]]])
  ] = js.native
  /**
    * The **`paddingY`** is shorthand property for CSS properties **`padding-top`** and **`padding-bottom`**. They set the width of the padding area on the top and bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://styled-system.com/#padding-props
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var paddingY: js.UndefOr[
    (PaddingTop[Double | String]) | (js.Array[js.UndefOr[PaddingTop[Double | String]]])
  ] = js.native
  /**
    * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var pb: js.UndefOr[
    (PaddingBottom[Double | String]) | (js.Array[js.UndefOr[PaddingBottom[Double | String]]])
  ] = js.native
  /**
    * The **`padding-left`** CSS property sets the width of the padding area on the left side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    */
  var pl: js.UndefOr[
    (PaddingLeft[Double | String]) | (js.Array[js.UndefOr[PaddingLeft[Double | String]]])
  ] = js.native
  /**
    * The **`padding-right`** CSS property sets the width of the padding area on the right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var pr: js.UndefOr[
    (PaddingRight[Double | String]) | (js.Array[js.UndefOr[PaddingRight[Double | String]]])
  ] = js.native
  /**
    * The **`padding-top`** padding area on the top of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    */
  var pt: js.UndefOr[
    (PaddingTop[Double | String]) | (js.Array[js.UndefOr[PaddingTop[Double | String]]])
  ] = js.native
  /**
    * The **`px`** is shorthand property for CSS properties **`padding-left`** and **`padding-right`**. They set the width of the padding area on the left and right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://styled-system.com/#padding-props
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var px: js.UndefOr[
    (PaddingLeft[Double | String]) | (js.Array[js.UndefOr[PaddingLeft[Double | String]]])
  ] = js.native
  /**
    * The **`py`** is shorthand property for CSS properties **`padding-top`** and **`padding-bottom`**. They set the width of the padding area on the top and bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://styled-system.com/#padding-props
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var py: js.UndefOr[
    (PaddingTop[Double | String]) | (js.Array[js.UndefOr[PaddingTop[Double | String]]])
  ] = js.native
}

object AliasesCSSProperties {
  @scala.inline
  def apply(): AliasesCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasesCSSProperties]
  }
  @scala.inline
  implicit class AliasesCSSPropertiesOps[Self <: AliasesCSSProperties] (val x: Self) extends AnyVal {
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
    def setBgVarargs(value: js.UndefOr[BackgroundColor]*): Self = this.set("bg", js.Array(value :_*))
    @scala.inline
    def setBg(value: BackgroundColor | js.Array[js.UndefOr[BackgroundColor]]): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    @scala.inline
    def setMVarargs(value: (js.UndefOr[Margin[Double | String]])*): Self = this.set("m", js.Array(value :_*))
    @scala.inline
    def setM(value: (Margin[Double | String]) | (js.Array[js.UndefOr[Margin[Double | String]]])): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setMarginXVarargs(value: (js.UndefOr[MarginLeft[Double | String]])*): Self = this.set("marginX", js.Array(value :_*))
    @scala.inline
    def setMarginX(value: (MarginLeft[Double | String]) | (js.Array[js.UndefOr[MarginLeft[Double | String]]])): Self = this.set("marginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginX: Self = this.set("marginX", js.undefined)
    @scala.inline
    def setMarginYVarargs(value: (js.UndefOr[MarginTop[Double | String]])*): Self = this.set("marginY", js.Array(value :_*))
    @scala.inline
    def setMarginY(value: (MarginTop[Double | String]) | (js.Array[js.UndefOr[MarginTop[Double | String]]])): Self = this.set("marginY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginY: Self = this.set("marginY", js.undefined)
    @scala.inline
    def setMbVarargs(value: (js.UndefOr[MarginBottom[Double | String]])*): Self = this.set("mb", js.Array(value :_*))
    @scala.inline
    def setMb(value: (MarginBottom[Double | String]) | (js.Array[js.UndefOr[MarginBottom[Double | String]]])): Self = this.set("mb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
    @scala.inline
    def setMlVarargs(value: (js.UndefOr[MarginLeft[Double | String]])*): Self = this.set("ml", js.Array(value :_*))
    @scala.inline
    def setMl(value: (MarginLeft[Double | String]) | (js.Array[js.UndefOr[MarginLeft[Double | String]]])): Self = this.set("ml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMl: Self = this.set("ml", js.undefined)
    @scala.inline
    def setMrVarargs(value: (js.UndefOr[MarginRight[Double | String]])*): Self = this.set("mr", js.Array(value :_*))
    @scala.inline
    def setMr(value: (MarginRight[Double | String]) | (js.Array[js.UndefOr[MarginRight[Double | String]]])): Self = this.set("mr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMr: Self = this.set("mr", js.undefined)
    @scala.inline
    def setMtVarargs(value: (js.UndefOr[MarginTop[Double | String]])*): Self = this.set("mt", js.Array(value :_*))
    @scala.inline
    def setMt(value: (MarginTop[Double | String]) | (js.Array[js.UndefOr[MarginTop[Double | String]]])): Self = this.set("mt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMt: Self = this.set("mt", js.undefined)
    @scala.inline
    def setMxVarargs(value: (js.UndefOr[MarginLeft[Double | String]])*): Self = this.set("mx", js.Array(value :_*))
    @scala.inline
    def setMx(value: (MarginLeft[Double | String]) | (js.Array[js.UndefOr[MarginLeft[Double | String]]])): Self = this.set("mx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMx: Self = this.set("mx", js.undefined)
    @scala.inline
    def setMyVarargs(value: (js.UndefOr[MarginTop[Double | String]])*): Self = this.set("my", js.Array(value :_*))
    @scala.inline
    def setMy(value: (MarginTop[Double | String]) | (js.Array[js.UndefOr[MarginTop[Double | String]]])): Self = this.set("my", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    @scala.inline
    def setPVarargs(value: (js.UndefOr[Padding[Double | String]])*): Self = this.set("p", js.Array(value :_*))
    @scala.inline
    def setP(value: (Padding[Double | String]) | (js.Array[js.UndefOr[Padding[Double | String]]])): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setPaddingXVarargs(value: (js.UndefOr[PaddingLeft[Double | String]])*): Self = this.set("paddingX", js.Array(value :_*))
    @scala.inline
    def setPaddingX(value: (PaddingLeft[Double | String]) | (js.Array[js.UndefOr[PaddingLeft[Double | String]]])): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingX: Self = this.set("paddingX", js.undefined)
    @scala.inline
    def setPaddingYVarargs(value: (js.UndefOr[PaddingTop[Double | String]])*): Self = this.set("paddingY", js.Array(value :_*))
    @scala.inline
    def setPaddingY(value: (PaddingTop[Double | String]) | (js.Array[js.UndefOr[PaddingTop[Double | String]]])): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingY: Self = this.set("paddingY", js.undefined)
    @scala.inline
    def setPbVarargs(value: (js.UndefOr[PaddingBottom[Double | String]])*): Self = this.set("pb", js.Array(value :_*))
    @scala.inline
    def setPb(value: (PaddingBottom[Double | String]) | (js.Array[js.UndefOr[PaddingBottom[Double | String]]])): Self = this.set("pb", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePb: Self = this.set("pb", js.undefined)
    @scala.inline
    def setPlVarargs(value: (js.UndefOr[PaddingLeft[Double | String]])*): Self = this.set("pl", js.Array(value :_*))
    @scala.inline
    def setPl(value: (PaddingLeft[Double | String]) | (js.Array[js.UndefOr[PaddingLeft[Double | String]]])): Self = this.set("pl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePl: Self = this.set("pl", js.undefined)
    @scala.inline
    def setPrVarargs(value: (js.UndefOr[PaddingRight[Double | String]])*): Self = this.set("pr", js.Array(value :_*))
    @scala.inline
    def setPr(value: (PaddingRight[Double | String]) | (js.Array[js.UndefOr[PaddingRight[Double | String]]])): Self = this.set("pr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePr: Self = this.set("pr", js.undefined)
    @scala.inline
    def setPtVarargs(value: (js.UndefOr[PaddingTop[Double | String]])*): Self = this.set("pt", js.Array(value :_*))
    @scala.inline
    def setPt(value: (PaddingTop[Double | String]) | (js.Array[js.UndefOr[PaddingTop[Double | String]]])): Self = this.set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePt: Self = this.set("pt", js.undefined)
    @scala.inline
    def setPxVarargs(value: (js.UndefOr[PaddingLeft[Double | String]])*): Self = this.set("px", js.Array(value :_*))
    @scala.inline
    def setPx(value: (PaddingLeft[Double | String]) | (js.Array[js.UndefOr[PaddingLeft[Double | String]]])): Self = this.set("px", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePx: Self = this.set("px", js.undefined)
    @scala.inline
    def setPyVarargs(value: (js.UndefOr[PaddingTop[Double | String]])*): Self = this.set("py", js.Array(value :_*))
    @scala.inline
    def setPy(value: (PaddingTop[Double | String]) | (js.Array[js.UndefOr[PaddingTop[Double | String]]])): Self = this.set("py", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePy: Self = this.set("py", js.undefined)
  }
  
}

