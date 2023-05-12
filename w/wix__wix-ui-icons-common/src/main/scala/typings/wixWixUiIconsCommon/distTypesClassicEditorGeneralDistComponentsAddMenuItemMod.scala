package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsAddMenuItemMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/AddMenuItem", JSImport.Default)
  @js.native
  val default: FC[AddMenuItemProps] = js.native
  
  trait AddMenuItemProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddMenuItemProps {
    
    inline def apply(): AddMenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddMenuItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddMenuItemProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddMenuItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsAddMenuItemMod.foo` */
  override def _to: FC[AddMenuItemProps] = default
}
