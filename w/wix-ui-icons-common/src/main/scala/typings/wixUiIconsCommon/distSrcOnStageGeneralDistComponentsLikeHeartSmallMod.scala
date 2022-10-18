package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsLikeHeartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/LikeHeartSmall", JSImport.Default)
  @js.native
  val default: FC[LikeHeartSmallProps] = js.native
  
  trait LikeHeartSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LikeHeartSmallProps {
    
    inline def apply(): LikeHeartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LikeHeartSmallProps]
    }
    
    extension [Self <: LikeHeartSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LikeHeartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsLikeHeartSmallMod.foo` */
  override def _to: FC[LikeHeartSmallProps] = default
}
