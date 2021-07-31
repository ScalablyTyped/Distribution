package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldErrorMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FormFieldError", JSImport.Default)
  @js.native
  val default: SFC[FormFieldErrorProps] = js.native
  
  trait FormFieldErrorProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FormFieldErrorProps {
    
    @scala.inline
    def apply(): FormFieldErrorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldErrorProps]
    }
    
    @scala.inline
    implicit class FormFieldErrorPropsMutableBuilder[Self <: FormFieldErrorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FormFieldErrorProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldErrorMod.foo` */
  override def _to: SFC[FormFieldErrorProps] = default
}
