package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleSmallFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CircleSmallFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[CircleSmallFilledSmallProps] = js.native
  
  @js.native
  trait CircleSmallFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CircleSmallFilledSmallProps {
    
    @scala.inline
    def apply(): CircleSmallFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleSmallFilledSmallProps]
    }
    
    @scala.inline
    implicit class CircleSmallFilledSmallPropsMutableBuilder[Self <: CircleSmallFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CircleSmallFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleSmallFilledSmallMod.foo` */
  override def _to: SFC[CircleSmallFilledSmallProps] = default
}
