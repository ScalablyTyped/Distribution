package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsChevronRightLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/ChevronRightLarge", JSImport.Default)
  @js.native
  val default: FC[ChevronRightLargeProps] = js.native
  
  trait ChevronRightLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronRightLargeProps {
    
    inline def apply(): ChevronRightLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightLargeProps]
    }
    
    extension [Self <: ChevronRightLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronRightLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsChevronRightLargeMod.foo` */
  override def _to: FC[ChevronRightLargeProps] = default
}
