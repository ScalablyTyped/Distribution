package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsTextLtrIncreaseMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/TextLtrIncrease", JSImport.Default)
  @js.native
  val default: FC[TextLtrIncreaseProps] = js.native
  
  trait TextLtrIncreaseProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextLtrIncreaseProps {
    
    inline def apply(): TextLtrIncreaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextLtrIncreaseProps]
    }
    
    extension [Self <: TextLtrIncreaseProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextLtrIncreaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsTextLtrIncreaseMod.foo` */
  override def _to: FC[TextLtrIncreaseProps] = default
}
