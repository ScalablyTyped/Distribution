package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsChevronLeftLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronLeftLarge", JSImport.Default)
  @js.native
  val default: FC[ChevronLeftLargeProps] = js.native
  
  trait ChevronLeftLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronLeftLargeProps {
    
    inline def apply(): ChevronLeftLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronLeftLargeProps]
    }
    
    extension [Self <: ChevronLeftLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronLeftLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsChevronLeftLargeMod.foo` */
  override def _to: FC[ChevronLeftLargeProps] = default
}
