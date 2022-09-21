package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronUpCircleSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ChevronUpCircleSmall", JSImport.Default)
  @js.native
  val default: FC[ChevronUpCircleSmallProps] = js.native
  
  trait ChevronUpCircleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronUpCircleSmallProps {
    
    inline def apply(): ChevronUpCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpCircleSmallProps]
    }
    
    extension [Self <: ChevronUpCircleSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronUpCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronUpCircleSmallMod.foo` */
  override def _to: FC[ChevronUpCircleSmallProps] = default
}
