package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldErrorSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FormFieldErrorSmall", JSImport.Default)
  @js.native
  val default: SFC[FormFieldErrorSmallProps] = js.native
  
  @js.native
  trait FormFieldErrorSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FormFieldErrorSmallProps {
    
    @scala.inline
    def apply(): FormFieldErrorSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldErrorSmallProps]
    }
    
    @scala.inline
    implicit class FormFieldErrorSmallPropsMutableBuilder[Self <: FormFieldErrorSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FormFieldErrorSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldErrorSmallMod.foo` */
  override def _to: SFC[FormFieldErrorSmallProps] = default
}
