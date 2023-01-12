package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsZoomInBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ZoomInBold", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomInBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ZoomInBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsZoomInBoldMod.foo` */
  override def _to: FC[ZoomInBoldProps] = default
}
