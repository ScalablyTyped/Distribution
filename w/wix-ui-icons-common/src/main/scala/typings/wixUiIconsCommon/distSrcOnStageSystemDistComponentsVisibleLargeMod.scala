package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsVisibleLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/VisibleLarge", JSImport.Default)
  @js.native
  val default: FC[VisibleLargeProps] = js.native
  
  trait VisibleLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VisibleLargeProps {
    
    inline def apply(): VisibleLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibleLargeProps]
    }
    
    extension [Self <: VisibleLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VisibleLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsVisibleLargeMod.foo` */
  override def _to: FC[VisibleLargeProps] = default
}
