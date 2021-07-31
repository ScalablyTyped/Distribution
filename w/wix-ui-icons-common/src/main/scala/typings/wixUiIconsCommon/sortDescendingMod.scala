package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortDescendingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortDescending", JSImport.Default)
  @js.native
  val default: SFC[SortDescendingProps] = js.native
  
  trait SortDescendingProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SortDescendingProps {
    
    @scala.inline
    def apply(): SortDescendingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortDescendingProps]
    }
    
    @scala.inline
    implicit class SortDescendingPropsMutableBuilder[Self <: SortDescendingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SortDescendingProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortDescendingMod.foo` */
  override def _to: SFC[SortDescendingProps] = default
}
