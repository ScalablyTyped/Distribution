package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveBackwardMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/MoveBackward", JSImport.Default)
  @js.native
  val default: FC[MoveBackwardProps] = js.native
  
  trait MoveBackwardProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoveBackwardProps {
    
    inline def apply(): MoveBackwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveBackwardProps]
    }
    
    extension [Self <: MoveBackwardProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoveBackwardProps]
  
  /* This means you don't have to write `default`, but can instead just say `moveBackwardMod.foo` */
  override def _to: FC[MoveBackwardProps] = default
}
