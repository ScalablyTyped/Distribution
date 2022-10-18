package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsImageFilterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/ImageFilter", JSImport.Default)
  @js.native
  val default: FC[ImageFilterProps] = js.native
  
  trait ImageFilterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ImageFilterProps {
    
    inline def apply(): ImageFilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageFilterProps]
    }
    
    extension [Self <: ImageFilterProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ImageFilterProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsImageFilterMod.foo` */
  override def _to: FC[ImageFilterProps] = default
}
