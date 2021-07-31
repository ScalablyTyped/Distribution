package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronUpCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronUpCircleSmall", JSImport.Default)
  @js.native
  val default: SFC[ChevronUpCircleSmallProps] = js.native
  
  trait ChevronUpCircleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronUpCircleSmallProps {
    
    @scala.inline
    def apply(): ChevronUpCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpCircleSmallProps]
    }
    
    @scala.inline
    implicit class ChevronUpCircleSmallPropsMutableBuilder[Self <: ChevronUpCircleSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronUpCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronUpCircleSmallMod.foo` */
  override def _to: SFC[ChevronUpCircleSmallProps] = default
}
