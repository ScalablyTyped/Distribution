package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsDoubleChevronRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/DoubleChevronRight", JSImport.Default)
  @js.native
  val default: FC[DoubleChevronRightProps] = js.native
  
  trait DoubleChevronRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DoubleChevronRightProps {
    
    inline def apply(): DoubleChevronRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleChevronRightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoubleChevronRightProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DoubleChevronRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsDoubleChevronRightMod.foo` */
  override def _to: FC[DoubleChevronRightProps] = default
}
