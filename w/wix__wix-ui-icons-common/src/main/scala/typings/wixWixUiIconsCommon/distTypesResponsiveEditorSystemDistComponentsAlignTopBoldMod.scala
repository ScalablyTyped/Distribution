package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsAlignTopBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/AlignTopBold", JSImport.Default)
  @js.native
  val default: FC[AlignTopBoldProps] = js.native
  
  trait AlignTopBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignTopBoldProps {
    
    inline def apply(): AlignTopBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignTopBoldProps]
    }
    
    extension [Self <: AlignTopBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignTopBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsAlignTopBoldMod.foo` */
  override def _to: FC[AlignTopBoldProps] = default
}
