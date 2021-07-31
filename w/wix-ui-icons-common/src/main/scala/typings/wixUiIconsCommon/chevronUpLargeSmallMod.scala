package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronUpLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronUpLargeSmall", JSImport.Default)
  @js.native
  val default: SFC[ChevronUpLargeSmallProps] = js.native
  
  trait ChevronUpLargeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronUpLargeSmallProps {
    
    @scala.inline
    def apply(): ChevronUpLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpLargeSmallProps]
    }
    
    @scala.inline
    implicit class ChevronUpLargeSmallPropsMutableBuilder[Self <: ChevronUpLargeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronUpLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronUpLargeSmallMod.foo` */
  override def _to: SFC[ChevronUpLargeSmallProps] = default
}
