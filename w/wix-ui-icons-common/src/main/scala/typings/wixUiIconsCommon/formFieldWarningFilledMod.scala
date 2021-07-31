package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldWarningFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FormFieldWarningFilled", JSImport.Default)
  @js.native
  val default: SFC[FormFieldWarningFilledProps] = js.native
  
  trait FormFieldWarningFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FormFieldWarningFilledProps {
    
    @scala.inline
    def apply(): FormFieldWarningFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldWarningFilledProps]
    }
    
    @scala.inline
    implicit class FormFieldWarningFilledPropsMutableBuilder[Self <: FormFieldWarningFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FormFieldWarningFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldWarningFilledMod.foo` */
  override def _to: SFC[FormFieldWarningFilledProps] = default
}
