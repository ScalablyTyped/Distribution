package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsCheckboxCheckedMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/CheckboxChecked", JSImport.Default)
  @js.native
  val default: FC[CheckboxCheckedProps] = js.native
  
  trait CheckboxCheckedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CheckboxCheckedProps {
    
    inline def apply(): CheckboxCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxCheckedProps]
    }
    
    extension [Self <: CheckboxCheckedProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CheckboxCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsCheckboxCheckedMod.foo` */
  override def _to: FC[CheckboxCheckedProps] = default
}
