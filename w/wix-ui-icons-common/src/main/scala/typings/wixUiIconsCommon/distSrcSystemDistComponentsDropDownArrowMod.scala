package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsDropDownArrowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/DropDownArrow", JSImport.Default)
  @js.native
  val default: FC[DropDownArrowProps] = js.native
  
  trait DropDownArrowProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DropDownArrowProps {
    
    inline def apply(): DropDownArrowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropDownArrowProps]
    }
    
    extension [Self <: DropDownArrowProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DropDownArrowProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsDropDownArrowMod.foo` */
  override def _to: FC[DropDownArrowProps] = default
}
