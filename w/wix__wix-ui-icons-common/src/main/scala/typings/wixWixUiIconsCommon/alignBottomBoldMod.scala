package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignBottomBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/AlignBottomBold", JSImport.Default)
  @js.native
  val default: FC[AlignBottomBoldProps] = js.native
  
  trait AlignBottomBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignBottomBoldProps {
    
    inline def apply(): AlignBottomBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignBottomBoldProps]
    }
    
    extension [Self <: AlignBottomBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignBottomBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignBottomBoldMod.foo` */
  override def _to: FC[AlignBottomBoldProps] = default
}
