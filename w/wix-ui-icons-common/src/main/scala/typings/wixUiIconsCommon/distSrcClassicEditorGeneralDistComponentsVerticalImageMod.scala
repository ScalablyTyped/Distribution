package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsVerticalImageMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/VerticalImage", JSImport.Default)
  @js.native
  val default: FC[VerticalImageProps] = js.native
  
  trait VerticalImageProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VerticalImageProps {
    
    inline def apply(): VerticalImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalImageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerticalImageProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VerticalImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsVerticalImageMod.foo` */
  override def _to: FC[VerticalImageProps] = default
}
