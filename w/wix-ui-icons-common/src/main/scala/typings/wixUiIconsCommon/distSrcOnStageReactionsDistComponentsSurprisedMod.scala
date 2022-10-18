package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageReactionsDistComponentsSurprisedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/reactions/dist/components/Surprised", JSImport.Default)
  @js.native
  val default: FC[SurprisedProps] = js.native
  
  trait SurprisedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SurprisedProps {
    
    inline def apply(): SurprisedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SurprisedProps]
    }
    
    extension [Self <: SurprisedProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SurprisedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageReactionsDistComponentsSurprisedMod.foo` */
  override def _to: FC[SurprisedProps] = default
}
