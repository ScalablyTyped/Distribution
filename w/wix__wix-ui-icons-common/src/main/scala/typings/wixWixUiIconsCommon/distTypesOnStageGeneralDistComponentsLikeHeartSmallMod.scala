package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsLikeHeartSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/LikeHeartSmall", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LikeHeartSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LikeHeartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsLikeHeartSmallMod.foo` */
  override def _to: FC[LikeHeartSmallProps] = default
}
