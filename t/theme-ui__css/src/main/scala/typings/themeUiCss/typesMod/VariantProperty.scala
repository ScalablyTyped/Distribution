package typings.themeUiCss.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariantProperty extends StObject {
  
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
  var variant: js.UndefOr[String] = js.undefined
}
object VariantProperty {
  
  @scala.inline
  def apply(): VariantProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantProperty]
  }
  
  @scala.inline
  implicit class VariantPropertyMutableBuilder[Self <: VariantProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
