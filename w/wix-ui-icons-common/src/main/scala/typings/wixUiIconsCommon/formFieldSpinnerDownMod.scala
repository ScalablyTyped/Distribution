package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldSpinnerDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FormFieldSpinnerDown", JSImport.Default)
  @js.native
  val default: SFC[FormFieldSpinnerDownProps] = js.native
  
  trait FormFieldSpinnerDownProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FormFieldSpinnerDownProps {
    
    @scala.inline
    def apply(): FormFieldSpinnerDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldSpinnerDownProps]
    }
    
    @scala.inline
    implicit class FormFieldSpinnerDownPropsMutableBuilder[Self <: FormFieldSpinnerDownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FormFieldSpinnerDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldSpinnerDownMod.foo` */
  override def _to: SFC[FormFieldSpinnerDownProps] = default
}
