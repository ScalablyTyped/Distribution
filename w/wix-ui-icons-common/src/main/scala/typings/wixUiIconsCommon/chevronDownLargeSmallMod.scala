package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronDownLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronDownLargeSmall", JSImport.Default)
  @js.native
  val default: SFC[ChevronDownLargeSmallProps] = js.native
  
  trait ChevronDownLargeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronDownLargeSmallProps {
    
    @scala.inline
    def apply(): ChevronDownLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronDownLargeSmallProps]
    }
    
    @scala.inline
    implicit class ChevronDownLargeSmallPropsMutableBuilder[Self <: ChevronDownLargeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronDownLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronDownLargeSmallMod.foo` */
  override def _to: SFC[ChevronDownLargeSmallProps] = default
}
