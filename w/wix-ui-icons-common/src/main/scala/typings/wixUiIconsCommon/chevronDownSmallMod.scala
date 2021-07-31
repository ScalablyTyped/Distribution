package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronDownSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronDownSmall", JSImport.Default)
  @js.native
  val default: SFC[ChevronDownSmallProps] = js.native
  
  trait ChevronDownSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronDownSmallProps {
    
    @scala.inline
    def apply(): ChevronDownSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronDownSmallProps]
    }
    
    @scala.inline
    implicit class ChevronDownSmallPropsMutableBuilder[Self <: ChevronDownSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronDownSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronDownSmallMod.foo` */
  override def _to: SFC[ChevronDownSmallProps] = default
}
