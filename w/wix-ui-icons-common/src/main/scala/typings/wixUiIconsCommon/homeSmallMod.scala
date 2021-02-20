package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object homeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HomeSmall", JSImport.Default)
  @js.native
  val default: SFC[HomeSmallProps] = js.native
  
  @js.native
  trait HomeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HomeSmallProps {
    
    @scala.inline
    def apply(): HomeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HomeSmallProps]
    }
    
    @scala.inline
    implicit class HomeSmallPropsMutableBuilder[Self <: HomeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HomeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `homeSmallMod.foo` */
  override def _to: SFC[HomeSmallProps] = default
}
