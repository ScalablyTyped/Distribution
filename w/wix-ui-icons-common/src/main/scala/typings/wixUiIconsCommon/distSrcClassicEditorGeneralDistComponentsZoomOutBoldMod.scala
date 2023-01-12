package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsZoomOutBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ZoomOutBold", JSImport.Default)
  @js.native
  val default: FC[ZoomOutBoldProps] = js.native
  
  trait ZoomOutBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ZoomOutBoldProps {
    
    inline def apply(): ZoomOutBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOutBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomOutBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ZoomOutBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsZoomOutBoldMod.foo` */
  override def _to: FC[ZoomOutBoldProps] = default
}
