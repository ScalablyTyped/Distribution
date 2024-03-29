package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsDoubleChevronRightLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/DoubleChevronRightLarge", JSImport.Default)
  @js.native
  val default: FC[DoubleChevronRightLargeProps] = js.native
  
  trait DoubleChevronRightLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DoubleChevronRightLargeProps {
    
    inline def apply(): DoubleChevronRightLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleChevronRightLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoubleChevronRightLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DoubleChevronRightLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsDoubleChevronRightLargeMod.foo` */
  override def _to: FC[DoubleChevronRightLargeProps] = default
}
