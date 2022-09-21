package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowDownBoldSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ArrowDownBoldSmall", JSImport.Default)
  @js.native
  val default: FC[ArrowDownBoldSmallProps] = js.native
  
  trait ArrowDownBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowDownBoldSmallProps {
    
    inline def apply(): ArrowDownBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownBoldSmallProps]
    }
    
    extension [Self <: ArrowDownBoldSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowDownBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowDownBoldSmallMod.foo` */
  override def _to: FC[ArrowDownBoldSmallProps] = default
}
