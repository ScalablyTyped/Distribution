package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsErrorLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/ErrorLarge", JSImport.Default)
  @js.native
  val default: FC[ErrorLargeProps] = js.native
  
  trait ErrorLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ErrorLargeProps {
    
    inline def apply(): ErrorLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorLargeProps]
    }
    
    extension [Self <: ErrorLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ErrorLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsErrorLargeMod.foo` */
  override def _to: FC[ErrorLargeProps] = default
}
