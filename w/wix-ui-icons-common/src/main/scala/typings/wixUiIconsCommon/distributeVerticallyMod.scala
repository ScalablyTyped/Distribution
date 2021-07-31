package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeVerticallyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeVertically", JSImport.Default)
  @js.native
  val default: SFC[DistributeVerticallyProps] = js.native
  
  trait DistributeVerticallyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DistributeVerticallyProps {
    
    @scala.inline
    def apply(): DistributeVerticallyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeVerticallyProps]
    }
    
    @scala.inline
    implicit class DistributeVerticallyPropsMutableBuilder[Self <: DistributeVerticallyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DistributeVerticallyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeVerticallyMod.foo` */
  override def _to: SFC[DistributeVerticallyProps] = default
}
