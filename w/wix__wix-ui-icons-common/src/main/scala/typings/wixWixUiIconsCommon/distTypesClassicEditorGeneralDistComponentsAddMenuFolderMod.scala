package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsAddMenuFolderMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/AddMenuFolder", JSImport.Default)
  @js.native
  val default: FC[AddMenuFolderProps] = js.native
  
  trait AddMenuFolderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddMenuFolderProps {
    
    inline def apply(): AddMenuFolderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddMenuFolderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddMenuFolderProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddMenuFolderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsAddMenuFolderMod.foo` */
  override def _to: FC[AddMenuFolderProps] = default
}
