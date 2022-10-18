package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsDoubleChevronLeftLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/DoubleChevronLeftLarge", JSImport.Default)
  @js.native
  val default: FC[DoubleChevronLeftLargeProps] = js.native
  
  trait DoubleChevronLeftLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DoubleChevronLeftLargeProps {
    
    inline def apply(): DoubleChevronLeftLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleChevronLeftLargeProps]
    }
    
    extension [Self <: DoubleChevronLeftLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DoubleChevronLeftLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsDoubleChevronLeftLargeMod.foo` */
  override def _to: FC[DoubleChevronLeftLargeProps] = default
}
