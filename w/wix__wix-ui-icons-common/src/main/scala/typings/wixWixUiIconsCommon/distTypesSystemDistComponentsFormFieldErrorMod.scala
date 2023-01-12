package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsFormFieldErrorMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/FormFieldError", JSImport.Default)
  @js.native
  val default: FC[FormFieldErrorProps] = js.native
  
  trait FormFieldErrorProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FormFieldErrorProps {
    
    inline def apply(): FormFieldErrorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldErrorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormFieldErrorProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FormFieldErrorProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsFormFieldErrorMod.foo` */
  override def _to: FC[FormFieldErrorProps] = default
}
