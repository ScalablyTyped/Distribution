package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brightnessMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Brightness", JSImport.Default)
  @js.native
  val default: SFC[BrightnessProps] = js.native
  
  @js.native
  trait BrightnessProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BrightnessProps {
    
    @scala.inline
    def apply(): BrightnessProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrightnessProps]
    }
    
    @scala.inline
    implicit class BrightnessPropsMutableBuilder[Self <: BrightnessProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BrightnessProps]
  
  /* This means you don't have to write `default`, but can instead just say `brightnessMod.foo` */
  override def _to: SFC[BrightnessProps] = default
}
