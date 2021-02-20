package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promoteFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PromoteFilled", JSImport.Default)
  @js.native
  val default: SFC[PromoteFilledProps] = js.native
  
  @js.native
  trait PromoteFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PromoteFilledProps {
    
    @scala.inline
    def apply(): PromoteFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromoteFilledProps]
    }
    
    @scala.inline
    implicit class PromoteFilledPropsMutableBuilder[Self <: PromoteFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PromoteFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `promoteFilledMod.foo` */
  override def _to: SFC[PromoteFilledProps] = default
}
