package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronLeftLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronLeftLarge", JSImport.Default)
  @js.native
  val default: SFC[ChevronLeftLargeProps] = js.native
  
  @js.native
  trait ChevronLeftLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronLeftLargeProps {
    
    @scala.inline
    def apply(): ChevronLeftLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronLeftLargeProps]
    }
    
    @scala.inline
    implicit class ChevronLeftLargePropsMutableBuilder[Self <: ChevronLeftLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronLeftLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronLeftLargeMod.foo` */
  override def _to: SFC[ChevronLeftLargeProps] = default
}
