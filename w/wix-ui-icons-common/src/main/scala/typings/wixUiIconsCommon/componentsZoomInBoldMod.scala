package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsZoomInBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ZoomInBold", JSImport.Default)
  @js.native
  val default: FC[ZoomInBoldProps] = js.native
  
  trait ZoomInBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ZoomInBoldProps {
    
    inline def apply(): ZoomInBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomInBoldProps]
    }
    
    extension [Self <: ZoomInBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ZoomInBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsZoomInBoldMod.foo` */
  override def _to: FC[ZoomInBoldProps] = default
}
