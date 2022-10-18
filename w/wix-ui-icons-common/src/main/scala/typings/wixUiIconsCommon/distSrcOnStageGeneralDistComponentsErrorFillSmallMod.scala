package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsErrorFillSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/ErrorFillSmall", JSImport.Default)
  @js.native
  val default: FC[ErrorFillSmallProps] = js.native
  
  trait ErrorFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ErrorFillSmallProps {
    
    inline def apply(): ErrorFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorFillSmallProps]
    }
    
    extension [Self <: ErrorFillSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ErrorFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsErrorFillSmallMod.foo` */
  override def _to: FC[ErrorFillSmallProps] = default
}
