package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsMoveBackwardBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/MoveBackwardBold", JSImport.Default)
  @js.native
  val default: FC[MoveBackwardBoldProps] = js.native
  
  trait MoveBackwardBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoveBackwardBoldProps {
    
    inline def apply(): MoveBackwardBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveBackwardBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoveBackwardBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoveBackwardBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsMoveBackwardBoldMod.foo` */
  override def _to: FC[MoveBackwardBoldProps] = default
}
