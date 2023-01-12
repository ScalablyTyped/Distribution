package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsAddItemMediumMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/AddItemMedium", JSImport.Default)
  @js.native
  val default: FC[AddItemMediumProps] = js.native
  
  trait AddItemMediumProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddItemMediumProps {
    
    inline def apply(): AddItemMediumProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddItemMediumProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddItemMediumProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddItemMediumProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsAddItemMediumMod.foo` */
  override def _to: FC[AddItemMediumProps] = default
}
