package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortAscendingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortAscendingSmall", JSImport.Default)
  @js.native
  val default: SFC[SortAscendingSmallProps] = js.native
  
  trait SortAscendingSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SortAscendingSmallProps {
    
    @scala.inline
    def apply(): SortAscendingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortAscendingSmallProps]
    }
    
    @scala.inline
    implicit class SortAscendingSmallPropsMutableBuilder[Self <: SortAscendingSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SortAscendingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortAscendingSmallMod.foo` */
  override def _to: SFC[SortAscendingSmallProps] = default
}
