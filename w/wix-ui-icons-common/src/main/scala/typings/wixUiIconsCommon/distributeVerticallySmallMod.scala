package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeVerticallySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeVerticallySmall", JSImport.Default)
  @js.native
  val default: SFC[DistributeVerticallySmallProps] = js.native
  
  @js.native
  trait DistributeVerticallySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DistributeVerticallySmallProps {
    
    @scala.inline
    def apply(): DistributeVerticallySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeVerticallySmallProps]
    }
    
    @scala.inline
    implicit class DistributeVerticallySmallPropsMutableBuilder[Self <: DistributeVerticallySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DistributeVerticallySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeVerticallySmallMod.foo` */
  override def _to: SFC[DistributeVerticallySmallProps] = default
}
