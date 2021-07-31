package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronRightCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronRightCircleSmall", JSImport.Default)
  @js.native
  val default: SFC[ChevronRightCircleSmallProps] = js.native
  
  trait ChevronRightCircleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronRightCircleSmallProps {
    
    @scala.inline
    def apply(): ChevronRightCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightCircleSmallProps]
    }
    
    @scala.inline
    implicit class ChevronRightCircleSmallPropsMutableBuilder[Self <: ChevronRightCircleSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronRightCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronRightCircleSmallMod.foo` */
  override def _to: SFC[ChevronRightCircleSmallProps] = default
}
