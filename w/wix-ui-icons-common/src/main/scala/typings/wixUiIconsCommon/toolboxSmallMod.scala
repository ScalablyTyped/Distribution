package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolboxSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ToolboxSmall", JSImport.Default)
  @js.native
  val default: SFC[ToolboxSmallProps] = js.native
  
  trait ToolboxSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ToolboxSmallProps {
    
    @scala.inline
    def apply(): ToolboxSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolboxSmallProps]
    }
    
    @scala.inline
    implicit class ToolboxSmallPropsMutableBuilder[Self <: ToolboxSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ToolboxSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `toolboxSmallMod.foo` */
  override def _to: SFC[ToolboxSmallProps] = default
}
