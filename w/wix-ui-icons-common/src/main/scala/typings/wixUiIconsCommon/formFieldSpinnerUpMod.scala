package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldSpinnerUpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FormFieldSpinnerUp", JSImport.Default)
  @js.native
  val default: SFC[FormFieldSpinnerUpProps] = js.native
  
  trait FormFieldSpinnerUpProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FormFieldSpinnerUpProps {
    
    @scala.inline
    def apply(): FormFieldSpinnerUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldSpinnerUpProps]
    }
    
    @scala.inline
    implicit class FormFieldSpinnerUpPropsMutableBuilder[Self <: FormFieldSpinnerUpProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FormFieldSpinnerUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldSpinnerUpMod.foo` */
  override def _to: SFC[FormFieldSpinnerUpProps] = default
}
