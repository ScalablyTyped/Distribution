package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageReactionsDistComponentsThumbUpXSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/reactions/dist/components/ThumbUpXSmall", JSImport.Default)
  @js.native
  val default: FC[ThumbUpXSmallProps] = js.native
  
  trait ThumbUpXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ThumbUpXSmallProps {
    
    inline def apply(): ThumbUpXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbUpXSmallProps]
    }
    
    extension [Self <: ThumbUpXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ThumbUpXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageReactionsDistComponentsThumbUpXSmallMod.foo` */
  override def _to: FC[ThumbUpXSmallProps] = default
}
