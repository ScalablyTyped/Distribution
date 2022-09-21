package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backwardSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BackwardSmall", JSImport.Default)
  @js.native
  val default: FC[BackwardSmallProps] = js.native
  
  trait BackwardSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BackwardSmallProps {
    
    inline def apply(): BackwardSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackwardSmallProps]
    }
    
    extension [Self <: BackwardSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BackwardSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `backwardSmallMod.foo` */
  override def _to: FC[BackwardSmallProps] = default
}
