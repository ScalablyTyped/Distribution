package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsLikeHeartLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/LikeHeartLarge", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LikeHeartLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LikeHeartLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsLikeHeartLargeMod.foo` */
  override def _to: FC[LikeHeartLargeProps] = default
}
