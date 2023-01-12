package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFolderMoveSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FolderMoveSmall", JSImport.Default)
  @js.native
  val default: FC[FolderMoveSmallProps] = js.native
  
  trait FolderMoveSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FolderMoveSmallProps {
    
    inline def apply(): FolderMoveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderMoveSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FolderMoveSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FolderMoveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFolderMoveSmallMod.foo` */
  override def _to: FC[FolderMoveSmallProps] = default
}
