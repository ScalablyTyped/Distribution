package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HiddenSmall", JSImport.Default)
  @js.native
  val default: SFC[HiddenSmallProps] = js.native
  
  @js.native
  trait HiddenSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HiddenSmallProps {
    
    @scala.inline
    def apply(): HiddenSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenSmallProps]
    }
    
    @scala.inline
    implicit class HiddenSmallPropsMutableBuilder[Self <: HiddenSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HiddenSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenSmallMod.foo` */
  override def _to: SFC[HiddenSmallProps] = default
}
