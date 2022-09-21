package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reelsFillMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/ReelsFill", JSImport.Default)
  @js.native
  val default: FC[ReelsFillProps] = js.native
  
  trait ReelsFillProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ReelsFillProps {
    
    inline def apply(): ReelsFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReelsFillProps]
    }
    
    extension [Self <: ReelsFillProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ReelsFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `reelsFillMod.foo` */
  override def _to: FC[ReelsFillProps] = default
}
