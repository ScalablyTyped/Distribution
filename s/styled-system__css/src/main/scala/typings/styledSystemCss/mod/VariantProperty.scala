package typings.styledSystemCss.mod

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
  implicit class VariantPropertyOps[Self <: VariantProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
  }
}
