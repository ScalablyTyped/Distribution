package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowUpBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ArrowUpBold", JSImport.Default)
  @js.native
  val default: FC[ArrowUpBoldProps] = js.native
  
  trait ArrowUpBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowUpBoldProps {
    
    inline def apply(): ArrowUpBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowUpBoldProps]
    }
    
    extension [Self <: ArrowUpBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowUpBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowUpBoldMod.foo` */
  override def _to: FC[ArrowUpBoldProps] = default
}
