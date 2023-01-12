package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsToolboxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Toolbox", JSImport.Default)
  @js.native
  val default: FC[ToolboxProps] = js.native
  
  trait ToolboxProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ToolboxProps {
    
    inline def apply(): ToolboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolboxProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ToolboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsToolboxMod.foo` */
  override def _to: FC[ToolboxProps] = default
}
