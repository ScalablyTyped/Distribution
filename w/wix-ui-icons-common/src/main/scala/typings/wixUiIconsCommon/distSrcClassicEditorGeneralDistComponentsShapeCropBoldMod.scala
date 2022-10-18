package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsShapeCropBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ShapeCropBold", JSImport.Default)
  @js.native
  val default: FC[ShapeCropBoldProps] = js.native
  
  trait ShapeCropBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShapeCropBoldProps {
    
    inline def apply(): ShapeCropBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeCropBoldProps]
    }
    
    extension [Self <: ShapeCropBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShapeCropBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsShapeCropBoldMod.foo` */
  override def _to: FC[ShapeCropBoldProps] = default
}
