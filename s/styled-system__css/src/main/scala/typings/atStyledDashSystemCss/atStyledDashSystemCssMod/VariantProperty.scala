package typings.atStyledDashSystemCss.atStyledDashSystemCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantProperty extends _SystemStyleObject {
  /**
    * **`Variants`** can be useful for applying complex styles to a component based on a single prop.
    *
    * @example
    * const theme = {
    *   buttons: {
    *     primary: {
    *       p: 3,
    *       fontWeight: 'bold',
    *       color: 'white',
    *       bg: 'primary',
    *       borderRadius: 2,
    *     },
    *   },
    * }
    * const result = css({
    *   variant: 'buttons.primary',
    * })(theme)
    *
    * @see https://styled-system.com/variants
    */
  var variant: String
}

object VariantProperty {
  @scala.inline
  def apply(variant: String): VariantProperty = {
    val __obj = js.Dynamic.literal(variant = variant)
  
    __obj.asInstanceOf[VariantProperty]
  }
}

