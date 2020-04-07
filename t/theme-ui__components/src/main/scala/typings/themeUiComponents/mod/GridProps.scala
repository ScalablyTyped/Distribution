package typings.themeUiComponents.mod

import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait GridProps extends js.Object {
  /**
    * 	Number of columns to use for the layout (cannot be used in conjunction with the width prop)
    */
  var columns: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.undefined
  /**
    * Space between child elements
    */
  var gap: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.undefined
  /**
    * Minimum width of child elements
    */
  var width: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    columns: ResponsiveValue[String | Double, RequiredTheme] = null,
    gap: ResponsiveValue[String | Double, RequiredTheme] = null,
    width: ResponsiveValue[String | Double, RequiredTheme] = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

