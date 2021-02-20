package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutListSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutListSmall", JSImport.Default)
  @js.native
  val default: SFC[LayoutListSmallProps] = js.native
  
  @js.native
  trait LayoutListSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LayoutListSmallProps {
    
    @scala.inline
    def apply(): LayoutListSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutListSmallProps]
    }
    
    @scala.inline
    implicit class LayoutListSmallPropsMutableBuilder[Self <: LayoutListSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LayoutListSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutListSmallMod.foo` */
  override def _to: SFC[LayoutListSmallProps] = default
}
