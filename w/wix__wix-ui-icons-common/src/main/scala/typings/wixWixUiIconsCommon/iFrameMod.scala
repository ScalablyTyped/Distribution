package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iFrameMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/iFrame", JSImport.Default)
  @js.native
  val default: FC[iFrameProps] = js.native
  
  type _To = FC[iFrameProps]
  
  /* This means you don't have to write `default`, but can instead just say `iFrameMod.foo` */
  override def _to: FC[iFrameProps] = default
  
  trait iFrameProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object iFrameProps {
    
    inline def apply(): iFrameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[iFrameProps]
    }
    
    extension [Self <: iFrameProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
