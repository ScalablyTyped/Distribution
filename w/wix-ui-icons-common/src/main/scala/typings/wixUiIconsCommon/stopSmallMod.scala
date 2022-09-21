package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stopSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StopSmall", JSImport.Default)
  @js.native
  val default: FC[StopSmallProps] = js.native
  
  trait StopSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StopSmallProps {
    
    inline def apply(): StopSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopSmallProps]
    }
    
    extension [Self <: StopSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StopSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `stopSmallMod.foo` */
  override def _to: FC[StopSmallProps] = default
}
