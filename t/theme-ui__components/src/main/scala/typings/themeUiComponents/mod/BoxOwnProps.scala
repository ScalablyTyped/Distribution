package typings.themeUiComponents.mod

import typings.csstype.mod.GlobalsNumber
import typings.emotionCore.mod.InterpolationWithTheme
import typings.react.mod.ElementType
import typings.styledSystem.mod.BackgroundColorProps
import typings.styledSystem.mod.OpacityProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.SpaceProps
import typings.styledSystem.mod.TextColorProps
import typings.styledSystem.mod.ThemeValue
import typings.themeUiComponents.themeUiComponentsStrings.colors
import typings.themeUiComponents.themeUiComponentsStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxOwnProps
  extends SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme] {
  var as: js.UndefOr[ElementType[_]] = js.undefined
  var css: js.UndefOr[InterpolationWithTheme[_]] = js.undefined
  var sx: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
  ] = js.undefined
  var variant: js.UndefOr[String] = js.undefined
}

object BoxOwnProps {
  @scala.inline
  def apply(
    as: ElementType[_] = null,
    backgroundColor: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    bg: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    color: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    css: js.UndefOr[Null | InterpolationWithTheme[_]] = js.undefined,
    m: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    margin: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginBottom: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginLeft: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginRight: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginTop: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginX: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginY: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    mb: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    ml: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    mr: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    mt: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    mx: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    my: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    opacity: js.UndefOr[Null | (ResponsiveValue[GlobalsNumber, RequiredTheme])] = js.undefined,
    p: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    padding: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingBottom: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingLeft: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingRight: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingTop: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingX: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingY: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    pb: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    pl: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    pr: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    pt: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    px: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    py: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    sx: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any = null,
    variant: String = null
  ): BoxOwnProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundColor)) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bg)) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(css)) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (!js.isUndefined(marginX)) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (!js.isUndefined(marginY)) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (!js.isUndefined(mb)) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (!js.isUndefined(ml)) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (!js.isUndefined(mr)) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (!js.isUndefined(mt)) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (!js.isUndefined(mx)) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (!js.isUndefined(my)) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(p)) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingBottom)) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeft)) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingRight)) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTop)) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingX)) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingY)) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (!js.isUndefined(pb)) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (!js.isUndefined(pl)) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (!js.isUndefined(pr)) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (!js.isUndefined(pt)) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (!js.isUndefined(px)) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (!js.isUndefined(py)) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (sx != null) __obj.updateDynamic("sx")(sx.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxOwnProps]
  }
}

