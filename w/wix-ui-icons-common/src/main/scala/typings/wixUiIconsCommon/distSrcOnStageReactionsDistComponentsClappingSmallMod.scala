package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageReactionsDistComponentsClappingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/reactions/dist/components/ClappingSmall", JSImport.Default)
  @js.native
  val default: FC[ClappingSmallProps] = js.native
  
  trait ClappingSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ClappingSmallProps {
    
    inline def apply(): ClappingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClappingSmallProps]
    }
    
    extension [Self <: ClappingSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ClappingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageReactionsDistComponentsClappingSmallMod.foo` */
  override def _to: FC[ClappingSmallProps] = default
}
