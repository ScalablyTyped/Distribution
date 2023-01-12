package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsCheckboxCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CheckboxChecked", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxCheckedProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CheckboxCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsCheckboxCheckedMod.foo` */
  override def _to: FC[CheckboxCheckedProps] = default
}
