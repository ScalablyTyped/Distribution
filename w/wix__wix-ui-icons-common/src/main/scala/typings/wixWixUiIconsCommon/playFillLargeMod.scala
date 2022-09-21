package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playFillLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/PlayFillLarge", JSImport.Default)
  @js.native
  val default: FC[PlayFillLargeProps] = js.native
  
  trait PlayFillLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PlayFillLargeProps {
    
    inline def apply(): PlayFillLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayFillLargeProps]
    }
    
    extension [Self <: PlayFillLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PlayFillLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `playFillLargeMod.foo` */
  override def _to: FC[PlayFillLargeProps] = default
}
