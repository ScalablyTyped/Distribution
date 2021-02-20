package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronLeftCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronLeftCircleSmall", JSImport.Default)
  @js.native
  val default: SFC[ChevronLeftCircleSmallProps] = js.native
  
  @js.native
  trait ChevronLeftCircleSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronLeftCircleSmallProps {
    
    @scala.inline
    def apply(): ChevronLeftCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronLeftCircleSmallProps]
    }
    
    @scala.inline
    implicit class ChevronLeftCircleSmallPropsMutableBuilder[Self <: ChevronLeftCircleSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronLeftCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronLeftCircleSmallMod.foo` */
  override def _to: SFC[ChevronLeftCircleSmallProps] = default
}
