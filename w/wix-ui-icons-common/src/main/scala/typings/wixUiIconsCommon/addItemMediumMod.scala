package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addItemMediumMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/AddItemMedium", JSImport.Default)
  @js.native
  val default: SFC[AddItemMediumProps] = js.native
  
  @js.native
  trait AddItemMediumProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AddItemMediumProps {
    
    @scala.inline
    def apply(): AddItemMediumProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddItemMediumProps]
    }
    
    @scala.inline
    implicit class AddItemMediumPropsMutableBuilder[Self <: AddItemMediumProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AddItemMediumProps]
  
  /* This means you don't have to write `default`, but can instead just say `addItemMediumMod.foo` */
  override def _to: SFC[AddItemMediumProps] = default
}
