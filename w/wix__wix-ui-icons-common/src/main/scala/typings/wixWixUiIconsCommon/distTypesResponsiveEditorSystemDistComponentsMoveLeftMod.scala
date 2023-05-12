package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsMoveLeftMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/MoveLeft", JSImport.Default)
  @js.native
  val default: FC[MoveLeftProps] = js.native
  
  trait MoveLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoveLeftProps {
    
    inline def apply(): MoveLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveLeftProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoveLeftProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoveLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsMoveLeftMod.foo` */
  override def _to: FC[MoveLeftProps] = default
}
