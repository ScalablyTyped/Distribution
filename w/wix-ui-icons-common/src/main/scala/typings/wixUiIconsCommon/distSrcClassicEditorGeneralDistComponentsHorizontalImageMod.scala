package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsHorizontalImageMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/HorizontalImage", JSImport.Default)
  @js.native
  val default: FC[HorizontalImageProps] = js.native
  
  trait HorizontalImageProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HorizontalImageProps {
    
    inline def apply(): HorizontalImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalImageProps]
    }
    
    extension [Self <: HorizontalImageProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HorizontalImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsHorizontalImageMod.foo` */
  override def _to: FC[HorizontalImageProps] = default
}
