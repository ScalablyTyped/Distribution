package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object likeHeartLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/LikeHeartLarge", JSImport.Default)
  @js.native
  val default: FC[LikeHeartLargeProps] = js.native
  
  trait LikeHeartLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LikeHeartLargeProps {
    
    inline def apply(): LikeHeartLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LikeHeartLargeProps]
    }
    
    extension [Self <: LikeHeartLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LikeHeartLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `likeHeartLargeMod.foo` */
  override def _to: FC[LikeHeartLargeProps] = default
}
