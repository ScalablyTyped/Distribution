package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignRightBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/AlignRightBold", JSImport.Default)
  @js.native
  val default: FC[AlignRightBoldProps] = js.native
  
  trait AlignRightBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignRightBoldProps {
    
    inline def apply(): AlignRightBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignRightBoldProps]
    }
    
    extension [Self <: AlignRightBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignRightBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignRightBoldMod.foo` */
  override def _to: FC[AlignRightBoldProps] = default
}
