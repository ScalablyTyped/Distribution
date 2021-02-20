package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dismissMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Dismiss", JSImport.Default)
  @js.native
  val default: SFC[DismissProps] = js.native
  
  @js.native
  trait DismissProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DismissProps {
    
    @scala.inline
    def apply(): DismissProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DismissProps]
    }
    
    @scala.inline
    implicit class DismissPropsMutableBuilder[Self <: DismissProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DismissProps]
  
  /* This means you don't have to write `default`, but can instead just say `dismissMod.foo` */
  override def _to: SFC[DismissProps] = default
}
