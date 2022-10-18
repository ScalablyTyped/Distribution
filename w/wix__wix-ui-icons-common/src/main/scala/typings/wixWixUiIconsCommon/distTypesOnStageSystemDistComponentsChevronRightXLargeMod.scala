package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsChevronRightXLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/ChevronRightXLarge", JSImport.Default)
  @js.native
  val default: FC[ChevronRightXLargeProps] = js.native
  
  trait ChevronRightXLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronRightXLargeProps {
    
    inline def apply(): ChevronRightXLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightXLargeProps]
    }
    
    extension [Self <: ChevronRightXLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronRightXLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsChevronRightXLargeMod.foo` */
  override def _to: FC[ChevronRightXLargeProps] = default
}
