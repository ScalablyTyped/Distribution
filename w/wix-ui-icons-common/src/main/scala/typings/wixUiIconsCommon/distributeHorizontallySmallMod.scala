package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeHorizontallySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeHorizontallySmall", JSImport.Default)
  @js.native
  val default: SFC[DistributeHorizontallySmallProps] = js.native
  
  @js.native
  trait DistributeHorizontallySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DistributeHorizontallySmallProps {
    
    @scala.inline
    def apply(): DistributeHorizontallySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeHorizontallySmallProps]
    }
    
    @scala.inline
    implicit class DistributeHorizontallySmallPropsMutableBuilder[Self <: DistributeHorizontallySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DistributeHorizontallySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeHorizontallySmallMod.foo` */
  override def _to: SFC[DistributeHorizontallySmallProps] = default
}
