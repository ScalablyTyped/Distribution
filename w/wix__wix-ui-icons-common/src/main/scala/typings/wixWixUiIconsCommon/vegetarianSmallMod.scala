package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vegetarianSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/VegetarianSmall", JSImport.Default)
  @js.native
  val default: FC[VegetarianSmallProps] = js.native
  
  trait VegetarianSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VegetarianSmallProps {
    
    inline def apply(): VegetarianSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VegetarianSmallProps]
    }
    
    extension [Self <: VegetarianSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VegetarianSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `vegetarianSmallMod.foo` */
  override def _to: FC[VegetarianSmallProps] = default
}
