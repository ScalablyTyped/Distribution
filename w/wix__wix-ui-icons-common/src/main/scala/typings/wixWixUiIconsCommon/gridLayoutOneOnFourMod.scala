package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridLayoutOneOnFourMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutOneOnFour", JSImport.Default)
  @js.native
  val default: FC[GridLayoutOneOnFourProps] = js.native
  
  trait GridLayoutOneOnFourProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutOneOnFourProps {
    
    inline def apply(): GridLayoutOneOnFourProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutOneOnFourProps]
    }
    
    extension [Self <: GridLayoutOneOnFourProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutOneOnFourProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridLayoutOneOnFourMod.foo` */
  override def _to: FC[GridLayoutOneOnFourProps] = default
}
