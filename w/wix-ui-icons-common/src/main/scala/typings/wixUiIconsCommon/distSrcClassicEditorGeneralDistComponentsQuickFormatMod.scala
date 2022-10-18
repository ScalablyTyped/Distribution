package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsQuickFormatMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/QuickFormat", JSImport.Default)
  @js.native
  val default: FC[QuickFormatProps] = js.native
  
  trait QuickFormatProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object QuickFormatProps {
    
    inline def apply(): QuickFormatProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickFormatProps]
    }
    
    extension [Self <: QuickFormatProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[QuickFormatProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsQuickFormatMod.foo` */
  override def _to: FC[QuickFormatProps] = default
}
