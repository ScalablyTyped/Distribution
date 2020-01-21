package typings.styledSystem.mod

import typings.csstype.mod.FontSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontSizeProps[TLength] extends js.Object {
  /**
    * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
    *
    * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
    * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
    * - String values are passed as raw CSS values.
    * - And array values are converted into responsive values.
    *
    */
  var fontSize: js.UndefOr[ResponsiveValue[FontSizeProperty[TLength]]] = js.undefined
}

object FontSizeProps {
  @scala.inline
  def apply[TLength](fontSize: ResponsiveValue[FontSizeProperty[TLength]] = null): FontSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeProps[TLength]]
  }
}

