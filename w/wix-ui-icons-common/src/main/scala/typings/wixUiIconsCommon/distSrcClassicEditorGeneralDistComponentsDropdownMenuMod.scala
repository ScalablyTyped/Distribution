package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsDropdownMenuMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/DropdownMenu", JSImport.Default)
  @js.native
  val default: FC[DropdownMenuProps] = js.native
  
  trait DropdownMenuProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DropdownMenuProps {
    
    inline def apply(): DropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    extension [Self <: DropdownMenuProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DropdownMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsDropdownMenuMod.foo` */
  override def _to: FC[DropdownMenuProps] = default
}
