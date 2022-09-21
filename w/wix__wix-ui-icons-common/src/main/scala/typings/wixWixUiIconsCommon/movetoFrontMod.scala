package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object movetoFrontMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/MovetoFront", JSImport.Default)
  @js.native
  val default: FC[MovetoFrontProps] = js.native
  
  trait MovetoFrontProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MovetoFrontProps {
    
    inline def apply(): MovetoFrontProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MovetoFrontProps]
    }
    
    extension [Self <: MovetoFrontProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MovetoFrontProps]
  
  /* This means you don't have to write `default`, but can instead just say `movetoFrontMod.foo` */
  override def _to: FC[MovetoFrontProps] = default
}
