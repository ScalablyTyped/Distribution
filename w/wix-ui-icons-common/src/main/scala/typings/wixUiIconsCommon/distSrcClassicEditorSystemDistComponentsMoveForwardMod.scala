package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsMoveForwardMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/MoveForward", JSImport.Default)
  @js.native
  val default: FC[MoveForwardProps] = js.native
  
  trait MoveForwardProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoveForwardProps {
    
    inline def apply(): MoveForwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveForwardProps]
    }
    
    extension [Self <: MoveForwardProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoveForwardProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsMoveForwardMod.foo` */
  override def _to: FC[MoveForwardProps] = default
}
