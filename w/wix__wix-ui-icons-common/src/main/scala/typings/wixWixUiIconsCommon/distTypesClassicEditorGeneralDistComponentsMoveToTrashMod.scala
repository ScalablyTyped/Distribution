package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsMoveToTrashMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/MoveToTrash", JSImport.Default)
  @js.native
  val default: FC[MoveToTrashProps] = js.native
  
  trait MoveToTrashProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoveToTrashProps {
    
    inline def apply(): MoveToTrashProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveToTrashProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoveToTrashProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoveToTrashProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsMoveToTrashMod.foo` */
  override def _to: FC[MoveToTrashProps] = default
}
