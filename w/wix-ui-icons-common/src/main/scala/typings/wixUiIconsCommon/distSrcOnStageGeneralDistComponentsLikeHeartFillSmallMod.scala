package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsLikeHeartFillSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/LikeHeartFillSmall", JSImport.Default)
  @js.native
  val default: FC[LikeHeartFillSmallProps] = js.native
  
  trait LikeHeartFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LikeHeartFillSmallProps {
    
    inline def apply(): LikeHeartFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LikeHeartFillSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LikeHeartFillSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LikeHeartFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsLikeHeartFillSmallMod.foo` */
  override def _to: FC[LikeHeartFillSmallProps] = default
}
