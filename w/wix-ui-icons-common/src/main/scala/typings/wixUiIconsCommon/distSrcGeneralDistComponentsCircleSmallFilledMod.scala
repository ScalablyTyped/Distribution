package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsCircleSmallFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CircleSmallFilled", JSImport.Default)
  @js.native
  val default: FC[CircleSmallFilledProps] = js.native
  
  trait CircleSmallFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CircleSmallFilledProps {
    
    inline def apply(): CircleSmallFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleSmallFilledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircleSmallFilledProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CircleSmallFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsCircleSmallFilledMod.foo` */
  override def _to: FC[CircleSmallFilledProps] = default
}
