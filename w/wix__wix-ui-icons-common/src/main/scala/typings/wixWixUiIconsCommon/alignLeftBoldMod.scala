package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignLeftBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/AlignLeftBold", JSImport.Default)
  @js.native
  val default: FC[AlignLeftBoldProps] = js.native
  
  trait AlignLeftBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignLeftBoldProps {
    
    inline def apply(): AlignLeftBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignLeftBoldProps]
    }
    
    extension [Self <: AlignLeftBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignLeftBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignLeftBoldMod.foo` */
  override def _to: FC[AlignLeftBoldProps] = default
}
