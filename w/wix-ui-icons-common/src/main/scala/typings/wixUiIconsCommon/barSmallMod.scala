package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BarSmall", JSImport.Default)
  @js.native
  val default: FC[BarSmallProps] = js.native
  
  trait BarSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BarSmallProps {
    
    inline def apply(): BarSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarSmallProps]
    }
    
    extension [Self <: BarSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BarSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `barSmallMod.foo` */
  override def _to: FC[BarSmallProps] = default
}
