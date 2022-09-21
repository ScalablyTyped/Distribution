package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderMoveMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FolderMove", JSImport.Default)
  @js.native
  val default: FC[FolderMoveProps] = js.native
  
  trait FolderMoveProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FolderMoveProps {
    
    inline def apply(): FolderMoveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderMoveProps]
    }
    
    extension [Self <: FolderMoveProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FolderMoveProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderMoveMod.foo` */
  override def _to: FC[FolderMoveProps] = default
}
