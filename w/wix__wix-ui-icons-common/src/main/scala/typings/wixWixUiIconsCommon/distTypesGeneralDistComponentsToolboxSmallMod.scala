package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsToolboxSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ToolboxSmall", JSImport.Default)
  @js.native
  val default: FC[ToolboxSmallProps] = js.native
  
  trait ToolboxSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ToolboxSmallProps {
    
    inline def apply(): ToolboxSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolboxSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolboxSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ToolboxSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsToolboxSmallMod.foo` */
  override def _to: FC[ToolboxSmallProps] = default
}
