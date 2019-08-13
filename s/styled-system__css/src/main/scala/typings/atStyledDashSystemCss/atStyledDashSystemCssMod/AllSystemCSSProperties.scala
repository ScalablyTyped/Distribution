package typings.atStyledDashSystemCss.atStyledDashSystemCssMod

import typings.csstype.csstypeMod.BackgroundColorProperty
import typings.csstype.csstypeMod.BoxShadowProperty
import typings.csstype.csstypeMod.FontWeightProperty
import typings.csstype.csstypeMod.MarginBottomProperty
import typings.csstype.csstypeMod.MarginLeftProperty
import typings.csstype.csstypeMod.MarginProperty
import typings.csstype.csstypeMod.MarginRightProperty
import typings.csstype.csstypeMod.MarginTopProperty
import typings.csstype.csstypeMod.PaddingBottomProperty
import typings.csstype.csstypeMod.PaddingLeftProperty
import typings.csstype.csstypeMod.PaddingProperty
import typings.csstype.csstypeMod.PaddingRightProperty
import typings.csstype.csstypeMod.PaddingTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Map of all available CSS properties (including aliases) and their raw value.
  * Only used internally to map CCS properties to input types (responsive value,
  * theme function or nested) in `SystemCssProperties`.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @styled-system/css.@styled-system/css.CSSProperties, 'boxShadow' | 'fontWeight'> ]: @styled-system/css.@styled-system/css.CSSProperties[P]} */ trait AllSystemCSSProperties
  extends AliasesCSSProperties
     with OverwriteCSSProperties

object AllSystemCSSProperties {
  @scala.inline
  def apply(
    bg: BackgroundColorProperty | js.Array[BackgroundColorProperty] = null,
    boxShadow: BoxShadowProperty | Double = null,
    fontWeight: FontWeightProperty | String = null,
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
  ): AllSystemCSSProperties = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (boxShadow != null) __obj.updateDynamic("boxShadow")(boxShadow.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AllSystemCSSProperties]
  }
}

