package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronDownLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronDownLarge", JSImport.Default)
  @js.native
  val default: SFC[ChevronDownLargeProps] = js.native
  
  trait ChevronDownLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronDownLargeProps {
    
    @scala.inline
    def apply(): ChevronDownLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronDownLargeProps]
    }
    
    @scala.inline
    implicit class ChevronDownLargePropsMutableBuilder[Self <: ChevronDownLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronDownLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronDownLargeMod.foo` */
  override def _to: SFC[ChevronDownLargeProps] = default
}
