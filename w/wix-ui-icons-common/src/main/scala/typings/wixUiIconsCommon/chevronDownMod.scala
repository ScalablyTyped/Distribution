package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronDown", JSImport.Default)
  @js.native
  val default: SFC[ChevronDownProps] = js.native
  
  trait ChevronDownProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronDownProps {
    
    @scala.inline
    def apply(): ChevronDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronDownProps]
    }
    
    @scala.inline
    implicit class ChevronDownPropsMutableBuilder[Self <: ChevronDownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronDownMod.foo` */
  override def _to: SFC[ChevronDownProps] = default
}
