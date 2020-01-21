package typings.styledSystemCss.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.MarginBottomProperty
import typings.csstype.mod.MarginLeftProperty
import typings.csstype.mod.MarginProperty
import typings.csstype.mod.MarginRightProperty
import typings.csstype.mod.MarginTopProperty
import typings.csstype.mod.PaddingBottomProperty
import typings.csstype.mod.PaddingLeftProperty
import typings.csstype.mod.PaddingProperty
import typings.csstype.mod.PaddingRightProperty
import typings.csstype.mod.PaddingTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var bg: js.UndefOr[BackgroundColorProperty | js.Array[BackgroundColorProperty]] = js.undefined
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var m: js.UndefOr[(MarginProperty[Double | String]) | (js.Array[MarginProperty[Double | String]])] = js.undefined
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
    (MarginLeftProperty[Double | String]) | (js.Array[MarginLeftProperty[Double | String]])
  ] = js.undefined
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
    (MarginTopProperty[Double | String]) | (js.Array[MarginTopProperty[Double | String]])
  ] = js.undefined
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
    (MarginBottomProperty[Double | String]) | (js.Array[MarginBottomProperty[Double | String]])
  ] = js.undefined
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
    (MarginLeftProperty[Double | String]) | (js.Array[MarginLeftProperty[Double | String]])
  ] = js.undefined
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
    (MarginRightProperty[Double | String]) | (js.Array[MarginRightProperty[Double | String]])
  ] = js.undefined
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
    (MarginTopProperty[Double | String]) | (js.Array[MarginTopProperty[Double | String]])
  ] = js.undefined
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
    (MarginLeftProperty[Double | String]) | (js.Array[MarginLeftProperty[Double | String]])
  ] = js.undefined
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
    (MarginTopProperty[Double | String]) | (js.Array[MarginTopProperty[Double | String]])
  ] = js.undefined
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var p: js.UndefOr[
    (PaddingProperty[Double | String]) | (js.Array[PaddingProperty[Double | String]])
  ] = js.undefined
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
    (PaddingLeftProperty[Double | String]) | (js.Array[PaddingLeftProperty[Double | String]])
  ] = js.undefined
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
    (PaddingTopProperty[Double | String]) | (js.Array[PaddingTopProperty[Double | String]])
  ] = js.undefined
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
    (PaddingBottomProperty[Double | String]) | (js.Array[PaddingBottomProperty[Double | String]])
  ] = js.undefined
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
    (PaddingLeftProperty[Double | String]) | (js.Array[PaddingLeftProperty[Double | String]])
  ] = js.undefined
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
    (PaddingRightProperty[Double | String]) | (js.Array[PaddingRightProperty[Double | String]])
  ] = js.undefined
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
    (PaddingTopProperty[Double | String]) | (js.Array[PaddingTopProperty[Double | String]])
  ] = js.undefined
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
    (PaddingLeftProperty[Double | String]) | (js.Array[PaddingLeftProperty[Double | String]])
  ] = js.undefined
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
    (PaddingTopProperty[Double | String]) | (js.Array[PaddingTopProperty[Double | String]])
  ] = js.undefined
}

object AliasesCSSProperties {
  @scala.inline
  def apply(
    bg: BackgroundColorProperty | js.Array[BackgroundColorProperty] = null,
    m: (MarginProperty[Double | String]) | (js.Array[MarginProperty[Double | String]]) = null,
    marginX: (MarginLeftProperty[Double | String]) | (js.Array[MarginLeftProperty[Double | String]]) = null,
    marginY: (MarginTopProperty[Double | String]) | (js.Array[MarginTopProperty[Double | String]]) = null,
    mb: (MarginBottomProperty[Double | String]) | (js.Array[MarginBottomProperty[Double | String]]) = null,
    ml: (MarginLeftProperty[Double | String]) | (js.Array[MarginLeftProperty[Double | String]]) = null,
    mr: (MarginRightProperty[Double | String]) | (js.Array[MarginRightProperty[Double | String]]) = null,
    mt: (MarginTopProperty[Double | String]) | (js.Array[MarginTopProperty[Double | String]]) = null,
    mx: (MarginLeftProperty[Double | String]) | (js.Array[MarginLeftProperty[Double | String]]) = null,
    my: (MarginTopProperty[Double | String]) | (js.Array[MarginTopProperty[Double | String]]) = null,
    p: (PaddingProperty[Double | String]) | (js.Array[PaddingProperty[Double | String]]) = null,
    paddingX: (PaddingLeftProperty[Double | String]) | (js.Array[PaddingLeftProperty[Double | String]]) = null,
    paddingY: (PaddingTopProperty[Double | String]) | (js.Array[PaddingTopProperty[Double | String]]) = null,
    pb: (PaddingBottomProperty[Double | String]) | (js.Array[PaddingBottomProperty[Double | String]]) = null,
    pl: (PaddingLeftProperty[Double | String]) | (js.Array[PaddingLeftProperty[Double | String]]) = null,
    pr: (PaddingRightProperty[Double | String]) | (js.Array[PaddingRightProperty[Double | String]]) = null,
    pt: (PaddingTopProperty[Double | String]) | (js.Array[PaddingTopProperty[Double | String]]) = null,
    px: (PaddingLeftProperty[Double | String]) | (js.Array[PaddingLeftProperty[Double | String]]) = null,
    py: (PaddingTopProperty[Double | String]) | (js.Array[PaddingTopProperty[Double | String]]) = null
  ): AliasesCSSProperties = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasesCSSProperties]
  }
}

