package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsDropdownSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DropdownSmall", JSImport.Default)
  @js.native
  val default: FC[DropdownSmallProps] = js.native
  
  trait DropdownSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DropdownSmallProps {
    
    inline def apply(): DropdownSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DropdownSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsDropdownSmallMod.foo` */
  override def _to: FC[DropdownSmallProps] = default
}
