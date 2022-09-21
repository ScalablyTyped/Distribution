package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldSpinnerDownMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/FormFieldSpinnerDown", JSImport.Default)
  @js.native
  val default: FC[FormFieldSpinnerDownProps] = js.native
  
  trait FormFieldSpinnerDownProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FormFieldSpinnerDownProps {
    
    inline def apply(): FormFieldSpinnerDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldSpinnerDownProps]
    }
    
    extension [Self <: FormFieldSpinnerDownProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FormFieldSpinnerDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldSpinnerDownMod.foo` */
  override def _to: FC[FormFieldSpinnerDownProps] = default
}
