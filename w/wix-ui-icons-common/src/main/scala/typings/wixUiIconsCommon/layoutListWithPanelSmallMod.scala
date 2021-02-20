package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutListWithPanelSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutListWithPanelSmall", JSImport.Default)
  @js.native
  val default: SFC[LayoutListWithPanelSmallProps] = js.native
  
  @js.native
  trait LayoutListWithPanelSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LayoutListWithPanelSmallProps {
    
    @scala.inline
    def apply(): LayoutListWithPanelSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutListWithPanelSmallProps]
    }
    
    @scala.inline
    implicit class LayoutListWithPanelSmallPropsMutableBuilder[Self <: LayoutListWithPanelSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LayoutListWithPanelSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutListWithPanelSmallMod.foo` */
  override def _to: SFC[LayoutListWithPanelSmallProps] = default
}
