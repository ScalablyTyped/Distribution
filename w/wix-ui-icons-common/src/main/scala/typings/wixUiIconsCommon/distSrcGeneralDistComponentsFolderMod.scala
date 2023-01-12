package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsFolderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Folder", JSImport.Default)
  @js.native
  val default: FC[FolderProps] = js.native
  
  trait FolderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FolderProps {
    
    inline def apply(): FolderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FolderProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FolderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsFolderMod.foo` */
  override def _to: FC[FolderProps] = default
}
