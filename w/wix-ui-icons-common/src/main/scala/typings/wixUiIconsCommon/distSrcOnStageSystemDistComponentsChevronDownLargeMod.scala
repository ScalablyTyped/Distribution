package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsChevronDownLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/ChevronDownLarge", JSImport.Default)
  @js.native
  val default: FC[ChevronDownLargeProps] = js.native
  
  trait ChevronDownLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronDownLargeProps {
    
    inline def apply(): ChevronDownLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronDownLargeProps]
    }
    
    extension [Self <: ChevronDownLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronDownLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsChevronDownLargeMod.foo` */
  override def _to: FC[ChevronDownLargeProps] = default
}
