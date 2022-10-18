package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsMoveForwardBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/MoveForwardBold", JSImport.Default)
  @js.native
  val default: FC[MoveForwardBoldProps] = js.native
  
  trait MoveForwardBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoveForwardBoldProps {
    
    inline def apply(): MoveForwardBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveForwardBoldProps]
    }
    
    extension [Self <: MoveForwardBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoveForwardBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsMoveForwardBoldMod.foo` */
  override def _to: FC[MoveForwardBoldProps] = default
}
