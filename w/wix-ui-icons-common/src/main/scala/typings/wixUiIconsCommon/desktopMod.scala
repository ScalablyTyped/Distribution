package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object desktopMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Desktop", JSImport.Default)
  @js.native
  val default: SFC[DesktopProps] = js.native
  
  @js.native
  trait DesktopProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DesktopProps {
    
    @scala.inline
    def apply(): DesktopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DesktopProps]
    }
    
    @scala.inline
    implicit class DesktopPropsMutableBuilder[Self <: DesktopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DesktopProps]
  
  /* This means you don't have to write `default`, but can instead just say `desktopMod.foo` */
  override def _to: SFC[DesktopProps] = default
}
