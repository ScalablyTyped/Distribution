package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squareCornerSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SquareCornerSmall", JSImport.Default)
  @js.native
  val default: FC[SquareCornerSmallProps] = js.native
  
  trait SquareCornerSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SquareCornerSmallProps {
    
    inline def apply(): SquareCornerSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SquareCornerSmallProps]
    }
    
    extension [Self <: SquareCornerSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SquareCornerSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `squareCornerSmallMod.foo` */
  override def _to: FC[SquareCornerSmallProps] = default
}
