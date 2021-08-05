package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropDownArrowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/DropDownArrow", JSImport.Default)
  @js.native
  val default: SFC[DropDownArrowProps] = js.native
  
  trait DropDownArrowProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DropDownArrowProps {
    
    inline def apply(): DropDownArrowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropDownArrowProps]
    }
    
    extension [Self <: DropDownArrowProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DropDownArrowProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropDownArrowMod.foo` */
  override def _to: SFC[DropDownArrowProps] = default
}
