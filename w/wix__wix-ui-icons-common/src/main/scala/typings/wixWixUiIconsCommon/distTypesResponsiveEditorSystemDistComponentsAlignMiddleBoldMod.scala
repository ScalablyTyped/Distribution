package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsAlignMiddleBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/AlignMiddleBold", JSImport.Default)
  @js.native
  val default: FC[AlignMiddleBoldProps] = js.native
  
  trait AlignMiddleBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignMiddleBoldProps {
    
    inline def apply(): AlignMiddleBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignMiddleBoldProps]
    }
    
    extension [Self <: AlignMiddleBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignMiddleBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsAlignMiddleBoldMod.foo` */
  override def _to: FC[AlignMiddleBoldProps] = default
}
