package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlaySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OverlaySmall", JSImport.Default)
  @js.native
  val default: SFC[OverlaySmallProps] = js.native
  
  trait OverlaySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object OverlaySmallProps {
    
    @scala.inline
    def apply(): OverlaySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlaySmallProps]
    }
    
    @scala.inline
    implicit class OverlaySmallPropsMutableBuilder[Self <: OverlaySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[OverlaySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `overlaySmallMod.foo` */
  override def _to: SFC[OverlaySmallProps] = default
}
