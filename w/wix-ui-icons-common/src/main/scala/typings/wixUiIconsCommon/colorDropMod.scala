package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorDropMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ColorDrop", JSImport.Default)
  @js.native
  val default: SFC[ColorDropProps] = js.native
  
  @js.native
  trait ColorDropProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ColorDropProps {
    
    @scala.inline
    def apply(): ColorDropProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorDropProps]
    }
    
    @scala.inline
    implicit class ColorDropPropsMutableBuilder[Self <: ColorDropProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ColorDropProps]
  
  /* This means you don't have to write `default`, but can instead just say `colorDropMod.foo` */
  override def _to: SFC[ColorDropProps] = default
}
