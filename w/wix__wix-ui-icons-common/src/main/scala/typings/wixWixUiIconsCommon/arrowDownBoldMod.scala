package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowDownBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ArrowDownBold", JSImport.Default)
  @js.native
  val default: FC[ArrowDownBoldProps] = js.native
  
  trait ArrowDownBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowDownBoldProps {
    
    inline def apply(): ArrowDownBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownBoldProps]
    }
    
    extension [Self <: ArrowDownBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowDownBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowDownBoldMod.foo` */
  override def _to: FC[ArrowDownBoldProps] = default
}
