package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageReactionsDistComponentsSurprisedXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/reactions/dist/components/SurprisedXSmall", JSImport.Default)
  @js.native
  val default: FC[SurprisedXSmallProps] = js.native
  
  trait SurprisedXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SurprisedXSmallProps {
    
    inline def apply(): SurprisedXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SurprisedXSmallProps]
    }
    
    extension [Self <: SurprisedXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SurprisedXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageReactionsDistComponentsSurprisedXSmallMod.foo` */
  override def _to: FC[SurprisedXSmallProps] = default
}
