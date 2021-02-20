package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stopFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StopFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[StopFilledSmallProps] = js.native
  
  @js.native
  trait StopFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StopFilledSmallProps {
    
    @scala.inline
    def apply(): StopFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopFilledSmallProps]
    }
    
    @scala.inline
    implicit class StopFilledSmallPropsMutableBuilder[Self <: StopFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StopFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `stopFilledSmallMod.foo` */
  override def _to: SFC[StopFilledSmallProps] = default
}
