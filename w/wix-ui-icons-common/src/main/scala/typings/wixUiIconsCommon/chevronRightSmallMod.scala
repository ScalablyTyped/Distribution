package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronRightSmall", JSImport.Default)
  @js.native
  val default: SFC[ChevronRightSmallProps] = js.native
  
  @js.native
  trait ChevronRightSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronRightSmallProps {
    
    @scala.inline
    def apply(): ChevronRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightSmallProps]
    }
    
    @scala.inline
    implicit class ChevronRightSmallPropsMutableBuilder[Self <: ChevronRightSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronRightSmallMod.foo` */
  override def _to: SFC[ChevronRightSmallProps] = default
}
