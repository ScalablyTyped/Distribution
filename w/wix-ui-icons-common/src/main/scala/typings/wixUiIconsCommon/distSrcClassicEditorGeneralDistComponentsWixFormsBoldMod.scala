package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsWixFormsBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/WixFormsBold", JSImport.Default)
  @js.native
  val default: FC[WixFormsBoldProps] = js.native
  
  trait WixFormsBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixFormsBoldProps {
    
    inline def apply(): WixFormsBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsBoldProps]
    }
    
    extension [Self <: WixFormsBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixFormsBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsWixFormsBoldMod.foo` */
  override def _to: FC[WixFormsBoldProps] = default
}
