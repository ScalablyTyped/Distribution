package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsMenuFolderMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/MenuFolder", JSImport.Default)
  @js.native
  val default: FC[MenuFolderProps] = js.native
  
  trait MenuFolderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MenuFolderProps {
    
    inline def apply(): MenuFolderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuFolderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuFolderProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MenuFolderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsMenuFolderMod.foo` */
  override def _to: FC[MenuFolderProps] = default
}
