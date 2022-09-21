package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleSmallFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CircleSmallFilledSmall", JSImport.Default)
  @js.native
  val default: FC[CircleSmallFilledSmallProps] = js.native
  
  trait CircleSmallFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CircleSmallFilledSmallProps {
    
    inline def apply(): CircleSmallFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleSmallFilledSmallProps]
    }
    
    extension [Self <: CircleSmallFilledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CircleSmallFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleSmallFilledSmallMod.foo` */
  override def _to: FC[CircleSmallFilledSmallProps] = default
}
