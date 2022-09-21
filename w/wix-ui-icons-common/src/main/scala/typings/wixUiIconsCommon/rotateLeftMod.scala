package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RotateLeft", JSImport.Default)
  @js.native
  val default: FC[RotateLeftProps] = js.native
  
  trait RotateLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RotateLeftProps {
    
    inline def apply(): RotateLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateLeftProps]
    }
    
    extension [Self <: RotateLeftProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RotateLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `rotateLeftMod.foo` */
  override def _to: FC[RotateLeftProps] = default
}
