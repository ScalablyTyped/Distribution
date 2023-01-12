package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsFormFieldErrorSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/FormFieldErrorSmall", JSImport.Default)
  @js.native
  val default: FC[FormFieldErrorSmallProps] = js.native
  
  trait FormFieldErrorSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FormFieldErrorSmallProps {
    
    inline def apply(): FormFieldErrorSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldErrorSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormFieldErrorSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FormFieldErrorSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsFormFieldErrorSmallMod.foo` */
  override def _to: FC[FormFieldErrorSmallProps] = default
}
