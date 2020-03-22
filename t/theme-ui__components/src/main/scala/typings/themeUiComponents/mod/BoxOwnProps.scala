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
    backgroundColor: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    bg: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    color: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    css: InterpolationWithTheme[_] = null,
    m: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    margin: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginRight: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginTop: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginX: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginY: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mb: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    ml: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mr: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mt: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mx: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    my: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    opacity: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    p: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    padding: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingRight: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingTop: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingX: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingY: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pb: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pl: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pr: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pt: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    px: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    py: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    sx: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any = null,
    variant: String = null
  ): BoxOwnProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (sx != null) __obj.updateDynamic("sx")(sx.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxOwnProps]
  }
}

