package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CircleLargeSmall", JSImport.Default)
  @js.native
  val default: SFC[CircleLargeSmallProps] = js.native
  
  trait CircleLargeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CircleLargeSmallProps {
    
    @scala.inline
    def apply(): CircleLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleLargeSmallProps]
    }
    
    @scala.inline
    implicit class CircleLargeSmallPropsMutableBuilder[Self <: CircleLargeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CircleLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleLargeSmallMod.foo` */
  override def _to: SFC[CircleLargeSmallProps] = default
}
