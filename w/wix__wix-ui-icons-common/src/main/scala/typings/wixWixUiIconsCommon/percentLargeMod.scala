package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object percentLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/PercentLarge", JSImport.Default)
  @js.native
  val default: FC[PercentLargeProps] = js.native
  
  trait PercentLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PercentLargeProps {
    
    inline def apply(): PercentLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PercentLargeProps]
    }
    
    extension [Self <: PercentLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PercentLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `percentLargeMod.foo` */
  override def _to: FC[PercentLargeProps] = default
}
