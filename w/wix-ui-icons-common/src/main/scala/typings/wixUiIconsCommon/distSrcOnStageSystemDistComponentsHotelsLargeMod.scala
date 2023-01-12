package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsHotelsLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/HotelsLarge", JSImport.Default)
  @js.native
  val default: FC[HotelsLargeProps] = js.native
  
  trait HotelsLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HotelsLargeProps {
    
    inline def apply(): HotelsLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HotelsLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HotelsLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HotelsLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsHotelsLargeMod.foo` */
  override def _to: FC[HotelsLargeProps] = default
}
