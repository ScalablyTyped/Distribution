package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsChevronLeftCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronLeftCircleSmall", JSImport.Default)
  @js.native
  val default: FC[ChevronLeftCircleSmallProps] = js.native
  
  trait ChevronLeftCircleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronLeftCircleSmallProps {
    
    inline def apply(): ChevronLeftCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronLeftCircleSmallProps]
    }
    
    extension [Self <: ChevronLeftCircleSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronLeftCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsChevronLeftCircleSmallMod.foo` */
  override def _to: FC[ChevronLeftCircleSmallProps] = default
}
