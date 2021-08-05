package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronRightCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronRightCircle", JSImport.Default)
  @js.native
  val default: SFC[ChevronRightCircleProps] = js.native
  
  trait ChevronRightCircleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronRightCircleProps {
    
    inline def apply(): ChevronRightCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightCircleProps]
    }
    
    extension [Self <: ChevronRightCircleProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronRightCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronRightCircleMod.foo` */
  override def _to: SFC[ChevronRightCircleProps] = default
}
