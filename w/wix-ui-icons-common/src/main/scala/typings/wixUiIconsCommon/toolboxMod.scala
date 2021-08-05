package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolboxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Toolbox", JSImport.Default)
  @js.native
  val default: SFC[ToolboxProps] = js.native
  
  trait ToolboxProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ToolboxProps {
    
    inline def apply(): ToolboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolboxProps]
    }
    
    extension [Self <: ToolboxProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ToolboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `toolboxMod.foo` */
  override def _to: SFC[ToolboxProps] = default
}
