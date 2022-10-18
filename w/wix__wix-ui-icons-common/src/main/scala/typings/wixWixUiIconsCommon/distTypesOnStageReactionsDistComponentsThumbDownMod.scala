package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageReactionsDistComponentsThumbDownMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/reactions/dist/components/ThumbDown", JSImport.Default)
  @js.native
  val default: FC[ThumbDownProps] = js.native
  
  trait ThumbDownProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ThumbDownProps {
    
    inline def apply(): ThumbDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbDownProps]
    }
    
    extension [Self <: ThumbDownProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ThumbDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageReactionsDistComponentsThumbDownMod.foo` */
  override def _to: FC[ThumbDownProps] = default
}
