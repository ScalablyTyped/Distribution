package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsFormFieldSpinnerUpMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/FormFieldSpinnerUp", JSImport.Default)
  @js.native
  val default: FC[FormFieldSpinnerUpProps] = js.native
  
  trait FormFieldSpinnerUpProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FormFieldSpinnerUpProps {
    
    inline def apply(): FormFieldSpinnerUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldSpinnerUpProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormFieldSpinnerUpProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FormFieldSpinnerUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsFormFieldSpinnerUpMod.foo` */
  override def _to: FC[FormFieldSpinnerUpProps] = default
}
