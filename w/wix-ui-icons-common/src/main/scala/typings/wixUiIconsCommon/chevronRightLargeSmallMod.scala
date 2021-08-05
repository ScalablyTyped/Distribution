package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronRightLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronRightLargeSmall", JSImport.Default)
  @js.native
  val default: SFC[ChevronRightLargeSmallProps] = js.native
  
  trait ChevronRightLargeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronRightLargeSmallProps {
    
    inline def apply(): ChevronRightLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightLargeSmallProps]
    }
    
    extension [Self <: ChevronRightLargeSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronRightLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronRightLargeSmallMod.foo` */
  override def _to: SFC[ChevronRightLargeSmallProps] = default
}
