package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsChevronLeftXSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/ChevronLeftXSmall", JSImport.Default)
  @js.native
  val default: FC[ChevronLeftXSmallProps] = js.native
  
  trait ChevronLeftXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronLeftXSmallProps {
    
    inline def apply(): ChevronLeftXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronLeftXSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChevronLeftXSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronLeftXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsChevronLeftXSmallMod.foo` */
  override def _to: FC[ChevronLeftXSmallProps] = default
}
