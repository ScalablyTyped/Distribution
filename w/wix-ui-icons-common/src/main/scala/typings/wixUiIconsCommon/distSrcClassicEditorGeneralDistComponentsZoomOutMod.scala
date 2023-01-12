package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsZoomOutMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ZoomOut", JSImport.Default)
  @js.native
  val default: FC[ZoomOutProps] = js.native
  
  trait ZoomOutProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ZoomOutProps {
    
    inline def apply(): ZoomOutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomOutProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ZoomOutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsZoomOutMod.foo` */
  override def _to: FC[ZoomOutProps] = default
}
