package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vignetteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Vignette", JSImport.Default)
  @js.native
  val default: SFC[VignetteProps] = js.native
  
  @js.native
  trait VignetteProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VignetteProps {
    
    @scala.inline
    def apply(): VignetteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VignetteProps]
    }
    
    @scala.inline
    implicit class VignettePropsMutableBuilder[Self <: VignetteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[VignetteProps]
  
  /* This means you don't have to write `default`, but can instead just say `vignetteMod.foo` */
  override def _to: SFC[VignetteProps] = default
}
