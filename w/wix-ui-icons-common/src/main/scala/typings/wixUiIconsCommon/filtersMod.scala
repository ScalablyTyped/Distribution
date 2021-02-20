package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filtersMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Filters", JSImport.Default)
  @js.native
  val default: SFC[FiltersProps] = js.native
  
  @js.native
  trait FiltersProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FiltersProps {
    
    @scala.inline
    def apply(): FiltersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FiltersProps]
    }
    
    @scala.inline
    implicit class FiltersPropsMutableBuilder[Self <: FiltersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FiltersProps]
  
  /* This means you don't have to write `default`, but can instead just say `filtersMod.foo` */
  override def _to: SFC[FiltersProps] = default
}
