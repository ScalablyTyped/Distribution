package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var variant: String = js.native
}
object VariantProperty {
  
  @scala.inline
  def apply(variant: String): VariantProperty = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantProperty]
  }
  
  @scala.inline
  implicit class VariantPropertyMutableBuilder[Self <: VariantProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
