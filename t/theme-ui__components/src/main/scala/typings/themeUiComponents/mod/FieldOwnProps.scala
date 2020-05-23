package typings.themeUiComponents.mod

import typings.styledSystem.mod.MarginProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.ThemeValue
import typings.styledSystem.styledSystemStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOwnProps extends MarginProps[RequiredTheme] {
  /**
    * Text for Label component
    */
  var label: String
  /**
    * Used for the for, id, and name attributes
    */
  var name: String
}

object FieldOwnProps {
  @scala.inline
  def apply(
    label: String,
    name: String,
    m: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    margin: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginBottom: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginLeft: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginRight: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginTop: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginX: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    marginY: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    mb: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    ml: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    mr: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    mt: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    mx: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined,
    my: js.UndefOr[Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme])] = js.undefined
  ): FieldOwnProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[FieldOwnProps]
  }
}

