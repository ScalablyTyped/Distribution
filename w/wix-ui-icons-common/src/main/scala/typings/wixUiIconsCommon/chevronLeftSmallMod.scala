package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronLeftSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronLeftSmall", JSImport.Default)
  @js.native
  val default: SFC[ChevronLeftSmallProps] = js.native
  
  @js.native
  trait ChevronLeftSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronLeftSmallProps {
    
    @scala.inline
    def apply(): ChevronLeftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronLeftSmallProps]
    }
    
    @scala.inline
    implicit class ChevronLeftSmallPropsMutableBuilder[Self <: ChevronLeftSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronLeftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronLeftSmallMod.foo` */
  override def _to: SFC[ChevronLeftSmallProps] = default
}
