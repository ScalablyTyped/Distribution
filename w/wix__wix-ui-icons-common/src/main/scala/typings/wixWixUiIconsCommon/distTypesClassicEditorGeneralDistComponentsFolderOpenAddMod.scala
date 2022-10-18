package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsFolderOpenAddMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/FolderOpenAdd", JSImport.Default)
  @js.native
  val default: FC[FolderOpenAddProps] = js.native
  
  trait FolderOpenAddProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FolderOpenAddProps {
    
    inline def apply(): FolderOpenAddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderOpenAddProps]
    }
    
    extension [Self <: FolderOpenAddProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FolderOpenAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsFolderOpenAddMod.foo` */
  override def _to: FC[FolderOpenAddProps] = default
}
