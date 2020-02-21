package typings.themeUi.mod

import typings.themeUi.AnonK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>, 'colors'> ]: styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>[P]} */ trait Theme extends js.Object {
  /**
    * Define the colors that are available through this theme
    */
  var colors: js.UndefOr[ColorMode with AnonK] = js.undefined
  /**
    * Provide a value here to enable color modes
    */
  var initialColorModeName: js.UndefOr[String] = js.undefined
  /**
    * Styles for elements rendered in MDX can be added to the theme.styles
    * object. This is the primary, low-level way to control typographic and
    * other styles in markdown content. Styles within this object are processed
    * with @styled-system/css and have access to base theme values like colors,
    * fonts, etc.
    */
  var styles: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in theme-ui.theme-ui.StyledTags ]:? @styled-system/css.@styled-system/css.SystemStyleObject}
    */ typings.themeUi.themeUiStrings.Theme with js.Any
  ] = js.undefined
  /**
    * Enable/disable custom CSS properties/variables if lower browser
    * support is required (for eg. IE 11).
    *
    * References: https://theme-ui.com/color-modes/#turn-off-custom-properties
    */
  var useCustomProperties: js.UndefOr[Boolean] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    colors: ColorMode with AnonK = null,
    initialColorModeName: String = null,
    styles: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in theme-ui.theme-ui.StyledTags ]:? @styled-system/css.@styled-system/css.SystemStyleObject}
    */ typings.themeUi.themeUiStrings.Theme with js.Any = null,
    useCustomProperties: js.UndefOr[Boolean] = js.undefined
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (initialColorModeName != null) __obj.updateDynamic("initialColorModeName")(initialColorModeName.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomProperties)) __obj.updateDynamic("useCustomProperties")(useCustomProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

