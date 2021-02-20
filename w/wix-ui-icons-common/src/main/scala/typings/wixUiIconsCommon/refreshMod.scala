package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refreshMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Refresh", JSImport.Default)
  @js.native
  val default: SFC[RefreshProps] = js.native
  
  @js.native
  trait RefreshProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RefreshProps {
    
    @scala.inline
    def apply(): RefreshProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshProps]
    }
    
    @scala.inline
    implicit class RefreshPropsMutableBuilder[Self <: RefreshProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RefreshProps]
  
  /* This means you don't have to write `default`, but can instead just say `refreshMod.foo` */
  override def _to: SFC[RefreshProps] = default
}
